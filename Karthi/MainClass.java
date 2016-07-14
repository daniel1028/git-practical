package com.sampleproject;

	       public class MainClass{  
	            int rollno;  
	            String name;  
	             
	            void insertRecord(int r, String n){  //method  
	             rollno=r;  
	             name=n;  
	            }  
	             
	            void displayInformation(){System.out.println(rollno+" "+name);}//method  
	             
	            public static void main(String args[]){  
	             MainClass s1=new MainClass();  
	             MainClass s2=new MainClass();  
	             
	             s1.insertRecord(111,"Karan");  
	             s2.insertRecord(222,"Aryan");  
	             
	             s1.displayInformation();  
	             s2.displayInformation();  
	             
	            }  
	           }  
