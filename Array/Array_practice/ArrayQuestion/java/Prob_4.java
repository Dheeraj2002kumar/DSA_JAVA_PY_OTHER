package ArrayQuestion.java;
// 4. Count even and odd numbers in an array


public class Prob_4 {
    public static void main(String[] args) {
        int[] myArray = {4, 5, 6, 7, 8, 3, 4};
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] % 2 == 0){
                evenCount += 1;
            } else{
                oddCount += 1;
            }
        }

        System.out.println("Even Count in an array: " + evenCount);
        System.out.println("Odd Count in an Array: " + oddCount);

    }
}
