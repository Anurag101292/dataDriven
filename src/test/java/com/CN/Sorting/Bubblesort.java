package com.CN.Sorting;

public class Bubblesort {
    //Adjacent element ko compare karata haii and sort krta jaata hai
    //No. of rouds =no of values-1
    public static void makebubblesort(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {//this is for rounds
            int flag = 0;//agar round se pehle sb swap ho gye
            for (int j = 0; j < a.length - 1 - i; j++) {//comparison for 2 adjacent element
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {36, 19, 29, 12, 5, 87, 38, 32, 43, 22};
        makebubblesort(a);

    }
}
