package org.scrum.domain.project;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

<<<<<<< HEAD
import javax.persistence.*;
@Entity
@Table(name = "Members")
public class Member implements Comparable<Member>, Serializable{
	@Id @GeneratedValue
	@Column(name = "MemberID")
=======
public class Member 
	implements Comparable<Member>, Serializable{
	
	@Id @GeneratedValue
>>>>>>> 07947fe83a17448723eb11eb9ee8e76cfbed1ffa
	private Integer memberID;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Role")
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@Column(name = "UserName")
	private String userName;
	
	@Column(name = "Password")
	private String password;
	
	@ManyToOne
	private Team team;
		
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getMemberID() {
		return memberID;
	}
	public void setMemberID(Integer memberID) {
		this.memberID = memberID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	public Member() {
		super();
	}
	public Member(Integer memberID, String name) {
		super();
		this.memberID = memberID;
		this.name = name;
	}
	public Member(Integer memberID, String name, Role role) {
		super();
		this.memberID = memberID;
		this.name = name;
		this.role = role;
	}


	public Member(Integer memberID, String name, String userName,
			String password) {
		super();
		this.memberID = memberID;
		this.name = name;
		this.userName = userName;
		this.password = password;
	}

	private String abilities;
	
	public String getAbilities() {
		return abilities;
	}
	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}
	
	public enum Role{
		MANAGER, PRODUCT_OWNER, SCRUM_MASTER, DEVELOPER, ANALYST, TESTER;
	}
	
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return 0;
	}	
}
