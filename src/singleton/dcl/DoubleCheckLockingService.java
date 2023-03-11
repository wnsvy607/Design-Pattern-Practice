package singleton.dcl;

public class DoubleCheckLockingService {

	private String status;
	private static DoubleCheckLockingService instance;

	private DoubleCheckLockingService(){
		System.out.println("ThreadSafeService.ThreadSafeService 인스턴스 생성");
	}

	// Double check locking 으로
	// instance가 null일 때만 synchronized가 작동한다.
	public static synchronized DoubleCheckLockingService getInstance() {
		System.out.println("getInstance 호출");
		if(instance == null) {
			synchronized (DoubleCheckLockingService.class) {
				if(instance == null) {
					instance = new DoubleCheckLockingService();
				}
			}
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
