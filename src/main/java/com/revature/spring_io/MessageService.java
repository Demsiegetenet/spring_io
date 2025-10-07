package com.revature.spring_io;

public class MessageService {
    private String message;

    public MessageService() {
    }

   public MessageService(String message) {
       this.message = message;
   }

    public void printMessage() {
         System.out.println("Message: " + message);
    }

   public void setMessage(String message) {
       this.message = message;
   }

    public String getMessage() {
         return message;
    }

    //    custom method
    public void init(){
        System.out.println("Bean is going through init.");
    }
}
