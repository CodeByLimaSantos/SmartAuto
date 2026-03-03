package main;

import java.util.Locale;
import java.util.Scanner;

import customer.Car;
import service.ServiceType;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("------System Smart Auto----");
		
			Car fordKa = new Car (
					"Guilherme",
					"Ford Ka",
					"Black",
					"QZH2324",
					12300
					);
		
		  ServiceType fordKa1 = new ServiceType (
				   "04/03/2026",
				   "Oil Change",
				   ""	
				   );
		
		
		fordKa.carDetails();
		fordKa1.showService();
	    //show actual details of the service
		
	
		fordKa1.confirmService();
		fordKa1.showService();
		//ending the service showing that the service was done.
		
		System.out.println("---SMARTAUTO CLOSED---");
	}
}
