package org.scrum.domain.project;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;

@Entity
@Table(name = "Tasks")
public class Task implements Serializable{
		@Id @GeneratedValue
		private Integer taskID;
		
		@Column(name = "Name")
		private String name;
		
		@Column(name = "Description")
		private String description;
		
		@Temporal(TemporalType.DATE)
		private Date startDate;
		
		@Temporal(TemporalType.DATE)
		private Date estimatedTime; 
		
		@Temporal(TemporalType.DATE)
		private Date remainingTime; 
		
		@Temporal(TemporalType.DATE)
		private Date realTime;	
		
		@Column(name = "Responsible")
		@ManyToOne
		private Member responsible;
		
		@Column(name = "TaskCategory")
		@Enumerated(EnumType.STRING)
		private TaskCategory taskCategory;
		
		@Column(name = "TaskStatus")
		@Enumerated(EnumType.STRING)
		private TaskStatus taskStatus;
	
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
		public Date getEstimatedTime() {
			return estimatedTime;
		}
		public void setEstimatedTime(Date estimatedTime) {
			this.estimatedTime = estimatedTime;
		}
		public Date getRemainingTime() {
			return remainingTime;
		}
		
		public Date getRealTime() {
			return realTime;
		}
		public void setRealTime(Date realTime) {
			this.realTime = realTime;
		}

		public Member getResponsible() {
			return responsible;
		}
		public void setResponsible(Member responsible) {
			this.responsible = responsible;
		}

		public Task(Integer taskID, String name, Date startDate,
				Date estimatedTime) {
			super();
			this.taskID = taskID;
			this.name = name;
			this.startDate = startDate;
			this.estimatedTime = estimatedTime;
		}
		
		public Task(Integer taskID, String name, String description, Date startDate, Date estimatedTime,
				Date remainingTime, Date realTime, Member responsible, TaskCategory taskCategory,
				TaskStatus taskStatus) {
			super();
			this.taskID = taskID;
			this.name = name;
			this.description = description;
			this.startDate = startDate;
			this.estimatedTime = estimatedTime;
			this.remainingTime = remainingTime;
			this.realTime = realTime;
			this.responsible = responsible;
			this.taskCategory = taskCategory;
			this.taskStatus = taskStatus;
		}
		public Task() {
			super();
		}
		public TaskCategory getTaskCategory() {
			return taskCategory;
		}
		public void setTaskCategory(TaskCategory taskCategory) {
			this.taskCategory = taskCategory;
		}
		
		public TaskStatus getTaskStatus() {
			return taskStatus;
		}
		public void setTaskStatus(TaskStatus taskStatus) {
			this.taskStatus = taskStatus;
		}
		public void setRemainingTime(Date remainingTime) {
			this.remainingTime = remainingTime;
		}

		public enum TaskStatus{
			IN_PROGRESS, BLOCKED, COMPLETE, SUSPENDED;
		}
		public enum TaskCategory{
			ANALYSIS, DESIGN, IMPLEMENTATION, TEST;
		}
}
