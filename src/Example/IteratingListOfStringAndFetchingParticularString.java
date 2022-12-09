package Example;

import java.util.List;

public class IteratingListOfStringAndFetchingParticularString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printParticularString(List.of("spring", "spring boot", "API", "AWS", "Docker"));
		
		List<String> courses = List.of("spring", "spring boot", "API", "AWS", "Docker");
		
		courses.stream()
		.filter(course -> course.contains("spring"))
		.forEach(System.out::println);
	}

	

}
