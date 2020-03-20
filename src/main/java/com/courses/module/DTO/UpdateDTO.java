package com.courses.module.DTO;

public class UpdateDTO {
	private int id;
	private String name;
	private int level_id;
	private int category_id;
	private String tag;
	private String slug;
	private boolean isLevelOverride;
	private int available_for;
	private String description;
	 private String meta_key; 
	 private String meta_desc; 
	 private int enrollmentPoints;
	 private int courseSubscribedVideo[];
	 private int completionPoints;
	 
public int[] getCourseSubscribedVideo() {
		return courseSubscribedVideo;
	}
	public void setCourseSubscribedVideo(int[] courseSubscribedVideo) {
		this.courseSubscribedVideo = courseSubscribedVideo;
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
		//	 private String created_by;
//	  private String modified_by; 
//	 private Date created_on;
//	 private Date modified_on;
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
	public int getLevel_id() {
		return level_id;
	}
	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
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
	 

	
}
