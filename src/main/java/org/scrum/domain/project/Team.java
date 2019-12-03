package org.scrum.domain.project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Teams")
public class Team implements Serializable{
	@Id @GeneratedValue
	@Column(name = "TeamID")
	private Integer teamID;
	
	@Column(name = "Specialization")
	@Enumerated(EnumType.STRING)
	private Specialization specialization;
	
	@Column(name = "Abilities")
	private String abilities;
	
	@OneToMany(mappedBy="team", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	private List<Member> members = new ArrayList<Member>();
	
	@OneToMany
	@Column(name = "Project")
	private Project project;
	
	@OneToOne
	@Column(name = "TeamLeader")
	private TeamLeader teamLeader;

	
	public Team(Integer teamId, Specialization specialization, String abilities) {
		super();
		this.teamID = teamId;
		this.specialization = specialization;
		this.abilities = abilities;
	}
	public Integer getTeamID() {
		return teamID;
	}
	public void setTeamID(Integer teamID) {
		this.teamID = teamID;
	}
	public Specialization getSpecialization() {
		return specialization;
	}
	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}
	public String getAbilities() {
		return abilities;
	}
	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}
	public List<Member> getMembers() {
		return members;
	}
	public void setMembers(List<Member> members) {
		this.members = members;
	}
	public TeamLeader getTeamLeader() {
		return teamLeader;
	}
	public void setTeamLeader(TeamLeader teamLeader) {
		this.teamLeader = teamLeader;
	}
	public Team() {
		super();
	}
	public Team(Integer teamID, Specialization specialization) {
		super();
		this.teamID = teamID;
		this.specialization = specialization;
	}
	
	public void addMember(Member member){
		this.members.add(member);
	}
	
	public enum Specialization {
		BACKEND, FRONTEND, DATABASE;
	}	
}


