package singleton.dcl;

public class DoubleCheckLockingApp {
	public static void main(String[] args) {
		System.out.println("앱 시작");
		DoubleCheckLockingService.call();
		DoubleCheckLockingService instance1 = DoubleCheckLockingService.getInstance();
		DoubleCheckLockingService instance2 = DoubleCheckLockingService.getInstance();

		instance1.setStatus("변경 전");

		System.out.println();
		System.out.println("instance1 주소 = " + instance1);
		System.out.println("instance2 주소 = " + instance2);
		System.out.println("instance1.equals(instance2) = " + instance1.equals(instance2));
		System.out.println();


		System.out.println("instance1 상태 = " + instance1.getStatus());
		System.out.println("instance2 상태 = " + instance2.getStatus());

		System.out.println("instance 2의 상태 변경");
		instance2.setStatus("변경 후");
		System.out.println();

		System.out.println("instance1 상태 = " + instance1.getStatus());
		System.out.println("instance2 상태 = " + instance2.getStatus());
	}
}
