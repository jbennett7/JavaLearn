/* Relational Operators (cont'd page 227)
 * Java has four relational operators that can be used to compare any combination of
 * integers, floating-point numbers, or characters: >, >=, <, <=
 *
 * Let's look at some leagal comparisons:
 */

class GuessAnimal {
	public static void main(String[] args) {
		String animal = "unkown";
		int weight = 700;
		char sex = 'm';
		double colorWaveLength = 1.630;
		if (weight >= 500) { animal = "elephant"; }
		if (colorWaveLength > 1.621) { animal = "gray " + animal; }
		if (sex <= 'f') { animal = "female " + animal; }
		System.out.println("The animal is a " + animal);
	}
}

/*
 * In the preceding code, we are using a comparison between characters. It's also
 * legal to compare a character primitive with any number (though it isn't great
 * programming style). Running the preceding class will output the following:
 *
 *   The animal is a gray elephant
 *
 * We mentioned that characters can be sused in comparison operators. When
 * comparing a character with a character or a character with a number, Java will use
 * the Unicode value of the character as the numerical value, for comparison.
 */
