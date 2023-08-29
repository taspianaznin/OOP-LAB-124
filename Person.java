package com.mycompany.person;


public class Person {

    public static void main(String[] args) {
        
        test person=new test();
        person.name="Taspia";
        person.age=22;         
        System.out.println("Nmae:"+person.name);
        System.out.println("Age:"+person.age);
    }
}

class test
{
    String name;
    int age;
}
