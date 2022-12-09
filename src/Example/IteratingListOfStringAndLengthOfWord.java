package Example;

import java.util.List;

public class IteratingListOfStringAndLengthOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> courses = List.of("spring", "spring boot", "API", "AWS", "Docker");
		
		courses.stream()
		.map(course -> course +" "+ course.length())
		.forEach(System.out::println);

	}

}
