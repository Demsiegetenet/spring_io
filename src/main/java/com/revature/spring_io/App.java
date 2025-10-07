package com.revature.spring_io;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


public class App {
private String message;

public App() {
    
}

 public App(String message) {
    this.message = message;
}

public void setMessage(String message) {
    this.message = message;
}

public String getMessage() {
    return message;
}

//custom method 
public void init(){
    System.out.println("Bean is going through init.");
}

    public static void main( String[] args )
    {

         ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

            // Get the bean using constructor injection
            App obj = context.getBean("app",App.class);
            System.out.println(obj.message);

            // Get the bean using setter injection
            App obj1 = context.getBean("app1",App.class);
            System.out.println(obj1.getMessage());

           // Close the context to release resources
          ((ConfigurableApplicationContext) context).close();
    }
}
