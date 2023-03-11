package singleton.staticblock;

public class StaticBlockService {

	private String status;
	private static StaticBlockService instance;

	private StaticBlockService(){}

	static {
		try {
			instance = new StaticBlockService();
			System.out.println("StaticBlockService.static initializer 인스턴스 생성");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockService getInstance() {
		System.out.println("getInstance 호출");
		return instance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
