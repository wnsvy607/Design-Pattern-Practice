package factory.strategy.strategy.web;

public class VueWebStrategy implements WebStrategy{
	@Override
	public String developWeb() {
		System.out.println("뷰를 사용하여 웹 개발 완료!");
		return "뷰";
	}
}
