package factory.method;

public class LectureMarket {

	public static void main(String[] args) {

		JavaLectureStudio javaLectureStudio = new JavaLectureStudio();
		Lecture javaLecture = javaLectureStudio.createLecture();
		javaLecture.play();

		EnglishLectureStudio englishLectureStudio = new EnglishLectureStudio();
		Lecture englishLecture = englishLectureStudio.createLecture();
		englishLecture.play();

	}
}
