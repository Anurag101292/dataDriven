package com.CN.Search;

public class TernarySearch {
public static int searchTernary(int [] arr , int l ,int r , int x){

    if(l<=r){
        int mid1= l+(r-l)/3;
        int mid2= r-(r-l)/3;
        if(arr[mid1]==x)
            return mid1;
        if(arr[mid2]==x)
            return mid2;
        if(arr[mid1]>x){
           return searchTernary(arr,l,mid1-1,x);
        }else if(x>arr[mid2]){
           return searchTernary(arr,mid2+1,r,x);
        }else{return searchTernary(arr,mid1+1,mid2-1,x);
        }
    }
    return -1;
}
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    int l=0;
    int r= arr.length;
    int x=5;
        int index=searchTernary(arr,l,r,x);
        if(index==-1){
            System.out.print("Element not present");
        }else{
            System.out.print("Element present at"+index);
        }

    }
}
