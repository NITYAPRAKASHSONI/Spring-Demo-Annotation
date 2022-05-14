package org.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        // read config file

//ClassPathXmlApplicationContext classPathXmlApplicationContext=new
//        ClassPathXmlApplicationContext("applicationContext.xml");

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
        //get the bean
Coach coach=context.getBean("okayCoach",Coach.class);
        //call the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // close the context
        context.close();
    }
}
