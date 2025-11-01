package ArrayQuestion.java;
// 2. Find the maximum and minimum element in an array

public class Prob_2 {
   public static void main(String[] args) {
    int[] myArray = {10, 5, 20, 15, 0, 8, 20};

    if (myArray == null || myArray.length == 0){
        System.out.println("Array is empty.");
        return;
    }

    int minElement = myArray[0];
    int maxElement = myArray[0];

    for (int i = 1; i < myArray.length; i++){
        if (myArray[i] < minElement){
            minElement = myArray[i];
        }

        if (myArray[i] > maxElement){
            maxElement = myArray[i];
        }
    }

    System.out.println("Minimum Element: " + minElement);
    System.out.println("Maximum Element: " + maxElement);

   } 
}
