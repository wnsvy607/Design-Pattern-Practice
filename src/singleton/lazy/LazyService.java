package singleton.lazy;

public class LazyService {

	private String status;
	private static LazyService instance;

	private LazyService(){
		System.out.println("LazyService.LazyService 인스턴스 생성");
	}

	public static LazyService getInstance() {
		System.out.println("getInstance 호출");
		// Thread-unsafe 하다.
		if(instance == null) {
			instance = new LazyService();
		}
		return instance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
