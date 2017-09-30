

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		String str = "aabc";
				String s ="cba";

		System.out.println(str.indexOf(s));
	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}