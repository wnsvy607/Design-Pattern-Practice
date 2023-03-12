package factory.method;

public class EnglishLectureStudio extends LectureStudio{
	@Override
	protected Lecture recordLecture() {
		return new EnglishLecture();
	}
}
