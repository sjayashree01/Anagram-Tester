package test_suite;

import java.util.Arrays;
import org.junit.Test;

/***
 * A simple unit test to verify if the given two string values can be an anagram or not.
 * Note: Complexity is O(nlogn) though.
 * 
 * ***/

public class Anagram {

	java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Anagram.class.getName());

	String str1 = "newly";
	String str2 = "34353";

	@Test
	public void isAnagramOrNot() {

		if (str1 == null || str2 == null || str1.length() != str2.length()) {
			return;
		}

		char[] cr1 = str1.toCharArray();
		char[] cr2 = str2.toCharArray();
		Arrays.sort(cr1);
		Arrays.sort(cr2);
		
		if (Arrays.equals(cr1,cr2)) {
			logger.info("Yes an anagram!");
		} else {
			logger.info("Not an anagram!");
		}

	}

}
