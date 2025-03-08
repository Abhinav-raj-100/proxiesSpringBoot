package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PersonInvocationHandler implements InvocationHandler {

    private Person person;


    public PersonInvocationHandler(Person person)
    {
        this.person = person;
    }

    public Object invoke(Object proxy, Method method,Object [] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("Hi");
        return method.invoke(person,args);
    }
}
