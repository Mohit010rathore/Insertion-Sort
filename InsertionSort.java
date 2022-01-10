package com.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr={5,3,4,1,2};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Insertion(int[] arr)
    {
        for(int i=0;i <= arr.length-2 ; i++)
        {
            for(int j=i+1 ; j > 0 ; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[]arr,int j, int i) {
        int temp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
    }
}
