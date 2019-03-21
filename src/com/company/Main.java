package com.company;

public class Main {

    public static void main(String[] args) {
        //Test code.
        Employee evanGertis = new Employee("Evan", "Gertis", 1);
        Employee maxWilliam = new Employee("Max", "William", 2);
        Employee billGates = new Employee("Bill", "Gates", 1);

        //hash table object.
        ChainedHashtable ht = new ChainedHashtable();

        //add some elements.
        ht.put("Evan", evanGertis);
        ht.put("Max", maxWilliam);
        ht.put("Bill", billGates);

        //just get one element.
        System.out.println("Retrieve key Evan: " + ht.get("Evan"));

        ht.remove("Bill");

        //show everything stored in the table.
        ht.printHashtable();


    }
}
