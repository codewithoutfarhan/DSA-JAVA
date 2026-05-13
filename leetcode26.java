package interview150questions;

public class leetcode26 {

// easiest code and question ever from the leetcode

    public static void main(String[] args) {

        int nums[] = {1,1,2,2,3,4,4};

        int result = removeElementsfromsortedarrays(nums);

        System.out.println(result);

        for(int i = 0; i < result; i++){
            System.out.println(nums[i]);
        }
    }

    public static int removeElementsfromsortedarrays(int nums[]){

        int count = 0;

        for(int i = 0; i < nums.length; i++){

            if(i < nums.length - 1 && nums[i] == nums[i+1]){
                continue;
            }

            else {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}
