package longestCommonPrefix.com.example.longestCommonPrefix;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class SolutionTest {
	Solution solution = new Solution();
	
	@Test
	void testThatItExists() {
		assertNotNull(solution);
	}
	
	@Test
	void testItReturnsAString() {
		String[] inputString = {"flower", "flow", "flight"};
		String output = solution.longestCommonPrefix(inputString);
		String expected = "fl";
		
		assertEquals(expected, output);
	}
	
	@Test
	void testForNoCommonPrefixes() {
		String[] inputString = {"dog", "racecar", "car"};
		
		assertEquals("", solution.longestCommonPrefix(inputString));
	}
	
	@Test
	void testForMoreInputStrings() {
		String[] inputString = {"apple", "ape", "apogee", "apologize", "appear"};
		String output = solution.longestCommonPrefix(inputString);
		String expected = "ap";
		
		assertEquals(expected, output);
	}
}
