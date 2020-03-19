package com.courses.module.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.courses.module.model.Categories;
import com.courses.module.model.Course;
import com.courses.module.model.Levels;
import com.courses.module.model.Videos;

@Repository
public class CourseDAO implements CourseDAOinterface{
	@Autowired
	 EntityManager em;
	@Override
	public List<Course> views(){
		List<Course> list=em.createQuery("from Course",Course.class).getResultList();
		return list;
}
	@Override
	public List<Levels> viewlevel() {
		List<Levels> list=em.createQuery("from Levels",Levels.class).getResultList();
		return list;
	}
	@Override
	public List<Categories> viewcategory() {
		List<Categories> list=em.createQuery("from Categories",Categories.class).getResultList();
		return list;
	}
	@Override
	public List<Videos> viewvideos() {
		List<Videos> list=em.createQuery("from Videos",Videos.class).getResultList();
		return list;
	}

    @Override
	public Course viewbyId(int id){
		/*
		 * Query
		 * query=em.createQuery("from Course c where c.id=:courseid",Course.class);
		 * query.setParameter("courseid",id);
		 *  List<Course> list=query.getResultList();
		 * return list;
		 */
    	return(em.find(Course.class, id));
}
    @Override
	public Videos viewvideobyId(int id) {
		return(em.find(Videos.class, id));
	}
	@Override
	public void insert(Course course) {
		if(!CollectionUtils.isEmpty(course.getTexts())) 
		{
		course.getTexts().forEach( textObj -> textObj.setCourses(course));
		}
		course.getCourseSubscribedVideoObj().forEach(videoobj->videoobj.setCourse(course));
		em.persist(course);
	}
	@Override
	public boolean isIdExists(int id) {
		Course cc=em.find(Course.class, id);
		if(cc==null)
			return false;
		else 
			return true;
	}
	@Override
	public boolean isActive(int id)
	{
		Course course=em.find(Course.class, id);
		if(course.isActive())
			return true;
		else
			return false;
	}

	@Override
	public String update(Course c) {
		System.out.println(c.getId());
		  if( em.merge(c) != null)
			  return "updated successfully";
		  else
			  return "updation failure";
	}

	@Override
	public void delete(int id) {
		Course c=em.find(Course.class, id);
		if(isIdExists(id))
	     {
		em.remove(c);
		System.out.println("deletion succesful");
	      }
	else {
		System.out.println("id doesnt exists");
	}
	}
	@Override
	@Transactional
	public boolean modifystatus(int id) {
		Course course=em.find(Course.class, id);
		if((isActive(id)))
	     {
		course.setActive(false);
		em.persist(course);
		return course.isActive();
	      }
	else {
		course.setActive(true);
		em.persist(course);
		return course.isActive();
	}
	}
	
	
}
