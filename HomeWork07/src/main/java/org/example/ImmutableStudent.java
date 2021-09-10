package org.example;

import java.util.Objects;

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

    @Override
    public boolean equals (Object obj){
        if (obj == this){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        ImmutableStudent student = (ImmutableStudent) obj;
        return (name != null && name.equals(student.getName())) &&
            (group != null && group.equals(student.getGroup())) &&
            (age != null && age.getYear()==student.getAge().getYear());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((group == null) ? 0: group.hashCode());
        result = prime * result + ((age == null) ? 0: age.hashCode());
        return result;
    }
}

