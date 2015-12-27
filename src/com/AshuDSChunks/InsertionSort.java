package com.AshuDSChunks;
/*
 * Bubble sort, sometimes incorrectly referred to as sinking sort, is a simple sorting algorithm that works by repeatedly stepping through the list to be sorted,
 *  comparing each pair of adjacent items and swapping them if they are in the wrong order. The pass through the list is repeated until no swaps are needed,
 *   which indicates that the list is sorted. The algorithm gets its name from the way smaller elements "bubble" to the top of the list. 
 *   Because it only uses comparisons to operate on elements, it is a comparison sort. 
 * Although the algorithm is simple, most of the other sorting algorithms are more efficient for large lists.
 * 
 * 
 * */
public class InsertionSort {

private int[] theArray = new int[50]; // Creates an array with 50 indexes
	
	private int arraySize = 10; // Elements in theArray
	
	//Filling array randomly
	public void generateRandomArray(){
		
		for(int i = 0; i < arraySize; i++){
			
			// Random number 10 through 19
			
			theArray[i] = (int)(Math.random()*10)+10;
			
		}
		
	}
	
	
	public int[] getTheArray(){
		
		return theArray;
		
	}
	
	public int getArraySize(){
		
		return arraySize;
		
	}
	
	// Prints the Array on the screen in a grid
	
	public void printArray(){
		
		System.out.println("----------");
		
		for(int i = 0; i < arraySize; i++){
			
			System.out.print("| " + i + " | ");
			
			System.out.println(theArray[i] + " |");
			
			System.out.println("----------");
			
		}
		
	}
	// The Insertion Sort is normally the best of 
	// the elementary sorts. Unlike the other sorts that
	// had a group sorted at any given time, groups are
	// only partially sorted here.
	
	public void insertionSort(){
		
		for (int i = 1; i < arraySize; i++){
			  int j = i;
			  int toInsert = theArray[i];
			  while ((j > 0) && (theArray[j-1] > toInsert)){
				  theArray[j] = theArray[j-1];
				  j--;
				  
				  printHorzArray(i, j);
				  
			  }
			  theArray[j] = toInsert;
			  
			  printHorzArray(i, j);
			  
			  System.out.println("\nArray[i] = " + theArray[i] + " Array[j] = " + theArray[j] + " toInsert = " + toInsert + "\n");
			  
		}
		
	}


	public void printHorzArray(int i, int j){
		
		for(int n = 0; n < 51; n++)System.out.print("-"); //------------
		
		System.out.println();
		
		for(int n = 0; n < arraySize; n++){ 
			
			System.out.print("| " + n + "  ");//| 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  |
			
		}
		
		System.out.println("|");//|
		
		for(int n = 0; n < 51; n++)System.out.print("-"); //---------------------------------------------------
		
		System.out.println();
		
		for(int n = 0; n < arraySize; n++){
			
			System.out.print("| " + theArray[n] + " "); //| 10 | 11 | 14 | 13 | 14 | 16 | 10 | 17 | 18 | 18 |
			
		}
		
		System.out.println("|");//|
		
		for(int n = 0; n < 51; n++)System.out.print("-");
		
		System.out.println();
		
		// END OF FIRST PART
		
		
		// ADDED FOR BUBBLE SORT
		
		if(j != -1){
		
			// ADD THE +2 TO FIX SPACING
			
			for(int k = 0; k < ((j*5)+2); k++)System.out.print(" ");
			
			System.out.print(j);
			
		}
		
		
		// THEN ADD THIS CODE
		
		if(i != -1){
			
			// ADD THE -1 TO FIX SPACING
			
			for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");
			
			System.out.print(i);
			
		}
		
		System.out.println();
		
	}
	
	public void swapValues(int indexOne, int indexTwo){
		
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
		
	}
	
	public static void main(String[] args) {
	
		InsertionSort insertionSort=new InsertionSort();
		
		insertionSort.generateRandomArray();
		int sizeOfArray=insertionSort.arraySize;
		System.out.println("sizeOfArray : "+sizeOfArray);
		
		System.out.println("Array Generated randomly " );
		insertionSort.printArray();
		insertionSort.insertionSort();
		
		
		
		
	}
	
	
}
