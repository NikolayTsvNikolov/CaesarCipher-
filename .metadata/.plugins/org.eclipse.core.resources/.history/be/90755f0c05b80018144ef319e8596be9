import java.util.Scanner;

public class Caeser {

	static void GetBetterVision() {
		System.out.println("--------------------------------------");
	}

	static String GetScanner() {
		Scanner scanner = new Scanner(System.in);
		String getString = scanner.nextLine();
		return getString;
	}

	static String GetCipherAction() {
		GetBetterVision();
		System.out.print("Please enter \"Cipher\" or \"UnCipher\"");
		String getAction = GetScanner();
		return getAction;
	}

	static int GetCipehrKey() {
		GetBetterVision();
		System.out.print("Please enter Cipher key number: ");
		int getCipherKey = Integer.valueOf(GetScanner());
		return getCipherKey;
	}

	static String GetWord() {
		GetBetterVision();
		System.out.print("Please enter a word: ");
		String getWord = GetScanner();
		return getWord;

	}

	static String CipherWord(String wordToCipher, int cipherKey, char[] alphabetBig, char[] alphabetSmall) {

		char[] wordToCipherChar = wordToCipher.toCharArray();
		char[] newWord = new char[wordToCipherChar.length];

		for (int i = 0; i < wordToCipherChar.length; i++) {
			for (int j = 0; j < alphabetBig.length; j++) {
				if (wordToCipherChar[i] == alphabetBig[j]) {
					newWord[i] = alphabetBig[j + cipherKey];
					break;
				} else if (wordToCipherChar[i] == alphabetSmall[j]) {
					newWord[i] = alphabetSmall[j + cipherKey];
					break;
				}
			}
		}

		return String.valueOf(newWord);
	}

	static String UnCipherWord(String toUnCipher, int cipherKey, char[] alphabetBig, char[] alphabetSmall) {

		char[] toUnCipherChar = toUnCipher.toCharArray();
		char[] newWord = new char[toUnCipherChar.length];

		for (int i = 0; i < toUnCipherChar.length; i++) {
			for (int j = 0; j < alphabetBig.length; j++) {
				if (toUnCipherChar[i] == alphabetBig[j]) {
					newWord[i] = alphabetBig[j - cipherKey];
				} else if (toUnCipherChar[i] == alphabetSmall[j]) {
					newWord[i] = alphabetSmall[j - cipherKey];
				}
			}
		}

		return String.valueOf(newWord);

	}

	public static void main(String[] args) {

		String cipher = "Cipher";
		String unCipher = "Uncipher";
		String cipheredWord = "";
		String unCipheredWord = "";
		String UserAction = "";
		String word = "";
		int cipherKey = 0;
		char[] alphabetSmall = { 'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
				'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ь', 'ю', 'я' };
		char[] alphabetBig = { 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С',
				'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ь', 'Ю', 'Я' };

		UserAction = GetCipherAction();
		word = GetWord();
		cipherKey = GetCipehrKey();

		if (UserAction.equals(cipher)) {
			cipheredWord = (CipherWord(word, cipherKey, alphabetBig, alphabetSmall));
			GetBetterVision();
			System.out.println("Кодираната дума е: " + cipheredWord);
			GetBetterVision();
		} else if (UserAction.equals(unCipher)) {
			unCipheredWord = (UnCipherWord(word, cipherKey, alphabetBig, alphabetSmall));
			GetBetterVision();
			System.out.println("Разкодираната дума е : " + unCipheredWord);
			GetBetterVision();
		}

	}

}
