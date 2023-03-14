package factory.strategy.strategy.mobile;

public class ReactNativeMobileStrategy implements MobileStrategy{
	@Override
	public String developMobile() {
		System.out.println("리액트 네이티브를 사용하여 모바일 앱 개발 완료!");
		return "리액트 네이티브";
	}
}
