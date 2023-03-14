package factory.strategy.client;

import factory.strategy.context.App;
import factory.strategy.context.DevelopTeam;
import factory.strategy.context.FullDevelopTeam;
import factory.strategy.context.WebDevelopTeam;
import factory.strategy.strategy.mobile.FlutterMobileStrategy;
import factory.strategy.strategy.web.ReactWebStrategy;
import factory.strategy.strategy.backend.SpringBackendStrategy;
import factory.strategy.strategy.web.VueWebStrategy;

public class MainEntry {

	public static void main(String[] args) {

		SpringBackendStrategy springBackendStrategy = new SpringBackendStrategy();
		VueWebStrategy vueWebStrategy = new VueWebStrategy();
		WebDevelopTeam webDevelopTeam = new WebDevelopTeam(springBackendStrategy, vueWebStrategy);

		App springVueApp = webDevelopTeam.developService();

		System.out.println(springVueApp);

		System.out.println("\n요구사항 변경: 웹 프레임 워크를 Vue에서 React로 전환하라");

		ReactWebStrategy reactWebStrategy = new ReactWebStrategy();
		webDevelopTeam.setWebStrategy(reactWebStrategy);

		App springReactApp = webDevelopTeam.developService();

		System.out.println(springReactApp);

		System.out.println("\n요구사항 추가: 플러터를 사용해 모바일 앱도 개발하라");

		System.out.println("플러터 개발자를 뽑아 팀을 새로 꾸린다.\n");
		FlutterMobileStrategy flutterMobileStrategy = new FlutterMobileStrategy();

		FullDevelopTeam fullDevelopTeam = new FullDevelopTeam(springBackendStrategy, reactWebStrategy,
			flutterMobileStrategy);

		App fullApp = fullDevelopTeam.developService();

		System.out.println(fullApp);

	}
}
