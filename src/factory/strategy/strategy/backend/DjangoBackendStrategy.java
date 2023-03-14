package factory.strategy.strategy.backend;

public class DjangoBackendStrategy implements BackendStrategy{
	@Override
	public String developServer() {
		System.out.println("쟝고를 사용하여 서버 개발 완료!");
		return "장고";
	}
}
