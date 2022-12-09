package Example;

import java.util.List;

public class IteratingListOddNumbersUsingFP {

	public static void main(String[] args) {
		printAllOddNumbersInListStructure(List.of(12,9,0,3,6));

	}

	private static void printAllOddNumbersInListStructure(List<Integer> numbers) {
		
		//What to do
		
				//[12,9,0,3,6]  -> List structure
				
				/*Stream structure */
				//12
				//9
				//0
				//3
				//6
				numbers.stream()
				.filter(number -> number%2!=0)
				.forEach(System.out::println); // :: -> method refernce, we are refereing the method println from System.Out, Instead of creating a separate method for print we are using SYSout directly 
				
	}

}
