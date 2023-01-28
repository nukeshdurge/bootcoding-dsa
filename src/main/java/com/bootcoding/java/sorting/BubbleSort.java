package com.bootcoding.java.sorting;

public class BubbleSort {
    public int[] bubbleSort (int[] a){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {20, 10, 50, 30, 5};
        BubbleSort ss = new BubbleSort();
        int[] b = ss.bubbleSort(a);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);

        }
    }
}

