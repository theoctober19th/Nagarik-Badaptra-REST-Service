package com.eversoft.traverse.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="badapatra_info")
public class Information {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
	
	@Column(name="code")
    String code;
	
	@Column(name="description")
    String description;
	
	@Column(name="reqDocList")
    String reqDocList;
	
	@Column(name="time")
    int time;
	
	@Column(name="timeUnit")
    String timeUnit;
	
	@Column(name="cost")
    long cost;
	
	@Column(name="referDepartment")
    String referDepartment;
	
	@Column(name="referPerson")
    String referPerson;
	
	@Column(name="referPersonContact")
    String referPersonContact;
	
	@Column(name="complaintOfficer")
    String complaintOfficer;
	
	@Column(name="remarks")
    String remarks;
	
	@Column(name="isActive")
	boolean isActive;
	
	@Column(name="officeId")
	int officeId;

    public Information() {
    }

    public Information(int id, String code, String description, String reqDocList, int time, String timeUnit, long cost, String referDepartment, String referPerson, String referPersonContact, String complaintOfficer, String remarks, boolean isActive, int officeId) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.reqDocList = reqDocList;
        this.time = time;
        this.timeUnit = timeUnit;
        this.cost = cost;
        this.referDepartment = referDepartment;
        this.referPerson = referPerson;
        this.referPersonContact = referPersonContact;
        this.complaintOfficer = complaintOfficer;
        this.remarks = remarks;
        this.isActive = isActive;
        this.officeId = officeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReqDocList() {
        return reqDocList;
    }

    public void setReqDocList(String reqDocList) {
        this.reqDocList = reqDocList;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public String getReferDepartment() {
        return referDepartment;
    }

    public void setReferDepartment(String referDepartment) {
        this.referDepartment = referDepartment;
    }

    public String getReferPerson() {
        return referPerson;
    }

    public void setReferPerson(String referPerson) {
        this.referPerson = referPerson;
    }

    public String getReferPersonContact() {
        return referPersonContact;
    }

    public void setReferPersonContact(String referPersonContact) {
        this.referPersonContact = referPersonContact;
    }

    public String getComplaintOfficer() {
        return complaintOfficer;
    }

    public void setComplaintOfficer(String complaintOfficer) {
        this.complaintOfficer = complaintOfficer;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getOfficeId() {
		return officeId;
	}

	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}
	
	
    
}

