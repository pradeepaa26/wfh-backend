package com.courses.module.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.courses.module.DAO.CourseDAOinterface;
import com.courses.module.DTO.UpdateDTO;

import com.courses.module.model.Categories;
import com.courses.module.model.Course;
import com.courses.module.model.CourseSubscribedVideos;
import com.courses.module.model.Levels;
import com.courses.module.model.Videos;

@Service
public class CourseService {
    @Autowired
	private CourseDAOinterface dao;
	Course course=new Course();
	Levels level=new Levels();
	Categories category=new Categories();
	CourseSubscribedVideos subscribedvideos= new CourseSubscribedVideos();
	Videos videos=new Videos();
	@Transactional
	public List<Course> view() {
		return dao.views();
	}
	@Transactional
	public List<Levels> viewlevel() {
		return dao.viewlevel();
	}
public List<Categories> viewcategory() {
		
		return dao.viewcategory();
	}
	@Transactional
	public void insert(Course dto) {	
	    dao.insert(dto);
		
	}
	@Transactional
	public String update(UpdateDTO dto) {
		course.setId(dto.getId());
		course.setName(dto.getName());
		level.setId(dto.getLevel_id());
		course.setLevels(level);
		category.setId(dto.getCategory_id());
		course.setCategories(category);
		course.setSlug(dto.getSlug());
		course.setTag(dto.getTag());
		course.setLevelOverride(dto.isLevelOverride());
		course.setAvailable_for(dto.getAvailable_for());
		course.setMeta_desc(dto.getDescription());
		course.setMeta_key(dto.getMeta_key());
		course.setEnrollmentPoints(dto.getEnrollmentPoints());
		course.setCompletionPoints(dto.getCompletionPoints());
		course.setDescription(dto.getDescription());
		
		
		List<CourseSubscribedVideos> coursesubscribedvideo=new ArrayList<CourseSubscribedVideos>();
		for(int i=0;i<dto.getCourseSubscribedVideo().length;i++)
		{
		videos.setId(dto.getCourseSubscribedVideo()[i]);
		subscribedvideos.setVideos(videos);
		subscribedvideos.setCourse(course);
		coursesubscribedvideo.add(subscribedvideos);
		course.setCourseSubscribedVideoObj(coursesubscribedvideo);
		}
		coursesubscribedvideo.add(subscribedvideos);
		
		
		
		
		
		if(dao.isIdExists(dto.getId()))
		{
		 return dao.update(course);
	}
		else
		{
			return "id not found";
		}
	}
	@Transactional
	public void delete(int id) {
		if(dao.isIdExists(id))
		{
		 dao.delete(id);
	}
		else
		{
			System.out.println( "id doesnot found");
		}
	}
	@Transactional
	public Course viewbyId(int id) {
		if(dao.isIdExists(id))
			return dao.viewbyId(id);
		else
			return null;
	}
	public boolean modifystatus(int id) {
		if(dao.isIdExists(id))
		{
		  return dao.modifystatus(id);
	}
		else
		{
			return false;
		}
	}
	public List<Videos> viewvideos() {
		
		return dao.viewvideos();
	}
	public Videos viewvideosbyid(int id) {
	
		return dao.viewvideobyId(id);
	}
	
}
	
	