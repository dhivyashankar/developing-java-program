package Example;

import java.util.List;

public class IteratingListUsingStreams {

	public static void main(String[] args) {
		printAllNumbersInListStructure(List.of(12,9,0,3,6));

	}

	private static void print(int number) {
		System.out.println(number);
		
	}
	private static void printAllNumbersInListStructure(List<Integer> numbers) {
		//[12,9,0,3,6]  -> List structure
		
		/*Stream structure */
		//12
		//9
		//0
		//3
		//6
		numbers.stream()
		.forEach(IteratingListUsingStreams::print); // :: -> method refernce, we are refereing the method print from the class IteratingListUsingStreams 
		
	}

}
