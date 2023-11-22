package com.oleileia.spring.basic_dl.quick_start_byname;

import com.oleileia.spring.basic_dl.quick_start_byname.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartByTypeApplication {

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);
    }
}
