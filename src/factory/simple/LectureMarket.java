package factory.simple;

public class LectureMarket {

	public static void main(String[] args) {


		LectureStudio lectureStudio = new LectureStudio();
		Lecture englishLecture = lectureStudio.createLecture("ENGLISH");
		Lecture javaLecture = lectureStudio.createLecture("JAVA");

		englishLecture.play();
		javaLecture.play();

	}
}
