package ru.abishev.example.db;

public class MyDbScheme implements DbScheme {
    public TableScheme[] getTableSchemes() {
        return new TableScheme[]{new UserScheme(), new CommentScheme()};
    }
}
