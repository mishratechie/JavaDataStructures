package com.JavaHungrysite;


import java.util.ArrayList;
import java.util.Iterator;

public class QuickSort {
    
    
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    private static void quicksort(int list[], int from, int to) {
        // If the indexes cross, then we've sorted the whole array.
        if (from >= to) {
            return;
        }
        
        // Choose a pivot value and then partition the array so that every value
        // less than the pivot is positioned before the pivot in the array and
        // every value greater than the pivot is positioned after the pivot in
        // the array.
        int pivot = list[from];
        int i = from - 1;
        int j = to + 1;
        while (i < j) {
            // Keep incrementing from the start of the range so long as the
            // values are less than the pivot.
            i++;
            while (list[i] < pivot) { i++; }
            // Keep decrementing from the end of the range so long as the values
            // are greater than the pivot.
            j--;
            while (list[j] > pivot) { j--; }
            // So long at the indexes have not crossed, swap the pivot with the
            // value that was out of place.
            if (i < j) {
                swap(list, i, j);
            }
        }
        
        // Recursively sort the two portions of the array
        quicksort(list, from, j);
        quicksort(list, j + 1, to);
    }
    
    // Helper method that kicks off the recursive quicksort method
    public static int[] quicksort(int [] list) {
        quicksort(list, 0, list.length-1);
        return list;
    }
    
    
    
    
    public static void main(String args[]) throws Exception
    {
        //String list="";
        //int i=0,n=0;
        
        //QuickSort s= new QuickSort();
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
        
        
        elementlist=quicksort(elementlist);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Values after Quick Sort : ");
        for (int j=0;j<elementlist.length;j++) {
            System.out.println(elementlist[j]+" ");
        }
    }
    
    
}