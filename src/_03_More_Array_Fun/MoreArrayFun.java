package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun more = new MoreArrayFun();
		String[] test = new String[4];
		test[0] = "hello";
		test[1] = "hi";
		test[2] = "howdy";
		test[3] = "hey";
		more.stringsorder(test);
		System.out.println("----------------------");
		more.stringsreverse(test);
		System.out.println("----------------------");
		more.stringseveryother(test);
		System.out.println("----------------------");
		more.stringsrandom(test);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void stringsorder(String[] string) {
		for(int i = 0; i<string.length; i++) {
			System.out.println(string[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void stringsreverse(String[] string) {
		for(int i = string.length-1; i>0; i--) {
			System.out.println(string[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void stringseveryother(String[] string) {
		for(int i = 0; i< string.length; i = i+2) {
			System.out.println(string[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	void stringsrandom(String[] string) {
		Random rand = new Random();
		for(int i = 0; i<string.length; i++) {
		System.out.println(string[rand.nextInt(string.length)]);
		}
	}
	
}
