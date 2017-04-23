package com.oz.Hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.oz.beans.Mundo;

public class AppWithAnnotation {
    public static void main( String[] args )
    {
    	//AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
    	//AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class,AppConfig2.class);
    	AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
    	applicationContext.register(AppConfig.class);
    	applicationContext.register(AppConfig2.class);
        applicationContext.refresh();
      Mundo m = (Mundo) applicationContext.getBean("mundo");   
      System.out.println("This is the result "+m.saludo);
      
      m = (Mundo) applicationContext.getBean("marte");   
      System.out.println("This is the result "+m.saludo);
      ((ConfigurableApplicationContext)applicationContext).close(); 
    }
}
