/*
Problem: Find Minimum Element in Array
Platform: Basic (Arrays)
Approach: Traverse array and keep track of minimum
Time Complexity: O(n)
Space Complexity: O(1)
Author: Farhan
*/
package arraysquestions;

import java.util.Scanner;

public class printtheminimumeelementofarray {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Minimum number is: " + min);
    }
}