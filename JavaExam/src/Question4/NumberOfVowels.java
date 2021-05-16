package Question4;

public class NumberOfVowels {

	private String word;

	public NumberOfVowels(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public void vowelCount() {

		int j = 0;

		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
				j++;
			}

		}

		System.out.println("The number of vowels in the word are: " + j);
	}

}
