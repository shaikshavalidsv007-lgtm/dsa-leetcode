## Maximum Sum Subarray of Size K

### 🔹 Problem
Given an array of integers `arr[]` and a number `k`, return the maximum sum of a subarray of size `k`.

A subarray is a contiguous part of the array.

---

### 🔹 Examples

**Input:**  
arr = [100, 200, 300, 400], k = 2  
**Output:**  
700  

**Input:**  
arr = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4  
**Output:**  
39  

---

### 🔹 Approach (Sliding Window)

- Maintain a window of size `k`
- Add next element to the window
- Remove the first element of previous window
- Track maximum sum

---

### 🔹 Code

```java
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int i = 0, j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        while (j < arr.length) {
            sum += arr[j];

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}