package com.CN.Sorting;

public class SelectionSort {
    //Sabse minimumvale ko sabse aage lakr laga dete hai
public static void makeSelectionSort(int[] a){
    int temp=0;
    for (int i=0;i< a.length; i++){
        int min=i;//i ki value hr baar change na ho isliye minimum banaya
        for (int j=i+1;j<a.length;j++){
            if(a[j]<a[min]){
                min=j;
            }
        }
        temp = a[i];
        a[i]=a[min];
        a[min]=temp;
    }
    for(int i =0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
}
    public static void main(String[] args) {
    int [] a={10,33,4,53,23,6};
    makeSelectionSort(a);
    }
}
