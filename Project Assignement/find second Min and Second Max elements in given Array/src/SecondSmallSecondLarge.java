import java.util.*;

public class SecondSmallSecondLarge {

	public static void main(String[] args) {
		int a;
		int arr[] = { 1, 2, 5, 9, 6, 4, 7, 2 };
		System.out.println("Array = " + Arrays.toString(arr));
		int count = arr.length;
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (arr[i] > arr[j]) {
					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}

		System.out.println("Second Min: " + arr[1]);
		System.out.println("Second Max: " + arr[count - 2]);
	}
}
