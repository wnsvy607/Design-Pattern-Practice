package factory.strategy.strategy.backend;

import factory.strategy.strategy.backend.BackendStrategy;

public class SpringBackendStrategy implements BackendStrategy {
	@Override
	public String developServer() {
		System.out.println("스프링을 사용하여 서버 개발 완료!");
		return "스프링";
	}
}
