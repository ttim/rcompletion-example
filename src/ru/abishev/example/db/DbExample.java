package ru.abishev.example.db;

public class DbExample {
    public static void main(String[] args) {
        DbSqlCreator<MyDbScheme> sqlCreator = new DbSqlCreator<MyDbScheme>();

//        sqlCreator.from(CommentScheme.class).select("text");
        sqlCreator.from(UserScheme.class).select("email");


        sqlCreator.from(CommentScheme.class).select("parent_comment_id");

    }
}
