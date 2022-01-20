package com.bosonit.arantxamorcillo;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;




public class Application {

    public static void main(String ... parameters) throws IOException {


       String peopleRecords = "src/main/java/com/bosonit/arantxamorcillo/People.txt";

       List <Person> people = new ArrayList<Person>();
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(peopleRecords));


        String line;
        Person person = new Person();
        while (null != (line = reader.readLine()))
        {
            String[] words = line.split(":");
            person.setName(words[0]);
            if (words.length > 3){person.setCity(words[1]);}
            if (words.length > 3){person.setAge (words[2]);}
        }
        people.add(person);
    }



}
