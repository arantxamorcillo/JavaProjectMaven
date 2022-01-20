package com.bosonit.arantxamorcillo;


import static java.lang.Integer.parseInt;

public class Person {
    private String name;
    private String city = DEFAULT_CITY;
    private String age =  DEFAULT_AGE;

    private static final String DEFAULT_CITY = "Unknown";
    private static final String DEFAULT_AGE = "0";

    public int getAge() {
        return  Integer.parseInt(age);
    }

    public void setAge(String age) {
        this.age = age;
    }





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
    @Override
    public String toString() {
        return "Nombre: "+name+" Poblacion: "+city+" Edad: "+age;
    }


}
