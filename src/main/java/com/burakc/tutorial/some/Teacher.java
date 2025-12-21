package com.burakc.some;

public class Teacher {


    static void main() {
        Person person= new Person();

        System.out.println(person.publicData);
        //System.out.println(person.privateData);
        System.out.println(person.protectedData);
        System.out.println(person.defaultData);
    }
}