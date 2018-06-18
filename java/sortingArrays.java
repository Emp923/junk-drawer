import java.util.Scanner;

public class sortingArrays {
	
	public static void printArray(int[] nums) {
		System.out.print("{");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (i == nums.length - 1) break;
			System.out.print(", ");
		}
		System.out.println("}");
	}
	
	public static int findLargestElement(int[] nums) {
		int largest = 0;
		for (int i = 0; i < nums.length; i++) {
			if (largest < nums[i]) {
				largest = nums[i];
			}
		}
		return largest;
	}
	
	public static int[] sortArray(int[] nums) {
		
		for (int j = nums.length; j > 0; j--) {
			for (int i = 1; i < j; i++) {
				int first = nums[i - 1];
				int second = nums[i];
				if (first > second) {
					nums[i - 1] = second;
					nums[i] = first;
				}
			}
		}
		
		return nums;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter total number of array elements: ");
		int total = s.nextInt();
		
		int[] myArray = new int[total];
		for (int i = 0; i < total; i++) {
			System.out.print("Enter next element: ");
			myArray[i] = s.nextInt();
		}
		
		printArray(myArray);
		int largestValue = findLargestElement(myArray);
		System.out.println("Largest value = " + largestValue);
		
		int[] sortedArray = new int[total];
		sortedArray = sortArray(myArray);
		printArray(sortedArray);
		
		s.close();
	}

}
