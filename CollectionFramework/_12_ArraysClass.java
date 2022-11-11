package com.CollectionsFramework;

import java.util.Arrays;

public class _12_ArraysClass {

    public static void main(String[] args) {

        int[] i = {1,2,3,4,5,6,7,8,9,10};

        int index = Arrays.binarySearch(i,5);
        System.out.println("The index of number 5 in array i is "+index);

        int[] nums = {22,43,56,27,84,12,59,95,32,41};
        Arrays.sort(nums);
        for(int ele:nums){
            System.out.print(ele+"   ");    // sorted
        }
        System.out.println("\n");

        int[] nums1 = {22,43,56,27,84,12,59,95,32,41,-3,-2,-4};
        Arrays.sort(nums1);
        for(int ele:nums1){
            System.out.print(ele+"   ");    // sorted
        }


    }
}
