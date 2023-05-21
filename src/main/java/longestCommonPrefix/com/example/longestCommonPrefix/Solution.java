package longestCommonPrefix.com.example.longestCommonPrefix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public String longestCommonPrefix(String[] inputString) {
		Arrays.sort(inputString, (string1, string2) -> string1.length() - string2.length());
		int shortestWord = inputString[0].length();
		String outputString = "";
		
		List<String> intermediateArray = new ArrayList<>();
		for(int i = 0; i < shortestWord; i++) {
			for(String word: inputString) {				
				intermediateArray.add(word.valueOf(word.toCharArray(), 0, (i + 1)));
			}
			if(intermediateArray.stream().distinct().count() == 1) {
				outputString = intermediateArray.get(0);
				intermediateArray.clear();
			}
		}
		return outputString;
	}
}
