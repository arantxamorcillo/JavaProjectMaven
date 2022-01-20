package com.bosonit.arantxamorcillo;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Application {

    public static void main(String ... parameters) throws IOException {


       String peopleRecords = "src/main/java/com/bosonit/arantxamorcillo/People.txt";

       List <Person> people = new ArrayList<Person>();
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(peopleRecords));
        String line;

        while (null != (line = reader.readLine()))
        {
            Person person = new Person();
            String[] words = line.split(":");

            person.setName(words[0]);

            if (!(words.length < 2)){person.setCity(words[1]);}
            if (!(words.length < 3)){person.setAge (words[2]);}
            people.add(person);
            System.out.println(person.getName());
        }

        List<Person> peopleUnder25 = people.stream()
                .filter(personInPeople -> personInPeople.getAge()<25)
                .filter(personInPeople -> personInPeople.getAge()>0)
                .collect(Collectors.toList());
        peopleUnder25.forEach(personInPeople -> System.out.println(personInPeople.toString()));
    }





}
