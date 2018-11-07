package com.ssm.test;

public class QuickSort {
    public static void quickSort(int arr[],int low ,int high) {
        int i, j, key;
        if (low >= high) {
            return;
        }
        i = low;
        j = high;
        key = arr[low];
        while (i < j) {
            while (i < j && key <= arr[j])
                j--;
            if(i<j){
                arr[i] = arr[j];
                i++;
            }
            while (i < j && key >= arr[i])
                i++;
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
            arr[i] = key;
        }
        quickSort(arr, low, i - 1);
        //递归调用右半数组
        quickSort(arr, i + 1, high);
    }
        public static void main(String args[]){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        for (int a:arr
             ) {
            System.out.print(a+" ");
        }
    }

}
