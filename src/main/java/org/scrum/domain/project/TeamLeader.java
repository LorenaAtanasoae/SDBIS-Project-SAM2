package org.scrum.domain.project;

import javax.persistence.*;

@Entity
public class TeamLeader extends Member{
	
		@Column(name = "TechnicalAbilitites")
		@Enumerated(EnumType.STRING)
		private AbilityType Ability; 
		
		
		public AbilityType getAbility() {
			return Ability;
		}


		public void setAbility(AbilityType ability) {
			Ability = ability;
		}

		
		public TeamLeader(AbilityType ability) {
			super();
			Ability = ability;
		}

		

		public TeamLeader() {
			super();
			// TODO Auto-generated constructor stub
		}


		public TeamLeader(Integer memberID, String name, Role role) {
			super(memberID, name, role);
			// TODO Auto-generated constructor stub
		}


		public TeamLeader(Integer memberID, String name, String userName, String password) {
			super(memberID, name, userName, password);
			// TODO Auto-generated constructor stub
		}


		public TeamLeader(Integer memberID, String name) {
			super(memberID, name);
			// TODO Auto-generated constructor stub
		}



		public enum AbilityType {MANAGERIAL, TECHNOLOGICAL}
}
