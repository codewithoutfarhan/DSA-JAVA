package ARRAYSFINALBOSS;



// bascially the main function cannon return the boolean value as its main function so we
//will create a cariable which name will be found pahele uska variable rhega ki its false agar
// element mil jaye make it true or it let it reamil false

//then check if the value is false then say element do not exists else if the found value is true
// ofc element existss and return true



public class searchthetargetinthegivenarray {
    public static  void main(String[]args) {
//        System.out.println(" i will print the target ");
        int arr[] = {10, 78, 98, 63, 74, 98, 12,21};
        int target = 21;
        boolean found = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found =true;
                break;
            }
        }
        if(found){
            System.out.println(" element does exist there");
        }
        else{
            System.out.println(" theres no targeted element in the array ");
        }

    }
    }