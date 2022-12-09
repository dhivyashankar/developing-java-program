package Example;

import java.util.List;

public class IteratingListOfStringAndFourLetterWord {

	public static void main(String[] args) {
		List<String> courses = List.of("spring", "spring boot", "API", "AWS", "Docker");
		
		courses.stream()
		.filter(course -> course.length() >=4)
		.forEach(System.out::println);

	}

}
