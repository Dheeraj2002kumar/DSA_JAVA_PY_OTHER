package ArrayQuestion.java;
// 3. Find the sum and average of array elements

public class Prob_3 {
    public static void main(String[] args) {
        int[] myArray = {4, 33, 6, 88, 2, 4};
        
        int sum = 0;
        int average = 0;

        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        average = sum / myArray.length;

        System.out.println("Sum of Array: " + sum);
        System.out.println("Average of Array: " + average);

    }
}
