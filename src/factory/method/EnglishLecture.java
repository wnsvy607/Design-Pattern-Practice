package factory.method;

import factory.method.Lecture;

public class EnglishLecture implements Lecture {

	@Override
	public void encode() {
		System.out.println("영어 강의 인코딩 완료");
	}

	@Override
	public void play() {
		System.out.println("영어 강의 재생");
	}
}
