package com.ssm.test;

public class BinarySearch {



    public static int binarySearch(int arr[],int low ,int high, int key){

        while (high>=low){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid]>key){
                return binarySearch(arr, low, mid-1, key);
            }else {
                return binarySearch(arr, mid+1, high, key);
            }
        }
        return -1;
    }

    public static  int binarySearch2(int arr[],int key){
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]== key){
                return mid;
            }else if(arr[mid] >key)
                high = mid-1;
            else {
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] arr = { 6, 12, 33, 87, 90, 97, 108, 561 };
        int a =binarySearch(arr,0,7,108);
        System.out.println(a+" ");
    }
}
