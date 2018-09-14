
public class Caeser {
	public class Ceaser {
		static String GetCipherAction() {

			Scanner scanner = new Scanner(System.in);
			System.out.print("Please enter \"Cipher\" or \"UnCipher\"");
			String getAction = scanner.nextLine();
			return getAction;
		}

		static int GetCipehrKey() {

			Scanner scanner = new Scanner(System.in);
			System.out.print("Please enter Cipher key number: ");
			int getCipherKey = scanner.nextInt();
			return getCipherKey;
		}

		static String GetWord() {

			Scanner scanner = new Scanner(System.in);
			System.out.print("Please enter a word: ");
			String getWord = scanner.nextLine();
			return getWord;

		}

		static String Cipher(String toCipher, int cipherKey, char[] alphabetBig, char[] alphabetSmall) {

			
			char[] toCipherChar = toCipher.toCharArray();
			char[] newWord = new char[toCipherChar.length];

			for (int i = 0; i < toCipherChar.length; i++) {
				for (int j = 0; j < alphabetBig.length; j++) {
					if (toCipherChar[i] == alphabetBig[j] ) {
						newWord[i] = alphabetBig[j + cipherKey];
					} else if (toCipherChar[i] == alphabetSmall[j] ) {
						newWord[i] = alphabetSmall[j + cipherKey];
					}
				}
			}

			return String.valueOf(newWord);
		}

		static String UnCipher(String toUnCipher, int cipherKey, char[] alphabetBig, char []alphabetSmall) {

			char[] toUnCipherChar = toUnCipher.toCharArray();
			char[] newWord = new char[toUnCipherChar.length];

			for (int i = 0; i < toUnCipherChar.length; i++) {
				for (int j = 0; j < alphabetBig.length; j++) {
					if (toUnCipherChar[i] == alphabetBig[j] ) {
						newWord[i] = alphabetBig[j - cipherKey];
					} else if (toUnCipherChar[i] == alphabetSmall[j] ) {
						newWord[i] = alphabetSmall[j - cipherKey];
					}
				}
			}

			return String.valueOf(newWord);

		}

		public static void main(String[] args) {

			char[] alphabetSmall = {'�', '�', '�', '�', '�', '�','�', '�', '�', '�', '�','�', '�','�',
					'�', '�', '�','�','�', '�', '�', '�', '�','�', '�', '�', '�', '�', '�', '�' };
			char[] alphabetBig = {'�', '�', '�', '�', '�', '�','�', '�', '�', '�', '�', '�', '�', '�',
					'�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�' };
			String action = GetCipherAction();
			String word = GetWord();
			int cipherKey = GetCipehrKey();

			if (action.equals("Cipher")) {
					System.out.println(Cipher(word, cipherKey, alphabetBig, alphabetSmall));
			} else if (action.equals("UnCipher")) {
					System.out.println(UnCipher(word, cipherKey, alphabetBig, alphabetSmall));
			} else {
				System.out.println("Invalid Data");
			}

		}

}
