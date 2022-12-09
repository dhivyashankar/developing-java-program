package Example;

import java.util.List;

public class IteratingListEvenExample {

	public static void main(String[] args) {
		printAllEvenNumbersInListStructure(List.of(12,9,0,3,6));
	}

	private static void printAllEvenNumbersInListStructure(List<Integer> numbers) {
		for(int num:numbers) {
			if(num%2==0) {
				System.out.println(num);
			}
			
			
		}
	}

}
