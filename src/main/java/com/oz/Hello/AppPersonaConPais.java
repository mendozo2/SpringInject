package com.oz.Hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oz.beans.Mundo;
import com.oz.beans.Persona;

public class AppPersonaConPais {
    public static void main( String[] args )
    {    ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/oz/xml/beansPersonaPais.xml");
    
    Persona p = (Persona) applicationContext.getBean("personaPais");   
    System.out.println("personaAllvalues "+p);
    
 
    ((ConfigurableApplicationContext)applicationContext).close(); 

	}
}
