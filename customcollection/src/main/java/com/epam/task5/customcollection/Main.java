package com.epam.task5.customcollection;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) 
	    {
	    	CustomList<Integer> list = new CustomList<Integer>();
	        Scanner sc=new Scanner(System.in);
	        int choice;
	        int f=0;
	        while(f==0) {
	        System.out.println("Enter 1 to add elements \nEnter 2 to remove elements \nEnter 3 to retrieve elements \nEnter 4 to get size of list");
	        //Add elemen1ts
	        choice=sc.nextInt();
	        switch(choice) {
	        case 1:
	        	int k=0;
	        	while(k==0)
	        {
	        System.out.println("enter the number to be added");
	        int h=sc.nextInt();
	        list.add(h);
	        System.out.println("do you want to add more elements? If yes enter 0 or enter 1 to stop");
	        k=sc.nextInt();
	       
	        }
	        		System.out.println(list);
	        		break;
	        //Remove elements from index
	        case 2:System.out.println("Enter the index of element to be removed");
	        		int index=sc.nextInt();
	        	    list.remove(index);
	        		System.out.println(list);
	        		break;
	         
	        //Get element with index
	        case 3:System.out.println("Enter the index of element to be retrieved");
    		     int index1=sc.nextInt();
	        	System.out.println( list.get(index1) );
	             break;
	        //List Size
	        case 4:System.out.println(list.size());
	        		break;
	        default:System.out.println("Enter correct choice");
	    }
	        System.out.println("do you want to continue? If yes enter 0 or enter 1 to exit");
	        f=sc.nextInt();
	    }
	        
	    }

}
