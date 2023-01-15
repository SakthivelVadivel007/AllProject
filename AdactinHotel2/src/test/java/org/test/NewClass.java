package org.test;

public class NewClass {
	NewClass() {
		System.out.println("default constructor");
		
	}
		
		 NewClass(String name) {
			this();
			System.out.println("para constructor: " + name);
		
		}
		
		
		
		public  static void main(String[] args) {
			
			NewClass cl = new NewClass("sakthivel");
			}

	}


