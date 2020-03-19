package com.courses.module.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.courses.module.DTO.UpdateDTO;

import com.courses.module.model.Categories;
import com.courses.module.model.Course;
import com.courses.module.model.Levels;
import com.courses.module.model.Videos;
import com.courses.module.services.CourseService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {

	@Autowired
	private CourseService service;

	@GetMapping(value="/view" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Course> viewCourse() {
		return service.view();
	}
	@GetMapping("/viewlevel")
	public List<Levels> viewLevel()
	{
		return service.viewlevel();
	}
	@GetMapping("/viewcategory")
	public List<Categories> viewCategory()
	{
		return service.viewcategory();
	}
	

	@GetMapping("/viewbyid/{id}")
	public Course  viewbyId(@PathVariable int id) {
		return service.viewbyId(id);
	}

	@GetMapping("/viewvideos")
	public List<Videos>  viewvideos() {
		return service.viewvideos();
	}

	@GetMapping("/viewvideosbyid/{id}")
	public Videos  viewvideosbyid(@PathVariable int id) {
		return service.viewvideosbyid(id);
	}

	@PostMapping("/new")
	public void insertCourse(@RequestBody Course dto) {
		service.insert(dto);
		System.out.println( "insertion successful");
	}

	@PostMapping("/modify")
	public String updateCourse(@RequestBody UpdateDTO dto) {
		return service.update(dto);
		
	}

	@DeleteMapping("/remove/{id}")
	public void deleteCourse(@PathVariable int id) {
		 service.delete(id);
	}
	@GetMapping("/modifystatus/{id}")
	public boolean modifystatus(@PathVariable int id) {
		return service.modifystatus(id);
	}
}