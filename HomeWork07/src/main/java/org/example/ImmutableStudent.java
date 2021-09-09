package org.example;

public final class ImmutableStudent {
    private final String name;
    private final Age age;

    public ImmutableStudent(String name, Age age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){return name;}
    public Age getAge(){return age;}

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Age age){
        this.age = age;
    }

}

