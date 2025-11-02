package ArrayQuestion.java;
// 1. Insert an element at a specific index


public class Prob_6 {
   public static void main(String[] args) {
       int[] arr = {5, 4, 3, 6, 7};

       int[] newArray = new int[arr.length + 1];
       // insert element in 2 index and value is 44
       for (int i = 0; i < 2; i++){
        newArray[i] = arr[i];
       }
       newArray[2] = 44;

       for (int i = 2; i < arr.length; i++){
        newArray[i + 1] = arr[i];
       }

       for (int i = 0; i < newArray.length; i++){
        System.out.println(newArray[i]);
       }
   } 
}
