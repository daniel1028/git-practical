package com.instanceofjava;

public class EncapsulationDemo {

	 String Name;
	    int Id;
	    String address;
	 
	 public String getName() {
	     return Name;
	}
	 
	public void setName(String name) {
	        Name = name;
	}
	 
	public int getId() {
	      return Id;
	}
	 
	public void setId(int id) {
	       Id = id;
	}
	 
	public String getAddress() {
	        return address;
	}
	 
	public void setAddress(String address) {
	        this.address = address;
	}
	public static void main(String [] args){
		 
		EncapsulationDemo obj= new EncapsulationDemo();
	 
	        obj.setName("sai");
	        obj.setId(1);
	        obj.setAddress("xyz");
	 
	        System.out.println(obj.getName());
	        System.out.println(obj.getId());
	        System.out.println(obj.getAddress());
	 
	    }
	}