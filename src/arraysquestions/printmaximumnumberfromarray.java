package arraysquestions;

import java.util.Scanner;

public class printmaximumnumberfromarray {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size of array:");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Maximum number is: " + max);
    }
}