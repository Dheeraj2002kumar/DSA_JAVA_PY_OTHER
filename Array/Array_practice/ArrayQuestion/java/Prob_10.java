package ArrayQuestion.java;
// 5. Insert element in a sorted array while maintaining order


public class Prob_10 {
   public static void main(String[] args) {
       int[] arr = {2, 3, 4, 6, 7, 8};
       int[] addEleArray = {5};

       int[] newArray = new int[arr.length + addEleArray.length];
       for(int i = 0; i < arr.length; i++){
        newArray[i] = arr[i];
       }
       
        int idx = 0;
        for (int i = arr.length; i < newArray.length; i++){
            newArray[i] = addEleArray[idx];
            idx++;
        }
        
        for (int i = 0; i < newArray.length; i++){
         System.out.println(newArray[i]);
        }

        int n = newArray.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-i-1; j++){
                if(newArray[j] > newArray[j + 1] ){
                    int temp = newArray[j];
                    newArray[j] = newArray[j+1];
                    newArray[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

        
   } 
}





// package ArrayQuestion;

// // 5. Insert element in a sorted array while maintaining order

// public class Prob_10 {
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 4, 6, 7, 8};
//         int elementToAdd = 5;

//         // Create a new array with one extra space
//         int[] newArray = new int[arr.length + 1];

//         int i = 0;
//         // Copy elements smaller than the elementToAdd
//         while (i < arr.length && arr[i] < elementToAdd) {
//             newArray[i] = arr[i];
//             i++;
//         }

//         // Insert the new element
//         newArray[i] = elementToAdd;

//         // Copy the remaining elements
//         while (i < arr.length) {
//             newArray[i + 1] = arr[i];
//             i++;
//         }

//         // Print the result
//         System.out.print("Array after inserting " + elementToAdd + ": ");
//         for (int num : newArray) {
//             System.out.print(num + " ");
//         }
//     }
// }
