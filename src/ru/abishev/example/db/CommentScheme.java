package ru.abishev.example.db;

public class CommentScheme implements TableScheme {
    public String getName() {
        return "Comments";
    }

    public String[] getFieldNames() {
        return new String[]{"text", "user_id", "parent_comment_id"};
    }
}
