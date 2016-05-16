package com.EricHelloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

      //Reading out a message to 
      obj.getMessage();
      
      obj = (HelloWorld) context.getBean("goodByeWorld");
      
      //Read Out message that I added as a goodbye.
      obj.getMessage();
      
      obj.getMessageIn();
   }
}