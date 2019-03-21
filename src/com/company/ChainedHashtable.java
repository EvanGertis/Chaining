package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {
    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashtable(){
        hashTable = new LinkedList[10];

        for(int i = 0; i < hashTable.length; i++){
            hashTable[i] = new LinkedList<StoredEmployee>();
        }
    }

    //adds an employee to the hash table with a specific key.
    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        hashTable[hashedKey].add(new StoredEmployee(key, employee));
    }

    //returns the employee with the associated key.
    public Employee get(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee employee = null;

        while(iterator.hasNext()){
            employee = iterator.next();
            if(employee.key.equals(key)){
                return employee.employee; //if the employee is found then return it.
            }
        }

        return  null; //if we don't find it then return null.
    }

    //removes the employee based on employee key.
    public Employee remove(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee employee = null;

        while(iterator.hasNext()){
            employee = iterator.next();
            if(employee.key.equals(key)){ //break if we find the employee
                break;
            }
        }

        //if we traversed the while list and found out that the list was null
        //we couldn't find the employee, so return null
        if((employee == null) || !employee.key.equals(key)){
            return null;
        }
        else{
            //we found the employee so remove the employee.
            hashTable[hashedKey].remove(employee);
            return employee.employee;
        }
    }

    //hashing function.
    private int hashKey(String key){
        return key.length() % hashTable.length;
    }

    //function to print out results.
    public void printHashtable() {
        for (int i = 0; i < hashTable.length; i++){
            if(hashTable[i].isEmpty()){
                System.out.println("Position " + i + ": empty");
            }
            else { // prints out the index as a linnked list connected with an arrow.
                System.out.print("Position " + i + ": ");
                ListIterator<StoredEmployee> iterator = hashTable[i].listIterator();
                while(iterator.hasNext()){
                    System.out.print(iterator.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }
    }
}
