package Basic_01;

import java.util.Scanner;


public class Basic_01 {
	
	@SuppressWarnings("resource")
	public static void main(String[]args) {
		
		System.out.print("input nums : ");
		//Scanner °´Ã¼ »ý¼º  
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//print result 
		System.out.println("Sum : " + (num1+num2)+"\r");
		System.out.println("Sub : " + (num1-num2)+"\r");
		System.out.println("Mul : " + (num1*num2)+"\r");
		System.out.printf("div : " + "%.2f\n"+"\r",((double)num1/(double)num2));
		
	}

}
