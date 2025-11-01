package ArrayQuestion.java;
// 5. Reverse an array

public class Prob_5 {
    public static void main(String[] args){
        int[] myArray = {3, 5, 6, 7, 8};

        System.out.print("Reverse Array: ");
        for (int i = myArray.length - 1; i >= 0; i--){
            System.out.print(myArray[i] + " ");
        }
    }
}
