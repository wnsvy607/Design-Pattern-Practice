package factory.simple;

public class JavaLecture implements Lecture {
	@Override
	public void encode() {
		System.out.println("자바 강의 인코딩 완료");
	}

	@Override
	public void play() {
		System.out.println("자바 강의 재생");
	}
}
