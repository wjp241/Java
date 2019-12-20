package day14;
import java.io.*;
import java.util.Arrays;

public class io3 {

	public static void main(String[] args) {
		byte[] inSrc = {0,12,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
	
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = input.read()) != -1) {
			output.write(data);
		}
		
		System.out.println(output.toString());
		outSrc = output.toByteArray();
		System.out.println("Input Source :" + Arrays.toString(inSrc));
		System.out.println("Out Source :" + Arrays.toString(outSrc));

	}
	
	

}
