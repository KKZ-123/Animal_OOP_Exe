package main_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import animal_model.Animals;

public class MainApp1 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static Animals[] animals = new Animals[10];
	
	public static void main(String [] args) throws IOException {
		
			inputData();
			System.out.println("\nTotal Number of Animals : " + Animals.totalCount);
			for(int i =0; i <Animals.totalCount; i++ ) {
				animals[i].display();
			}
	}
	public static void inputData() throws IOException {
		String flag = "";
		do {
			System.out.print("Enter Animal Name:  "); 
			String name = br.readLine();
			System.out.print("Enter Animal Specises: ");
			String specises = br.readLine();
			System.out.print("Enter Animal Age: ");
			int age =  Integer.parseInt(br.readLine());
			
			Animals animal = new Animals();
			animal.name = name;
			animal.age = age;
			animal.specises = specises;
			
			animals[Animals.totalCount] = animal;
			Animals.totalCount++;

			System.out.print("Do you want to add new Employee yes/ no? : ");
			flag = br.readLine();
			
		}while(flag.equalsIgnoreCase("yes"));
	}
}
