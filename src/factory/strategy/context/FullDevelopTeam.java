package factory.strategy.context;

import factory.strategy.strategy.backend.BackendStrategy;
import factory.strategy.strategy.mobile.MobileStrategy;
import factory.strategy.strategy.web.WebStrategy;

public class FullDevelopTeam implements DevelopTeam {

	private BackendStrategy backendStrategy;
	private WebStrategy webStrategy;
	private MobileStrategy mobileStrategy;

	public FullDevelopTeam(BackendStrategy backendStrategy, WebStrategy webStrategy, MobileStrategy mobileStrategy) {
		this.backendStrategy = backendStrategy;
		this.webStrategy = webStrategy;
		this.mobileStrategy = mobileStrategy;
	}

	public App developService() {
		String server = backendStrategy.developServer();
		String web = webStrategy.developWeb();
		String mobile = mobileStrategy.developMobile();
		return new App(server, web, mobile);
	}

	public void setBackendStrategy(BackendStrategy backendStrategy) {
		this.backendStrategy = backendStrategy;
	}

	public void setWebStrategy(WebStrategy webStrategy) {
		this.webStrategy = webStrategy;
	}

	public void setMobileStrategy(MobileStrategy mobileStrategy) {
		this.mobileStrategy = mobileStrategy;
	}
}
