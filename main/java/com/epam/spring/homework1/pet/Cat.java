package com.epam.spring.homework1.pet;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component(value = "Cat")
@Order(2)
public class Cat implements Animal{
}
