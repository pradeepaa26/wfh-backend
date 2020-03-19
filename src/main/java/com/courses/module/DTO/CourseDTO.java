//insertDTO

package com.courses.module.DTO;

import java.util.Date;
import java.util.List;

public class CourseDTO {
	private String name;
	private int levelid;
	private int categoryid;
	private String tag;
	private String slug;
	private boolean isLevelOverride;
	private int available_for;
	private String description;
	private String meta_key;
	private String meta_desc;
	private String created_by;
	private String modified_by;
	private Date created_on;
	private Date modified_on;
	private boolean isActive;
	private int enrollmentPoints;
	private int completionPoints;
	private String mode;
	private List<Integer> courseSubscribedVideo;
	
	private int textId;
	private int textContent;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevelid() {
		return levelid;
	}
	public void setLevelid(int levelid) {
		this.levelid = levelid;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
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
	
	public int getTextId() {
		return textId;
	}
	public void setTextId(int textId) {
		this.textId = textId;
	}
	public int getTextContent() {
		return textContent;
	}
	public void setTextContent(int textContent) {
		this.textContent = textContent;
	}
	public List<Integer> getCourseSubscribedVideo() {
		return courseSubscribedVideo;
	}
	public void setCourseSubscribedVideo(List<Integer> courseSubscribedVideo) {
		this.courseSubscribedVideo = courseSubscribedVideo;
	}
}
