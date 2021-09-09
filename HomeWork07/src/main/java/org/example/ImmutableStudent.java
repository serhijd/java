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

    public ImmutableStudent setName(String name){
        return new ImmutableStudent(name,this.age);
    }

    public ImmutableStudent setAge(Age age){
        return new ImmutableStudent(this.name, age);
    }

}

