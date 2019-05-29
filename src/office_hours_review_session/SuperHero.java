package office_hours_review_session;

import java.util.Arrays;

public class SuperHero {
	public static void main(String[] args) {
		// array is not resizable
		// different ways to create arrays
		String[] arr1 = { "Word" };
		System.out.println(Arrays.toString(arr1));

		String[] arr2 = new String[2];
		arr2[0] = "Word";
		arr2[0] = "new word";
		arr2[1] = "one more new word";
		System.out.println(Arrays.toString(arr2));

		String[] arr3 = new String[] { "apple", "kiwi" };
		System.out.println(Arrays.toString(arr3));

		String[] superheroes = { "Spiderman", "Iron man", "Hulk", "Wonder Woman", "Thor", "Batman", "Hellboy",
				"Superman", "Flash", "Captain America", "Ant-Man", "Aquaman" };
		// how many superheroes we have with space in the name
		// let's print all of them, and their count
		int count = 0;
		String heroesWithSpace = "";
		for (String s : superheroes) {
			if (s.contains(" ")) {
				System.out.println(s);
				heroesWithSpace = heroesWithSpace + s + ", ";
				count++;
			}
		}
		System.out.println("Count of superheroes with space: " + count);
		System.out.println(heroesWithSpace.substring(0, heroesWithSpace.length() - 2));// to remove comma at end of list
		String[] newHeroes = heroesWithSpace.split(", ");
		System.out.println(Arrays.toString(newHeroes));

		String[] newHeroes2 = new String[count];
		for (int i = 0, j = 0; i < newHeroes2.length; i++) {
			if (superheroes[i].contains(" ")) {
				newHeroes2[j] = superheroes[i];
				j++;
			}
			System.out.println("int i: " + i + " int j: " + j);
		}
		System.out.println(Arrays.toString(newHeroes));

	}

	public Object superheroes;
}
