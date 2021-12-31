package com.greatlearning.main;

import java.util.Scanner;

public class Driver {
	static Scanner scanner = new Scanner(System.in);
	static int numberOfCompanies;
	static double[] shareOfCompanies;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort mergesort = new MergeSort();
		LinerSearch linearsearch = new LinerSearch();
		
		System.out.println("Enter the number of companies");
		numberOfCompanies = scanner.nextInt();
		boolean statusOfCompany;
		int profitOfCompanies=0;
		int lossOfCompanies =0;
		shareOfCompanies = new double[numberOfCompanies];
		if(numberOfCompanies ==1) {
			System.out.println("Enter current stock price of the company 1");
			shareOfCompanies[0] = scanner.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			statusOfCompany = scanner.nextBoolean();
			if(statusOfCompany) {
				profitOfCompanies++;
			}
			if(!statusOfCompany) {
				lossOfCompanies++;
			}
			
		}
		else {
			for(int i=0;i<numberOfCompanies; i++) {
				System.out.println("Enter current stock price of the company "+(i+1));
				shareOfCompanies[i] = scanner.nextDouble();
				System.out.println("Whether company's stock rose today compare to yesterday");
				statusOfCompany =scanner.nextBoolean();
				if(statusOfCompany) {
					profitOfCompanies++;
				}
				if(!statusOfCompany) {
					lossOfCompanies++;
				}
			}
		}
		
		int option = Integer.MIN_VALUE;
		while(option != 0) {
			System.out.println("");
			System.out.println("-------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("-----------------------------------------------");
			option = scanner.nextInt();
			
		
		switch(option) {
		case 1:
			mergesort.sort(shareOfCompanies,0,numberOfCompanies-1,1);
			System.out.println("Stock prices in ascending order are :");
			Driver.displayStocks();
			break;
		case 2:
			mergesort.sort(shareOfCompanies,0,numberOfCompanies-1,2);
			System.out.println("Stock prices in descending order are :");
			Driver.displayStocks();
			break;
		case 3:
			System.out.println("Total no of companies whose stock price rose today : "+profitOfCompanies);
			break;
		case 4 :
			System.out.println("Total no of companies whose stock price declined today : "+lossOfCompanies);
			break;	

		case 5 :
			System.out.println("Enter the key value");
			double valueToSearch = scanner.nextDouble();
			int result = linearsearch.search(valueToSearch,shareOfCompanies);
			if(result == -1)
			{
				System.out.println("Value not found");
			}
			else
			{
				System.out.println("Stock of value "+valueToSearch+" is present");				
			}
			break;
		default:
			break;
			
		}	

	}
	}
	public static void displayStocks()
	{
		for(int i=0; i< numberOfCompanies;i++)
		{
			System.out.print(shareOfCompanies[i] +" ");
		}
		System.out.println("");
	}


}
