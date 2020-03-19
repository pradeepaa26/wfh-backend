package com.courses.module.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="course_subscribed_videos")
public class CourseSubscribedVideos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="`id`")
	private int id;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="`course_id`")
	private Course course;
    @OneToOne
	@JoinColumn(name="`video_id`")
	private Videos videos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Videos getVideos() {
		return videos;
	}
	public void setVideos(Videos videos) {
		this.videos = videos;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

}
