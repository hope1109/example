package com.hope.algorithm;

public class QuickSort {

    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        while(low > high){
            return;
        }
        i = low;
        j = high;
        temp = arr[low];//基准

        while(i < j){
            while(arr[j] >=temp && i <j){
                j--;
            }
            while(arr[i] <= temp && i < j){
                i++;
            }
            if(i < j){
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }

        arr[low] = arr[i];
        arr[i] = temp;

        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);
    }
    public static void main(String[] args) {

        int arr[] = {12, 23, 11, 4, 7, 6, 8, 6, 3, 3, 45};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
