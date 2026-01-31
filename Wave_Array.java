class Solution {
    public void sortInWave(int arr[]) {
        int n =arr.length;

    

        java.util.Arrays.sort(arr);

        for (int i=0;i<n-1;i=i+2){
            
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
}


  // second possible approach 

class Solution {
    public void sortInWave(int arr[]) {

        for (int i = 0; i < arr.length; i += 2) {

            if (i == arr.length - 1)
                break;

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
