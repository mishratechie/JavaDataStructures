package com.JavaHungrysite;
//http://javahungry.blogspot.com/2013/06/java-sorting-program-code-insertion-sort.html

import java.util.ArrayList;
import java.util.Iterator;

public class SelectionSort {
    
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static int[] selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the index of the minimum value
            int minPos = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minPos]) {
                    minPos = j;
                }
            }
            swap(list, minPos, i);
        }
        return list;
    }
    
    
    
    public static void main(String args[]) throws Exception
    {
        //String list="";
        //int i=0,n=0;
        
        //SelectionSort s= new SelectionSort();
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        arrlist.add(50);
        arrlist.add(10);
        arrlist.add(30);
        arrlist.add(40);
        arrlist.add(70);
        arrlist.add(90);
        
        System.out.println(" ");
        System.out.println(" ");
        
        
        //Elements Before sort
        int elementlist[]  = new int[arrlist.size()];
        Iterator<Integer> iter = arrlist.iterator();
        for (int j=0;iter.hasNext();j++) {
            System.out.println(elementlist[j] = iter.next());
        }
        
        elementlist=selectionSort(elementlist);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Values after Selection Sort : ");
        for (int j=0;j<elementlist.length;j++) {
            System.out.println(elementlist[j]+" ");
        }
    }
}