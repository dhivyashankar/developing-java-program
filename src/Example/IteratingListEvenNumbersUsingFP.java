package Example;

import java.util.List;

public class IteratingListEvenNumbersUsingFP {

	public static void main(String[] args) {
		printAllEvenNumbersInListStructure(List.of(12,9,0,3,6));

	}
	
	private static boolean isEven(int num) {
		return num%2==0;
		
	}

	private static void printAllEvenNumbersInListStructure(List<Integer> numbers) {
		//[12,9,0,3,6]  -> List structure
		
				/*Stream structure */
				//12
				//9
				//0
				//3
				//6
				numbers.stream()
				.filter(IteratingListEvenNumbersUsingFP::isEven)
				.forEach(System.out::println); // :: -> method refernce, we are refereing the method println from System.Out, Instead of creating a separate method for print we are using SYSout directly 
				
	}

}
