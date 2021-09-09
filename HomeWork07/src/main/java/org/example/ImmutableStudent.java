package org.example;

public final class ImmutableStudent {
    private final String name;
    private final String group;
    private final Age age;


    public ImmutableStudent(String name, String group, Age age) {
        this.name = name;
        this.group = group;
        Age cloneAge = new Age();
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
    }

    public String getName(){return name;}
    public String getGroup(){return group;}

    public Age getAge(){
        Age cloneAge = new Age();
        cloneAge.setYear(this.age.getYear());
        return cloneAge;
    }

    public ImmutableStudent setName(String name){
        return new ImmutableStudent(name,this.group,this.age);
    }
    public ImmutableStudent setGroup(String group){
        return new ImmutableStudent(this.name,group,this.age);
    }
    public ImmutableStudent setAge(Age age){
        return new ImmutableStudent(this.name, this.group, age);
    }

}

