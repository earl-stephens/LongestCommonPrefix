package longestCommonPrefix.com.example.longestCommonPrefix;

public class Solution {

	public String longestCommonPrefix(String[] inputString) {
		for(String word: inputString) {
			System.out.println(word.valueOf(word.toCharArray(), 0, 2));
		}
		return "";
	}
}
