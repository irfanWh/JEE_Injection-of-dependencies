package com.irfan.pres;

import com.irfan.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.irfan");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("Result: "+metier.calcul());
    }
}
