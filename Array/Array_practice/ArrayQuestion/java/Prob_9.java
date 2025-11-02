package ArrayQuestion.java;
// 4. Insert multiple elements from another array

public class Prob_9 {
   public static void main(String[] args) {
       int[] arr1 = {1, 2, 3, 4};
       int[] arr2 = {5, 6, 7};

       int[] newArray = new int[arr1.length + arr2.length];
       for (int i = 0; i < arr1.length; i++){
        newArray[i] = arr1[i];
       } 

       int count = 0;
       for (int i = arr1.length; i < newArray.length; i++){
        newArray[i] = arr2[count];
        count++;
       }

       for (int i = 0; i < newArray.length; i++){
        System.out.println(newArray[i]);
       }
   } 
}
