package singleton.billpugh;

public class BillPughService {

	private String status;
	private BillPughService(){
		System.out.println("BillPughService.BillPughService 인스턴스 생성");
	}

	private static class SingletonHelper {
		private static final BillPughService INSTANCE = new BillPughService();
	}

	public static BillPughService getInstance() {
		System.out.println("getInstance 호출");
		return SingletonHelper.INSTANCE;
	}

	public static void call() {
		System.out.println("BillPughService.call");
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
