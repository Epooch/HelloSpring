package com.EricHelloSpring;

import java.util.Scanner;

public class HelloWorld {
   private String message;
   private String messageIn;

   public void setMessage(String message){
      this.message  = message;
   }

   public void getMessage(){
      System.out.println("Microsoft's Clippy: " + message);
   }
   
   public void getMessageIn(){
	   System.out.println("TestMessage");
	   Scanner reader = new Scanner(System.in);
	   System.out.println("enter a test message: ");
	   String n = reader.next();  
	   System.out.println(n);
	   
   }
   
   public void setMessageIn(String messageIn){
	   this.messageIn = messageIn;
   }
}