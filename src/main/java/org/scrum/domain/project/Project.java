
package org.scrum.domain.project;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project implements Serializable, Comparable<Project>{

	private Integer projectNo;
	private String name;
	private Date startDate;
	private List<Release> releases = new ArrayList<>();
	private Release currentRelease;
	private List<Team> teams = new ArrayList<>();
	

	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	public Integer getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(Integer projectNo) {
		this.projectNo = projectNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startName) {
		this.startDate = startName;
	}

	public List<Release> getReleases() {
		return releases;
	}
	public void setReleases(List<Release> releases) {
		this.releases = releases;
	}
	public Release getCurrentRelease() {
		return currentRelease;
	}
	public void setCurrentRelease(Release currentRelease) {
		this.currentRelease = currentRelease;
	}
	
	@Override
	public String toString() {
		return "\nProject [projectNo=" + projectNo + ", name=" + name + ", startDate=" + startDate + ", releases="
				+ releases + "]";
	}
	
	public Project(Integer projectNo, String name, Date startDate) {
		super();
		this.projectNo = projectNo;
		this.name = name;
		this.startDate = startDate;
	}

	public Project() {
	}


	public Project(Integer projectNo, String name, Date startDate, List<Team> teams) {
		super();
		this.projectNo = projectNo;
		this.name = name;
		this.startDate = startDate;
		this.teams = teams;
	}
	public Project(Integer nrProiect, String numeProiect) {
		super();
		this.projectNo = nrProiect;
		this.name = numeProiect;
	}
	@Override
	public int compareTo(Project o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
