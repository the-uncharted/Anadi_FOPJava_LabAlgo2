package task_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //HAS-A
		System.out.println("Please enter number of Currency notes in your country");
		int size=sc.nextInt();
		
		int currency[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Currency Denomination"+i);
			currency[i]=sc.nextInt();
		}
		System.out.println("B4" +Arrays.toString(currency));
		BubbleSort bs=new BubbleSort();
		bs.sort(currency);
		System.out.println("AF" +Arrays.toString(currency));
		
		
		System.out.println("Please enter the payment amount");
		int amount=sc.nextInt();
		
		CurrencyCount nc=new CurrencyCount();
		nc.counting(currency,amount);

	}

}
