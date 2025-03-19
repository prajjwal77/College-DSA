package DSAPrep;

import java.util.Arrays;
import java.util.Scanner;

public class FindPlatformGFGAtlassian {
	 public static int findPlatform(int arr[], int dep[]) {
	        // Sort arrival and departure times
	        Arrays.sort(arr);
	        Arrays.sort(dep);

	        int n = arr.length;
	        int platformsNeeded = 1; // At least one platform is needed
	        int result = 1;
	        int i = 1; // Index for arrival array
	        int j = 0; // Index for departure array

	        // Traverse through arrival and departure arrays
	        while (i < n && j < n) {
	            // If arrival time is less than or equal to departure time,
	            // a new platform is needed
	            if (arr[i] <= dep[j]) {
	                platformsNeeded++;
	                i++;

	                // Update the result if needed
	                result = Math.max(result, platformsNeeded);
	            } else {
	                // If arrival time is greater than departure time,
	                // a platform can be freed
	                platformsNeeded--;
	                j++;
	            }
	        }

	        return result;

	 }
	 public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Arrays:");
		size = scanner.nextInt();
		
		int arr[] = new int[size];
		int dep[] = new int[size];
		
		System.out.println("Enter the arrival time of train as HHMM :");
		for(int i=0;i<size;i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the Departure time of train as HHMM :");
		for(int i=0;i<size;i++) {
			dep[i] = scanner.nextInt();
		}
		
		System.out.println("Number of platform are requireds : "+ findPlatform(arr, dep));
	}
}
