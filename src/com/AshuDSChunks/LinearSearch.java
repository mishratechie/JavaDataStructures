package com.AshuDSChunks;

public class LinearSearch {

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

public String linearSearchForValue(int value){
		
		boolean valueInArray = false;
		
		String indexsWithValue = "";
			
		System.out.print("The Value was Found in the Following Indexes: ");
		
		for(int i = 0; i < arraySize; i++){
			
			if(theArray[i] == value) {
				valueInArray = true;
				
				System.out.print(i + " ");
				
				indexsWithValue+= i + " ";
			}
			
		}
		
		if(!valueInArray){
			indexsWithValue = "None";
			
			System.out.print(indexsWithValue);
		}
			
		System.out.println();
		
		return indexsWithValue;
			
	}
	
	public static void main(String[] args) {
	
		LinearSearch linearSearch=new LinearSearch();
		
		linearSearch.generateRandomArray();
		int sizeOfArray=linearSearch.arraySize;
		System.out.println("sizeOfArray : "+sizeOfArray);
		
		System.out.println("Array Generated randomly " );
		linearSearch.printArray();
		
		linearSearch.linearSearchForValue(55);
		
	}
	
	
}
