package Example;

import java.util.List;

public class IteratingListOfNumbersAndCubeOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printCubeOfAllNumbers(List.of(12,9,0,3,6));


	}

	private static void printCubeOfAllNumbers(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream()
		.map(number -> number*number*number)
		.forEach(System.out::println);
		
	}

}
