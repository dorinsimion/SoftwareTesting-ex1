package com.company;

public class ArraysUtils {
    public int binarySearch(int[] arr,int n){
        int l=0;
        int r=arr.length-1;
        while (l<=r){
            int m=(l+r)/2;
            if(n==arr[m]) return m;
            else if(n<arr[m]) r=m-1;
            else l=m+1;
        }
        return -(l+1);
    }

    public void bubbleSort(int[] arr){
        int n=arr.length;
        boolean swap;
        do{
            swap=false;
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int aux=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=aux;
                    swap=true;
                }
            }
            n--;
        }while(swap);
    }


}
