package com.xiaoxiong.arrays;

/**
 * https://leetcode-cn.com/leetbook/read/all-about-array/x9p1iv/
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * @author XiaoXiong
 * @date 2021/7/6 15:21
 */
public class RemoveElement {

    public static void main(String[] args) {

//        int nums[] = {3, 2, 2, 3};
        int nums[] = {3, 3, 2, 2, 3};
        int val = 3;

        int len = removeElement(nums, val);

        // 在函数里修改输入数组对于调用者是可见的。
        // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }


    }

    public static int removeElement(int nums[], int val) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }

        return j;
    }

}
