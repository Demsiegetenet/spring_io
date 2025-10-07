package com.revature.spring_io;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
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

    public static void main( String[] args )
    {
         ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
         App obj = context.getBean("app",App.class);
            System.out.println(obj.message);

             App obj1 = context.getBean("app1",App.class);
            System.out.println(obj1.getMessage());

          ((ConfigurableApplicationContext) context).close();
    }
}
