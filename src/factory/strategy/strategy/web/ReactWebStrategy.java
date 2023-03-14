package factory.strategy.strategy.web;

public class ReactWebStrategy implements WebStrategy{
	@Override
	public String developWeb() {
		System.out.println("리액트 사용하여 웹 개발 완료!");
		return "리액트";
	}
}
