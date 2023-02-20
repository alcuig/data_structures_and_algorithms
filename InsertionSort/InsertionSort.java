import java.util.Random; //import package to instantiate random numbers

public class InsertionSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		} // generates array of 10 randomly generated numbers

		System.out.println("Before :");
		printArray(numbers);

		insertionSort(numbers);

		System.out.println("\nAfter:");
		printArray(numbers);
	}

	private static void insertionSort(int[] inputArray) {
		for (int i = 1; i < inputArray.length; i++) { // iterates right through list indexes
			int valueToSort = inputArray[i];
			int sortedListIndex = i - 1;

			while (sortedListIndex >= 0 && valueToSort < inputArray[sortedListIndex]) {
				inputArray[sortedListIndex + 1] = inputArray[sortedListIndex]; // copy bigger value to right
				inputArray[sortedListIndex] = valueToSort; // shift value to sort 1 place to left
				sortedListIndex--; // shift to next left element of sorted list
			}
			inputArray[sortedListIndex + 1] = valueToSort;
		}
	}

	private static void printArray(int[] numbers) { // prints out values in list
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}