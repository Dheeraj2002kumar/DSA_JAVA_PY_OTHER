package ArrayQuestion.java;
// 3. Insert an element at the end

public class Prob_8 {
   public static void main(String[] args) {
       int[] arr = {4, 5, 6, 7, 8};

       int[] newArray = new int[arr.length + 1];

       for (int i = 0; i < arr.length; i++){
        newArray[i] = arr[i];
       }

       newArray[newArray.length  - 1] = 55;

       for (int i = 0; i < newArray.length; i++){
        System.out.println(newArray[i]);
       }

   } 
}
