package org.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        // read config file

ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //get the bean
Coach coach=classPathXmlApplicationContext.getBean("okayCoach",Coach.class);
        //call the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // close the context
        classPathXmlApplicationContext.close();
    }
}
