package test;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] intArray1;
		intArray1 = new int[10];
		
		intArray1[0]= 50;
		intArray1[1]= 20;
		System.out.println("Index 0 est : " + intArray1[0] );
		int len1 = intArray1.length;
		System.out.println(len1);
	}

}
