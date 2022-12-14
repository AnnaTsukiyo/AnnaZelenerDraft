package com.epam.spring.homework1.other;

import com.epam.spring.homework1.beans.BeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanA {
    private BeanA beanA;

    @Autowired
    public OtherBeanA(BeanA bean) {
        this.beanA = bean;
        System.out.println(this.getClass().getSimpleName() + ". " + bean.getClass().getSimpleName() + " was injected through the constructor");
    }
}
