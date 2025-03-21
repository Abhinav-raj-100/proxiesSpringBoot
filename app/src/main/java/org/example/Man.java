package org.example;

public class Man implements Person{

    private  String name;

    private int age;

    private String city;

    private String country;

    public Man(String name, int age, String city, String country)
    {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country =country;
    }

    @Override
    public void introduce(String name) {
        System.out.println("My Name is "+ this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void sayAge(int age) {
        System.out.println("My age is "+this.age);
    }

    @Override
    public void sayWhereFrom(String city, String country) {
        System.out.println(("I am from "+ this.city +"belongs to country "+ this.country));
    }
}
