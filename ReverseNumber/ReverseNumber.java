import java.util.Scanner;

public class ReverseNumber{
	public static void main(String []args){

	long reverseNumber = 0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number");
	long number = scanner.nextLong();
	
	while(number != 0){
	reverseNumber=reverseNumber * 10;	 	//To get the reversed number
	reverseNumber = reverseNumber + number % 10;  	
	number = number / 10; 		//Remove the printed digit
	}
	System.out.println("Reversed Number:" + reverseNumber);
	}	
	
}

