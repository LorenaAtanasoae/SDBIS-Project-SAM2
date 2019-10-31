package org.scrum.domain.project;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

	public class Task implements Serializable{

		private Integer taskID;
		private String name;
		private String description;

		private Date startDate;
		
		private Integer estimatedTime; 
		private Integer remainingTime; 
		private Integer realTime;	

		private Member responsible;

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
