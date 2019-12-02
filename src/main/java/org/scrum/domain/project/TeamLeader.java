package org.scrum.domain.project;

public class TeamLeader extends Member{
	
		private String TechnicalAbilities; 
		
		public String getTechnicalAbilities() {
			return TechnicalAbilities;
		}
		public void setTechnicalAbilities(String TechnicalAbilities) {
			this.TechnicalAbilities = TechnicalAbilities;
		}
		public TeamLeader(Integer id, String name,
				String TechnicalAbilities) {
			super(id, name, Role.MANAGER);
			this.TechnicalAbilities = TechnicalAbilities;
		}
		public TeamLeader() {
			super();
		}
		
		@Override
		public void setAbilities(String abilities) {
			this.setTechnicalAbilities(abilities);
		}	

		public void setAbilities(String abilities, AbilityType type) {
			if (type.equals(AbilityType.MANAGERIAL))
				super.setAbilities(abilities);
			
			if (type.equals(AbilityType.TECHNOLOGICAL))
				setTechnicalAbilities(abilities);
			
		}
		public enum AbilityType {MANAGERIAL, TECHNOLOGICAL}
}
