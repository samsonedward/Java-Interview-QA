package Interview.Interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Eachwords {

	public static void main(String[] args) {
		Map<String, Integer> result = new LinkedHashMap<>();
		String sentence = "Bangalore is a metro city and it is a garden city";
		String[] words = sentence.split(" ");
		for (String word : words) {
			if (result.get(word) == null) {
				result.put(word, 1);
			} else {
				result.put(word, result.get(word) + 1);
			}
		}
		System.out.println(result);
	}
}
