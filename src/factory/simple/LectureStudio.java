package factory.simple;

public class LectureStudio {
	// SRP를 지킬 수 있다.
	// 하지만 OCP를 지켰다고 보긴 어렵다.

	public Lecture createLecture(String type) {
		Lecture lecture = recordLecture(type);
		lecture.encode();
		return lecture;
	}

	// 새로운 강의가 생성될 때마다 추가 필요
	private Lecture recordLecture(String type) {
		if("ENGLISH".equalsIgnoreCase(type))
			return new EnglishLecture();
		else if("JAVA".equalsIgnoreCase(type))
			return new JavaLecture();
		return null;
	}

}
