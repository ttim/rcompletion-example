package ru.abishev.example.db;

public class UserScheme implements TableScheme {
    public String getName() {
        return "UserScheme";
    }

    public String[] getFieldNames() {
        return new String[] {"name", "password", "email"};
    }
}
