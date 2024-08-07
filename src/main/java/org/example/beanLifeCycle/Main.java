package org.example.beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //
//        BeanLifeCycleAnnotation beanAnnotation  = new BeanLifeCycleAnnotation();

        // XML
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanlifecycle.xml");
        applicationContext.close();
//        BeanLifeCycleXml beanXml = applicationContext.getBean("bean", BeanLifeCycleXml.class);
//        beanXml.destroy();
    }
}
