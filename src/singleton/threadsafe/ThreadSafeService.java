package singleton.threadsafe;

public class ThreadSafeService {

	private String status;
	private static ThreadSafeService instance;

	private ThreadSafeService(){
		System.out.println("ThreadSafeService.ThreadSafeService 인스턴스 생성");
	}

	// synchronized 키워드로 Thread-safe 하다.
	// 하지만, 인스턴스 호출이 잦다면 성능저하로 이어진다.
	public static synchronized ThreadSafeService getInstance() {
		System.out.println("getInstance 호출");
		if(instance == null) {
			instance = new ThreadSafeService();
		}
		return instance;
	}

	public static void call() {
		System.out.println("ThreadSafeService.call");
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
