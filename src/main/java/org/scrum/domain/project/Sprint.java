package org.scrum.domain.project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

<<<<<<< HEAD
import javax.persistence.*;

@Entity
@Table(name = "Sprints")
public class Sprint implements Serializable{
	@Id @GeneratedValue
	@Column(name = "SprintID")
=======
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Sprint implements Serializable{
	
	@Id
>>>>>>> 07947fe83a17448723eb11eb9ee8e76cfbed1ffa
	private Integer sprintID;
	
	
	@Column(name = "Objective")
	private String objective;
	
<<<<<<< HEAD
	@OneToMany(mappedBy="sprint", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
=======
	@OneToMany
>>>>>>> 07947fe83a17448723eb11eb9ee8e76cfbed1ffa
	private List<Feature> features = new ArrayList<>();
	
	@Temporal(TemporalType.DATE)
	private Date startDate;
	private String review;
	
	
	public Integer getSprintID() {
		return sprintID;
	}

	public void setSprintID(Integer sprintID) {
		this.sprintID = sprintID;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}

	public Sprint() {
		super();
	}

	public Sprint(Integer sprintID, String objective, Date startDate) {
		super();
		this.sprintID = sprintID;
		this.objective = objective;
		this.startDate = startDate;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sprint other = (Sprint) obj;
		if (sprintID == null) {
			if (other.sprintID != null)
				return false;
		} else if (!sprintID.equals(other.sprintID))
			return false;
		return true;
	}
}
