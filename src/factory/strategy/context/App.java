package factory.strategy.context;

public class App {

	private String server;
	private String web;
	private String mobile;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("\n서버: " + server);
		sb.append("\n웹: " + web);
		sb.append("\n모바일: " + mobile);
		return sb.toString();
	}

	// 모바일까지 요구 사항 확장
	public App(String server, String web, String mobile) {
		this.server = server;
		this.web = web;
		this.mobile = mobile;
	}

	// 요구사항 확장 이전
	public App(String server, String web) {
		this.server = server;
		this.web = web;
		this.mobile = "미구현";
	}
}
