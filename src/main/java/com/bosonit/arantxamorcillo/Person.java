package com.bosonit.arantxamorcillo;



public class Person {
    private String name;
    private String city = DEFAULT_CITY;
    private String age =  DEFAULT_AGE;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }



    private static final String DEFAULT_CITY = "Unknown";
    private static final String DEFAULT_AGE = "Unknown";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getCity() {
        return city ;
    }

    public void setCity(String city) {
            this.city = city;
    }


}
