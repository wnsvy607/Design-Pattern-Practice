package factory.method;

public class JavaLectureStudio extends LectureStudio {
	@Override
	protected Lecture recordLecture() {
		return new JavaLecture();
	}
}
