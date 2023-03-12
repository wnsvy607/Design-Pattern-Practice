package singleton.eager;

public class EagerSingletonService {

	private String status;
	private static final EagerSingletonService instance = new EagerSingletonService();

	private EagerSingletonService(){
		System.out.println("EagerSingletonService.EagerSingletonService 인스턴스 생성");
	}

	public static EagerSingletonService getInstance() {
		System.out.println("getInstance 호출");
		return instance;
	}

	public static void call() {
		System.out.println("EagerSingletonService.call");
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
