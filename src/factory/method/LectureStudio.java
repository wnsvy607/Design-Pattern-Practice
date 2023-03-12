package factory.method;

public abstract class LectureStudio {

	//SRP와 함께 OCP 를 지킬 수 있다.
	public Lecture createLecture() {
		Lecture lecture = recordLecture();
		lecture.encode();
		return lecture;
	}

	protected abstract Lecture recordLecture();

}
