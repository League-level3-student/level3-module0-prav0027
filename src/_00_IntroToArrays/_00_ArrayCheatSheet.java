package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] strings = new String[5];
strings[2] = "two";
		//2. print the third element in the array
System.out.println(strings[2]);
		//3. set the third element to a different value
strings[2] = "different value";
		//4. print the third element again
System.out.println(strings[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
for(int i=0; i<5; i++) {
	strings[i] = "hello"+i;
}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
for(int i=0; i<5; i++) {
	System.out.println(strings[i]);
}
		//7. make an array of 50 integers
int[] integers = new int[50];
		//8. use a for loop to make every value of the integer array a random number
Random rand = new Random();
for(int i=0; i<50; i++) {
	integers[i]=rand.nextInt();
}
		//9. without printing the entire array, print only the smallest number on the array
int smallest=integers[0];
for(int i=0; i<50; i++) {
	if(integers[i]<smallest) {
		smallest = integers[i];
	}
}
System.out.println(smallest);
System.out.println("-------------------------");
		//10 print the entire array to see if step 8 was correct
for(int i=0; i<50; i++) {
	System.out.println(integers[i]);
}
System.out.println("-------------------------");
		//11. print the largest number in the array.
int largest=integers[0];
for(int i=0; i<50; i++) {
	if(integers[i]>largest) {
		largest = integers[i];
	}
}
System.out.println(largest);
System.out.println("--------------------------");
		//12. print only the last element in the array
		System.out.println(integers[49]);
	}
}
