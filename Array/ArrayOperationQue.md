Perfect 👏 — practicing **array operation questions** is one of the best ways to master DSA fundamentals.

Below is a list of **important array operation problems** categorized by **operation type**, along with **difficulty levels**, **key concepts**, and **what they test** in interviews (Google, Amazon, Microsoft, etc.).

---

## 🧱 1. **Traversal / Basic Manipulation**

| # | Problem                                              | Level | Concept Tested         |
| - | ---------------------------------------------------- | ----- | ---------------------- |
| 1 | Print all elements of an array                       | Easy  | Simple traversal       |
| 2 | Find the **maximum and minimum** element in an array | Easy  | Iteration & comparison |
| 3 | Find the **sum** and **average** of array elements   | Easy  | Traversal, aggregation |
| 4 | **Count even and odd numbers** in an array           | Easy  | Conditional logic      |
| 5 | **Reverse** an array                                 | Easy  | Two-pointer method     |

🧩 *Try in both Python and Java.*

---

## ⚙️ 2. **Insertion Operations**

| # | Problem                                                      | Level  | Concept Tested                                             |
| - | ------------------------------------------------------------ | ------ | ---------------------------------------------------------- |
| 1 | Insert an element at a **specific index**                    | Easy   | Shifting elements                                          |
| 2 | Insert an element at the **beginning**                       | Easy   | Index manipulation                                         |
| 3 | Insert an element at the **end**                             | Easy   | Dynamic resizing (Python list append / Java ArrayList add) |
| 4 | Insert multiple elements from another array                  | Medium | Merging logic                                              |
| 5 | Insert element in a **sorted array** while maintaining order | Medium | Binary Search + shifting                                   |

🧠 **Hint:** In Java, you can use `ArrayList.add(index, value)`; in Python use `list.insert(index, value)`.

---

## ❌ 3. **Deletion Operations**

| # | Problem                                         | Level  | Concept Tested        |
| - | ----------------------------------------------- | ------ | --------------------- |
| 1 | Delete an element at a given **index**          | Easy   | Shifting              |
| 2 | Delete a **specific value** from an array       | Easy   | Searching + removal   |
| 3 | Delete all **occurrences** of a value           | Medium | Filtering             |
| 4 | Delete **duplicate elements** from sorted array | Medium | Two-pointer technique |
| 5 | Delete elements **less than K**                 | Medium | Conditional filtering |

💡 *Try doing deletions both by value and by position.*

---

## 🔍 4. **Searching Operations**

| # | Problem                                               | Level  | Concept Tested                |
| - | ----------------------------------------------------- | ------ | ----------------------------- |
| 1 | **Linear Search**                                     | Easy   | Basic iteration               |
| 2 | **Binary Search** (sorted array)                      | Easy   | Divide & conquer              |
| 3 | Search in **rotated sorted array**                    | Medium | Modified binary search        |
| 4 | Find **first and last occurrence** of an element      | Medium | Boundary binary search        |
| 5 | Find the **index of the element just greater than X** | Medium | Binary search with conditions |

🧠 *Learn both iterative and recursive binary search.*

---

## 🧩 5. **Update / Modification Operations**

| # | Problem                                      | Level  | Concept Tested           |
| - | -------------------------------------------- | ------ | ------------------------ |
| 1 | Replace a value at a given index             | Easy   | Index access             |
| 2 | Increment each element by 1                  | Easy   | Traversal                |
| 3 | Multiply all even elements by 2              | Easy   | Conditional modification |
| 4 | Update all negative numbers to 0             | Easy   | Data cleaning logic      |
| 5 | Update array elements based on another array | Medium | Element-wise operation   |

---

## 🔄 6. **Merging and Splitting**

| # | Problem                                   | Level  | Concept Tested           |
| - | ----------------------------------------- | ------ | ------------------------ |
| 1 | Merge two arrays into one                 | Easy   | Array concatenation      |
| 2 | Merge two **sorted arrays**               | Medium | Two-pointer technique    |
| 3 | Split an array into **two halves**        | Easy   | Index slicing            |
| 4 | Merge multiple arrays into one            | Medium | Dynamic appending        |
| 5 | Find intersection and union of two arrays | Medium | Set operations / Hashing |

🧠 *Classic interview problem:* **Merge Sorted Arrays** (LeetCode #88).

---

## 🧮 7. **Sorting Operations**

| # | Problem                               | Level  | Concept Tested                |
| - | ------------------------------------- | ------ | ----------------------------- |
| 1 | Sort an array in ascending order      | Easy   | Built-in sort                 |
| 2 | Sort an array in descending order     | Easy   | Reverse sorting               |
| 3 | Sort an array of 0s, 1s, and 2s       | Medium | Dutch National Flag algorithm |
| 4 | Find **kth smallest/largest** element | Medium | Quickselect / Heap            |
| 5 | Sort elements by **frequency**        | Hard   | HashMap + Sorting comparator  |

---

## 🧠 8. **Combination Operations (Multiple Steps)**

| # | Problem                                             | Level  | Concept Tested                        |
| - | --------------------------------------------------- | ------ | ------------------------------------- |
| 1 | Insert an element, then delete another              | Medium | Combined manipulation                 |
| 2 | Merge, then sort                                    | Medium | Integration logic                     |
| 3 | Remove duplicates, then find max                    | Medium | Chaining multiple operations          |
| 4 | Rotate an array (left/right) by k positions         | Medium | Reversal algorithm                    |
| 5 | Shift all zeroes to the end while maintaining order | Medium | Two-pointer technique (LeetCode #283) |

---

## ⚡ 9. **Advanced Array Operations**

| # | Problem                                           | Level  | Concept Tested              |
| - | ------------------------------------------------- | ------ | --------------------------- |
| 1 | Find **subarray with given sum**                  | Medium | Prefix sum / sliding window |
| 2 | Find **maximum subarray sum**                     | Medium | Kadane’s Algorithm          |
| 3 | Find **duplicate number** without modifying array | Hard   | Floyd’s Cycle Detection     |
| 4 | Find **first missing positive integer**           | Hard   | Index marking technique     |
| 5 | **Rotate matrix (2D array)** by 90°               | Hard   | Transpose + reverse rows    |

---

## 🧾 Example Coding Tasks

### ✅ Python Examples

```python
# Insert Operation
arr = [1, 2, 3, 5]
arr.insert(3, 4)
print(arr)  # [1, 2, 3, 4, 5]

# Delete Operation
arr.remove(2)
print(arr)  # [1, 3, 4, 5]

# Search Operation
if 4 in arr:
    print("Found 4 at index", arr.index(4))

# Update Operation
arr[2] = 10
print(arr)  # [1, 3, 10, 5]
```

### ✅ Java Examples

```java
import java.util.*;

public class ArrayOps {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,5));
        
        // Insert
        arr.add(3, 4);
        System.out.println(arr);

        // Delete
        arr.remove(Integer.valueOf(2));
        System.out.println(arr);

        // Search
        if (arr.contains(4))
            System.out.println("Found 4 at index " + arr.indexOf(4));

        // Update
        arr.set(2, 10);
        System.out.println(arr);
    }
}
```

---

## 🧭 Practice Order for Mastery

| Week | Focus Area                       | Example Problems                  |
| ---- | -------------------------------- | --------------------------------- |
| 1    | Traversal + Insertion + Deletion | Basic CRUD array operations       |
| 2    | Searching + Updating             | Linear, Binary, Replace           |
| 3    | Merging + Sorting                | Merge Sorted, Union, Intersection |
| 4    | Mixed + Advanced                 | Rotate, Subarray sum, Kadane’s    |

---

Would you like me to create a **practice sheet (with 25 problems)** — starting from basic array operations to advanced (with links to LeetCode/GFG)?
It would be a ready-to-follow list to build your array foundation for interviews like Google SDE1.
