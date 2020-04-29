package com.example.demo;

import java.util.Date;

public class CacheBO {
	/**
	 * Variable to hold the parent key
	 */
	private String parentKey;
	/**
	 * Boolean for rebuildable
	 */
	private boolean rebuildable;
	/**
	 * Boolean for deletable
	 */
	private boolean deletable;
	/**
	 * Boolean for editable
	 */
	private boolean editable;
	/**
	 * The function type
	 */
	private String functionType;
	/**
	 * Variable to hold the created ID
	 */
	private String createdID;
	/**
	 * Variable to hold the created date/time
	 */
	private Date createdDate;
	
	/**
	 * Variable to hold the last maintained ID
	 */
	private String lastMaintainedID;
	private String lastMaintainedAction;
	/**
	 * Variable to hold the last maintained date/time
	 */
	private Date lastMaintainedDate;
	
	
	public String getParentKey() {
		return parentKey;
	}
	public void setParentKey(String parentKey) {
		this.parentKey = parentKey;
	}
	public boolean isRebuildable() {
		return rebuildable;
	}
	public void setRebuildable(boolean rebuildable) {
		this.rebuildable = rebuildable;
	}
	public boolean isDeletable() {
		return deletable;
	}
	public void setDeletable(boolean deletable) {
		this.deletable = deletable;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public String getFunctionType() {
		return functionType;
	}
	public void setFunctionType(String functionType) {
		this.functionType = functionType;
	}
	public String getLastMaintainedID() {
		return lastMaintainedID;
	}
	public void setLastMaintainedID(String lastMaintainedID) {
		this.lastMaintainedID = lastMaintainedID;
	}
	public String getLastMaintainedAction() {
		return lastMaintainedAction;
	}
	public void setLastMaintainedAction(String lastMaintainedAction) {
		this.lastMaintainedAction = lastMaintainedAction;
	}
	public Date getLastMaintainedDate() {
		return lastMaintainedDate;
	}
	public void setLastMaintainedDate(Date lastMaintainedDate) {
		this.lastMaintainedDate = lastMaintainedDate;
	}
	public String getCreatedID() {
		return createdID;
	}
	public void setCreatedID(String createdID) {
		this.createdID = createdID;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	@Override
	public String toString() {
		return "parentKey="+parentKey+",functionType="+functionType;
	}
	
}
