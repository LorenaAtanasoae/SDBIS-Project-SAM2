package main.java.org.scrum.spring;
import main.java.org.scrum.domain.services.IProjectDomainService;
import main.java.org.scrum.domain.services.IProjectEntityFactory;
import main.java.org.scrum.domain.services.IProjectEntityRepository;
import main.java.org.scrum.domain.services.ProjectDomainServiceCDI;
import main.java.org.scrum.domain.services.ProjectEntityFactoryBaseCDI;
import main.java.org.scrum.domain.services.ProjectEntityRepositoryBaseCDI;
import main.java.org.springframework.context.annotation.Bean;
import main.java.org.springframework.context.annotation.Configuration;

@Configuration
public class AppBeanConfig {
	@Bean
	public IProjectEntityRepository getProjectEntityRepositoryBaseCDI() {
		return new ProjectEntityRepositoryBaseCDI();
	}
	
	@Bean
	public IProjectDomainService getIProjectDomainService() {
		return new ProjectDomainServiceCDI(getProjectEntityRepositoryBaseCDI());
	}
	
	
	@Bean
	public IProjectEntityFactory getIProjectEntityFactory() {
		return new ProjectEntityFactoryBaseCDI();
	}
}