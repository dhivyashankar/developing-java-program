package Example;

import java.util.List;

public class IteratingListUsingFP {

	public static void main(String[] args) {
		
		printAllNumbersInListStructure(List.of(12,9,0,3,6));
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
				.forEach(System.out::println); // :: -> method refernce, we are refereing the method println from System.Out, Instead of creating a separate method for print we are using SYSout directly 
				
		
	}

}
