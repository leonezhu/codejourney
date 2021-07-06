package com.xiaoxiong.arrays;

import java.util.Arrays;

/**
 * http://gitlab.tools.vipshop.com/mp.groups/maintenance-center/merge_requests/97
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * @author XiaoXiong
 * @date 2021/7/5 19:28
 */
public class MoveZero {


    public static void main(String[] args) {

        int nums[] = {0, 1, 0, 3, 12};

        moveZeroes2(nums);
//        moveZeroes(nums);

        Arrays.stream(nums).forEach(System.out::println);

    }
    public static void moveZeroes(int[] nums) {
        int zeronums = 0;
        int i = 0;
        for(i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeronums++;
            }
            else if(zeronums != 0) {
                nums[i - zeronums] = nums[i];
                nums[i] = 0;
            }
        }
    }


    public static void moveZeroes2(int[] nums) {
        int i = 0;  //指向0
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;

            }

        }
    }

}
