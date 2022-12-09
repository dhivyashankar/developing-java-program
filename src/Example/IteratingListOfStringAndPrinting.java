package Example;

import java.util.List;

public class IteratingListOfStringAndPrinting {

	public static void main(String[] args) {
	
		printAllStrings(List.of("spring", "spring boot", "API", "AWS", "Docker"));
	}

	private static void printAllStrings(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream()
		.forEach(System.out::println);
		
		
	}

}
