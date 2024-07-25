
    import java.util.ArrayList;
import java.util.List;

class MajorityEle {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        // Step 1: Find potential candidates
        int candidate1 = 0, candidate2 = 1, count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                 count1--;
                count2--;
            }
        }

        // Step 2: Verify the candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        int n = nums.length;
        if (count1 > n / 3) {
            result.add(candidate1);
        }
        if (count2 > n / 3) {
            result.add(candidate2);
        }

        return result;
    }

    public static void main(String[] args) {
        MajorityEle solution = new MajorityEle();
        int[] nums = {2,2,1,1,1,2,2,2,6,6,7,6,6,6};
        System.out.println(solution.majorityElement(nums)); // Output: [3]
    }
}

// Let's go through the example `nums = [7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5]` step by step using the corrected code:

// ### Initialization
// - `candidate1 = 0`, `candidate2 = 1`
// - `count1 = 0`, `count2 = 0`

// ### Step 1: Finding Potential Candidates

// 1. **First element: 7**
//    - `num = 7`
//    - Since `count1 == 0`, `candidate1 = 7` and `count1 = 1`
//    - `candidate1 = 7`, `count1 = 1`, `candidate2 = 1`, `count2 = 0`

// 2. **Second element: 7**
//    - `num = 7`
//    - Since `num == candidate1`, `count1++`
//    - `candidate1 = 7`, `count1 = 2`, `candidate2 = 1`, `count2 = 0`

// 3. **Third element: 5**
//    - `num = 5`
//    - Since `count2 == 0`, `candidate2 = 5` and `count2 = 1`
//    - `candidate1 = 7`, `count1 = 2`, `candidate2 = 5`, `count2 = 1`

// 4. **Fourth element: 7**
//    - `num = 7`
//    - Since `num == candidate1`, `count1++`
//    - `candidate1 = 7`, `count1 = 3`, `candidate2 = 5`, `count2 = 1`

// 5. **Fifth element: 5**
//    - `num = 5`
//    - Since `num == candidate2`, `count2++`
//    - `candidate1 = 7`, `count1 = 3`, `candidate2 = 5`, `count2 = 2`

// 6. **Sixth element: 1**
//    - `num = 1`
//    - Since `num != candidate1` and `num != candidate2`, `count1--` and `count2--`
//    - `candidate1 = 7`, `count1 = 2`, `candidate2 = 5`, `count2 = 1`

// 7. **Seventh element: 5**
//    - `num = 5`
//    - Since `num == candidate2`, `count2++`
//    - `candidate1 = 7`, `count1 = 2`, `candidate2 = 5`, `count2 = 2`

// 8. **Eighth element: 7**
//    - `num = 7`
//    - Since `num == candidate1`, `count1++`
//    - `candidate1 = 7`, `count1 = 3`, `candidate2 = 5`, `count2 = 2`

// 9. **Ninth element: 5**
//    - `num = 5`
//    - Since `num == candidate2`, `count2++`
//    - `candidate1 = 7`, `count1 = 3`, `candidate2 = 5`, `count2 = 3`

// 10. **Tenth element: 5**
//     - `num = 5`
//     - Since `num == candidate2`, `count2++`
//     - `candidate1 = 7`, `count1 = 3`, `candidate2 = 5`, `count2 = 4`

// 11. **Eleventh element: 7**
//     - `num = 7`
//     - Since `num == candidate1`, `count1++`
//     - `candidate1 = 7`, `count1 = 4`, `candidate2 = 5`, `count2 = 4`

// 12. **Twelfth element: 7**
//     - `num = 7`
//     - Since `num == candidate1`, `count1++`
//     - `candidate1 = 7`, `count1 = 5`, `candidate2 = 5`, `count2 = 4`

// 13. **Thirteenth element: 5**
//     - `num = 5`
//     - Since `num == candidate2`, `count2++`
//     - `candidate1 = 7`, `count1 = 5`, `candidate2 = 5`, `count2 = 5`

// 14. **Fourteenth element: 5**
//     - `num = 5`
//     - Since `num == candidate2`, `count2++`
//     - `candidate1 = 7`, `count1 = 5`, `candidate2 = 5`, `count2 = 6`

// 15. **Fifteenth element: 5**
//     - `num = 5`
//     - Since `num == candidate2`, `count2++`
//     - `candidate1 = 7`, `count1 = 5`, `candidate2 = 5`, `count2 = 7`

// 16. **Sixteenth element: 5**
//     - `num = 5`
//     - Since `num == candidate2`, `count2++`
//     - `candidate1 = 7`, `count1 = 5`, `candidate2 = 5`, `count2 = 8`

// **Candidates after the first pass:**
// - `candidate1 = 7`, `count1 = 5`
// - `candidate2 = 5`, `count2 = 8`

// ### Step 2: Verification

// Reset `count1` and `count2` to zero and count the occurrences of `candidate1` and `candidate2` in the array.

// 1. **First element: 7**
//    - `num = 7`
//    - Since `num == candidate1`, `count1++`
//    - `count1 = 1`, `count2 = 0`

// 2. **Second element: 7**
//    - `num = 7`
//    - Since `num == candidate1`, `count1++`
//    - `count1 = 2`, `count2 = 0`

// 3. **Third element: 5**
//    - `num = 5`
//    - Since `num == candidate2`, `count2++`
//    - `count1 = 2`, `count2 = 1`

// 4. **Fourth element: 7**
//    - `num = 7`
//    - Since `num == candidate1`, `count1++`
//    - `count1 = 3`, `count2 = 1`

// 5. **Fifth element: 5**
//    - `num = 5`
//    - Since `num == candidate2`, `count2++`
//    - `count1 = 3`, `count2 = 2`

// 6. **Sixth element: 1**
//    - `num = 1`
//    - `count1 = 3`, `count2 = 2`

// 7. **Seventh element: 5**
//    - `num = 5`
//    - Since `num == candidate2`, `count2++`
//    - `count1 = 3`, `count2 = 3`

// 8. **Eighth element: 7**
//    - `num = 7`
//    - Since `num == candidate1`, `count1++`
//    - `count1 = 4`, `count2 = 3`

// 9. **Ninth element: 5**
//    - `num = 5`
//    - Since `num == candidate2`, `count2++`
//    - `count1 = 4`, `count2 = 4`

// 10. **Tenth element: 5**
//     - `num = 5`
//     - Since `num == candidate2`, `count2++`
//     - `count1 = 4`, `count2 = 5`

// 11. **Eleventh element: 7**
//     - `num = 7`
//     - Since `num == candidate1`, `count1++`
//     - `count1 = 5`, `count2 = 5`

// 12. **Twelfth element: 7**
//     - `num = 7`
//     - Since `num == candidate1`, `count1++`
//     - `count1 = 6`, `count2 = 5`

// 13. **Thirteenth element: 5**
//     - `num = 5`
//     - Since `num == candidate2`, `count2++`
//     - `count1 = 6`, `count2 = 6`

// 14. **Fourteenth element: 5**
//     - `num = 5`
//     - Since `num == candidate2`, `count2++`
//     - `count1 = 6`, `count2 = 7`

// 15. **Fifteenth element: 5**
//     - `num = 5`
//     - Since `num == candidate2`, `count2++`
//     - `count1 = 6`, `count2 = 8`

// 16. **Sixteenth element: 5**
//     - `num = 5`
//     - Since `num == candidate2`, `count2++`
//     - `count1 = 6`, `count2 = 9`

// **Final counts:**
// - `count1 = 6` for `candidate1 = 7`
// - `count2 = 9` for `candidate2 = 5`

// **Checking if counts are greater than `n/3` (`n = 16`, `n/3 ≈ 5.33`):**
// - `count1 = 6` is greater than `5.33`, so `candidate1
