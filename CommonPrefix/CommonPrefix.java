
/**
 *
 * @author William Yang
 *
 */
public class CommonPrefix {

	/**
	 * Runs some test cases of the method.
	 * @param args Unused parameter
	 */
	public static void main(String[] args) {

		System.out.println(common("Hello", "Hehaw"));
		System.out.println(common("hello", "Hehaw"));
		System.out.println(common("asdf", "asdfghjk"));

	}

	/**
	 * Determines the common prefix of two Strings.
	 * @param string1 The first String to find the common prefix of.
	 * @param string2 The second String to find the common prefix of.
	 * @return The common prefix of the two Strings.
	 */
	public static String common(String string1, String string2) {

		String commonPrefix = "";
		int shorterLength = (string1.length() < string2.length()) ? string1.length() : string2.length();

		for(int i = 0; i < shorterLength; i++) {

			if(string1.charAt(i) == string2.charAt(i)) {

				commonPrefix += string1.charAt(i);

			} else {

				break;

			}

		}

		return commonPrefix;

	}

}
