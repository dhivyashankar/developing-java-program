package Example;

import java.util.List;

public class IteratingListOfNumbersAndSquareOfNumbers {

	public static void main(String[] args) {
		printSquareOfAllNumbers(List.of(12,9,0,3,6));

	}

	private static void printSquareOfAllNumbers(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
		numbers.stream()
		.map(number -> number*number)
		.forEach(System.out::println);
	}

}
