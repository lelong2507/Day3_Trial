package org.example.beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanAnnotationLifeCycle.xml");
        applicationContext.close();
    }
}
