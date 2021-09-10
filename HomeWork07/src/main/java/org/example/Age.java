package org.example;

public class Age {
    private int year;
    public int getYear(){ return year; }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + year;
        return result;
    }
}
