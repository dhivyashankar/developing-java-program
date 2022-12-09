package Example;

import java.util.List;

public class IteratingListExample {

	public static void main(String[] args) {
		
		printAllNumbersInListStructure(List.of(12,9,0,34,6));

	}

	private static void printAllNumbersInListStructure(List<Integer> numbers) {
		for(int num:numbers) {
			System.out.println(num);
			
		}
		
	}

}
