package org.example.beanLifeCycle;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifeCycleAnnotation {

    @PostConstruct
    public void init(){
        System.out.println("The system is init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("The system has been closed!");
    }

}
