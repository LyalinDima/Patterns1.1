package ru.lyalindima;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = -1;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public void happyBirthday() {
        age++;
    }

    public boolean hasAge() {
        return age != -1;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public Person setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAge(0).setAddress(address);
    }
}
