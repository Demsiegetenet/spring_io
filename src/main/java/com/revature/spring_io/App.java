package com.revature.spring_io;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


public class App {
    public static void main( String[] args )
    {

         ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

            // Get the bean using constructor injection
            MessageService myMsg = context.getBean("messageService",MessageService.class);
            myMsg.printMessage();

            MessageService myMsg2 = context.getBean("messageService2",MessageService.class);
            System.out.println( myMsg2.getMessage());


           // Close the context to release resources
          ((ConfigurableApplicationContext) context).close();
    }
}
