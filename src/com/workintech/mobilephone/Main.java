package com.workintech.mobilephone;

public class Main {
    public static void main(String[] args) {


        MobilePhone phone= new MobilePhone("11155454");
        phone.addNewContact(Contact.createContact("ahmet", "12313435"));
        phone.addNewContact(Contact.createContact("mehmet", "987654321"));
        phone.addNewContact(Contact.createContact("ali", "9517536248"));
        phone.addNewContact(Contact.createContact("veli", "1593574826"));

        phone.printContact();

        Contact jon= new Contact("jon", "1235");
        phone.addNewContact(jon);
        System.out.println(phone.findContact("jon"));
        System.out.println(phone.findContact("ahmet"));

    }
}
