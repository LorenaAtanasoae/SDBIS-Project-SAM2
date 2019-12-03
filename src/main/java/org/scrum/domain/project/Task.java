package org.scrum.domain.project;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

	public class Task implements Serializable{

		@Id @GeneratedValue
		private Integer taskID;
		private String name;
		private String description;
		
		@Temporal(TemporalType.DATE)
		private Date startDate;
		
		private Integer estimatedTime; 
		private Integer remainingTime; 
		private Integer realTime;	

		@ManyToOne
		private Member responsible;
		
	        private TaskCategory taskCategory;

		// Burn down
		@Transient
		private Map<Date, Integer> burnDownRecords = new HashMap<>();
	
		public Integer getTaskID() {
			return taskID;
		}
		public void setTaskID(Integer taskID) {
			this.taskID = taskID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Date getStartDate() {
			return startDate;
		}
		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
		public Integer getEstimatedTime() {
			return estimatedTime;
		}
		public void setEstimatedTime(Integer estimatedTime) {
			this.estimatedTime = estimatedTime;
		}
		public Integer getRemainingTime() {
			return remainingTime;
		}
		
		public Integer getRealTime() {
			return realTime;
		}
		public void setRealTime(Integer realTime) {
			this.realTime = realTime;
		}

		public Member getResponsible() {
			return responsible;
		}
		public void setResponsible(Member responsible) {
			this.responsible = responsible;
		}

		public Task(Integer taskID, String name, Date startDate,
				Integer estimatedTime) {
			super();
			this.taskID = taskID;
			this.name = name;
			this.startDate = startDate;
			this.estimatedTime = estimatedTime;
		}

		public Task() {
			super();
		}
}
