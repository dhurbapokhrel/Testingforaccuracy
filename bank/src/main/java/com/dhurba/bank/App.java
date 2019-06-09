package com.dhurba.bank;

import org.jboss.mobicents.seam.model.Actor;
import org.jboss.mobicents.seam.model.Category;
import org.json.HTTP;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
    	String s = "ram";
    	HTTP h = new HTTP();
 
    	
    	Bank bm = new Bank();
    	bm.checking();
    	bm.saving();
    	
        Employee em = new Employee();
        em.saving();
        em.checking();
        
        Department dm= new Department();
        dm.checking();
        dm.saving();
        
       // AnnotationBeanNameGenerator an = new AnnotationBeanNameGenerator();
       // Annotation
        //Annotation
    }
    
}
