package factory.strategy.context;

import factory.strategy.strategy.backend.BackendStrategy;
import factory.strategy.strategy.web.WebStrategy;

public class WebDevelopTeam implements DevelopTeam {

	private BackendStrategy backendStrategy;
	private WebStrategy webStrategy;

	public WebDevelopTeam(BackendStrategy backendStrategy, WebStrategy webStrategy) {
		this.backendStrategy = backendStrategy;
		this.webStrategy = webStrategy;
	}

	public App developService() {
		String server = backendStrategy.developServer();
		String web = webStrategy.developWeb();
		return new App(server, web);
	}

	public void setBackendStrategy(BackendStrategy backendStrategy) {
		this.backendStrategy = backendStrategy;
	}

	public void setWebStrategy(WebStrategy webStrategy) {
		this.webStrategy = webStrategy;
	}
}
