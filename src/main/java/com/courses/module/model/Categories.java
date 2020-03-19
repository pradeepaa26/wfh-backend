package com.courses.module.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categories")

public class Categories implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@Column(name="`id`")
private int id;
@Column(name="`name`")
private String name;
@Column(name="`is_active`")
private boolean isActive;
@Column(name="`created_by`")
private String createdBy;
@Column(name="`modified_by`")
private String modifiedBy;
@Column(name="`created_on`")
private Date createdOn;
@Column(name="`modified_on`")
private Date modifiedOn;
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
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public String getModifiedBy() {
	return modifiedBy;
}
public void setModifiedBy(String modifiedBy) {
	this.modifiedBy = modifiedBy;
}
public Date getCreatedOn() {
	return createdOn;
}
public void setCreatedOn(Date createdOn) {
	this.createdOn = createdOn;
}
public Date getModifiedOn() {
	return modifiedOn;
}
public void setModifiedOn(Date modifiedOn) {
	this.modifiedOn = modifiedOn;
}


}
