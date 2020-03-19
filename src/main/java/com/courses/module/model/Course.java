package com.courses.module.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="courses")
public class Course  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="`id`")
	private int id;
	@Column(name="`name`")
	private String name;
	@OneToOne
	@JoinColumn(name="`level_id`")
	private Levels levels;
	@OneToOne
	@JoinColumn(name="`category_id`")
	private Categories categories;
	
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
//	@JoinColumn(name="`course_id`")
	private List<CourseSubscribedVideos> CourseSubscribedVideoObj;
	
	public List<CourseSubscribedVideos> getCourseSubscribedVideoObj() {
		return CourseSubscribedVideoObj;
	}
	public void setCourseSubscribedVideoObj(List<CourseSubscribedVideos> courseSubscribedVideoObj) {
		CourseSubscribedVideoObj = courseSubscribedVideoObj;
	}
	@OneToMany(mappedBy = "courses", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Texts> texts;
	
	public List<Texts> getTexts() {
		return texts;
	}
	public void setTexts(List<Texts> texts) {
		this.texts = texts;
	}
	@Column(name="`tag`")
	private String tag;
	@Column(name="`slug`")
	private String slug;
	@Column(name="`is_level_override`")
	private boolean isLevelOverride;
	@Column(name="`available_for`")
	private int available_for;
	@Column(name="`description`")
	private String description;
	@Column(name="`meta_key`")
	private String meta_key;
	@Column(name="`meta_desc`")
	private String meta_desc;
	@Column(name="`created_by`")
	private String created_by;
	@Column(name="`modified_by`")
	private String modified_by;
	@Column(name="`created_on`")
	private Date created_on;
	@Column(name="`modified_on`")
	private Date modified_on;
	@Column(name="`is_active`")
	private boolean isActive;
	@Column(name="`enrollment_activity_pts`")
	private int enrollmentPoints;
	@Column(name="`completion_activity_pts`")
	private int completionPoints;
	@Column(name="`mode`")
	private String mode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Levels getLevels() {
		return levels;
	}
	public void setLevels(Levels levels) {
		this.levels = levels;
	}
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}

	public boolean isLevelOverride() {
		return isLevelOverride;
	}
	public void setLevelOverride(boolean isLevelOverride) {
		this.isLevelOverride = isLevelOverride;
	}
	
	public int getAvailable_for() {
		return available_for;
	}
	public void setAvailable_for(int available_for) {
		this.available_for = available_for;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMeta_key() {
		return meta_key;
	}
	public void setMeta_key(String meta_key) {
		this.meta_key = meta_key;
	}
	public String getMeta_desc() {
		return meta_desc;
	}
	public void setMeta_desc(String meta_desc) {
		this.meta_desc = meta_desc;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public Date getModified_on() {
		return modified_on;
	}
	public void setModified_on(Date modified_on) {
		this.modified_on = modified_on;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getEnrollmentPoints() {
		return enrollmentPoints;
	}
	public void setEnrollmentPoints(int enrollmentPoints) {
		this.enrollmentPoints = enrollmentPoints;
	}
	public int getCompletionPoints() {
		return completionPoints;
	}
	public void setCompletionPoints(int completionPoints) {
		this.completionPoints = completionPoints;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
}
