package factory.strategy.strategy.mobile;

public class FlutterMobileStrategy implements MobileStrategy{
	@Override
	public String developMobile() {
		System.out.println("플러터를 사용하여 모바일 앱 개발 완료!");
		return "플러터";
	}
}
