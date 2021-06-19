package leetcode.editor.cn;
 
//给定两个数组，编写一个函数来计算它们的交集。 
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2]
// 
//
// 示例 2： 
//
// 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[9,4] 
//
// 
//
// 说明： 
//
// 
// 输出结果中的每个元素一定是唯一的。 
// 我们可以不考虑输出结果的顺序。 
// 
// Related Topics 排序 哈希表 双指针 二分查找 
// 👍 377 👎 0

// 两个数组的交集

import java.util.Arrays;

public class T349_IntersectionOfTwoArrays{
    public static void main(String[] args) {
        Solution solution = new T349_IntersectionOfTwoArrays().new Solution();
         
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //        排序 + 双指针；
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] result = new int[length1 + length2];
        int k = 0;
        int max = length1 > length2 ? length1 : length2;
        int i = 0;
        int j = 0;
        while (i < length1 && j < length2) {
            int cur1 = nums1[i];
            int cur2 = nums2[j];
            if (cur1 == cur2) {
//                result[k++] = cur1;
                if (k == 0 || cur1 != result[k - 1]) {
                    result[k++] = cur1;
                }
                i++;
                j++;
            }
            if (cur1 < cur2) {
                i++;
            } else if(cur1 > cur2) {
                j++;
            }
        }
        return Arrays.copyOfRange(result, 0, k);

//        Set<Integer> nums1Set = new HashSet<Integer>();
//        Set<Integer> nums2Set = new HashSet<Integer>();
//        Set<Integer> numsSet = new HashSet<Integer>();
//        for (int cur1 : nums1) {
//            nums1Set.add(cur1);
//            numsSet.add(cur1);
//        }
//        for (int cur2 : nums2) {
//            nums2Set.add(cur2);
//            numsSet.add(cur2);
//        }
//        int length1 = nums1Set.size();
//        int length2 = nums2Set.size();
//        int length = numsSet.size();
//        int[] result = new int[length1 + length2 - length];
//        int i = 0;
//        for (int cur : numsSet) {
//            if (nums1Set.contains(cur) && nums2Set.contains(cur)) {
//                result[i++] = cur;
//            }
//        }
//        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}