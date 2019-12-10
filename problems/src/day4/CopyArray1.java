package day4;

public class CopyArray1 {

	public static void main(String[] args) {
//		Write a program that creates an array of ten integers. It should put ten random numbers from 1 to 100 in the array.
//		It should copy all the elements of that array into another array of the same size. 
//		Then display the contents of both arrays. To get the output to look like mine, you'll need a several for loops.
//	    Create an array of ten integers
//	    Fill the array with ten random numbers (1-100)
//	    Copy the array into another array of the same capacity
//	    Change the last value in the first array to a -7
//	    Display the contents of both arrays 
		
		int[] tenInts = new int[10];
		int[] dest = new int[10];
		
		int rand;
		for(int i = 0; i < tenInts.length; i ++) {
			rand = (int)(Math.random()*100 + 1);
			tenInts[i] = rand;
		}
		
		for(int i = 0; i < tenInts.length; i++) {
			dest[i] = tenInts[i];
		}
		
		
	}

}
