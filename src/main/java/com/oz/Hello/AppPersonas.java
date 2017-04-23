package com.oz.Hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oz.beans.Mundo;
import com.oz.beans.Persona;

public class AppPersonas {

	public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/oz/xml/beansPersona.xml");
      
      Persona p = (Persona) applicationContext.getBean("personaAllvalues");   
      System.out.println("personaAllvalues "+p);
      
      p = (Persona) applicationContext.getBean("personaContructorInt");   
      System.out.println("personaContructorInt "+p);
      
      p = (Persona) applicationContext.getBean("personaConstructorName");   
      System.out.println("personaConstructorName "+p);
      
      p = (Persona) applicationContext.getBean("personaContructorIndex");   
      System.out.println("personaContructorIndex "+p);
      
      
      ((ConfigurableApplicationContext)applicationContext).close(); 

	}

}
