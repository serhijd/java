package org.example;

import java.time.LocalDate;

public interface PersonDriver {
    String firstName();
    String lastName();
    LocalDate birthday();
    Person.Gender gender();
}
