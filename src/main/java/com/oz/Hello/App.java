package com.oz.Hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oz.beans.Mundo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/oz/xml/beans.xml");
      Mundo m = (Mundo) applicationContext.getBean("mundo");   
      System.out.println("This is the result "+m.saludo);
      ((ConfigurableApplicationContext)applicationContext).close(); 
    }
}
