package day51_inheritance04;

public class Snowboarding extends Exercise{
	public int perform(int minutes) {
		super.perform(10);//call super class version of perform
		System.out.println("Snowboarding for "+minutes+" minutes");
		return minutes * 7;
	}
}
