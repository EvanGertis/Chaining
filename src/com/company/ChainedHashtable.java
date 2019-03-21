package com.company;

import java.util.LinkedList;

public class ChainedHashtable {
    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashtable(){
        hashTable = new LinkedList[10];

        for(int i = 0; i < hashTable.length; i++){
            hashTable[i] = new LinkedList<StoredEmployee>();
        }
    }

    //hashing function.
    private int hashKey(String key){
        return key.length() % hashTable.length;
    }
}
