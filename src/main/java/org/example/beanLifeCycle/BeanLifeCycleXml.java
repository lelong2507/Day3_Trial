package org.example.beanLifeCycle;

public class BeanLifeCycleXml {
    public void init(){
        System.out.println("Started");
    };

    public void destroy(){
        System.out.println("Stopped");
    }
}
