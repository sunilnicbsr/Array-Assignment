
public class MaximumDiff {
	// Java implementation of the approach 


	// Function to return the maximum 
	// absolute difference between 
	// any two elements of the array 
	static int maxAbsDiff(int arr[], int n) 
	{ 

		// To store the minimum and the maximum 
		// elements from the array 
		int minEle = arr[0]; 
		int maxEle = arr[0]; 
		for (int i = 1; i < n; i++) { 
			minEle = Math.min(minEle, arr[i]); 
			maxEle = Math.max(maxEle, arr[i]); 
		} 

		return (maxEle - minEle); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		//int[] arr = { 2, 5, 1, 7, 3, 9, 5};
		int[] arr = { 9, 2, 12, 5, 4, 7, 3, 19, 5};
		int n = arr.length; 
		System.out.print(maxAbsDiff(arr, n)); 
	} 



}
