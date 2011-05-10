package ru.abishev.example.db;

import ru.abishev.example.tuple.ICompletionProvider;

import java.util.ArrayList;
import java.util.List;

public class DbSqlCreator<T extends DbScheme> implements ICompletionProvider {
    private String selectFrom;

    public DbSqlCreator() {
        // only for suggestion
    }

    public <V extends TableScheme> DbSqlSelector<V> from(Class<V> tableSchemaClass) {
        try {
            this.selectFrom = tableSchemaClass.newInstance().getName();
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return new DbSqlSelector<V>(selectFrom);
    }

    public List<String> getCompletionList(DbScheme scheme) {
        try {
            List<String> result = new ArrayList<String>();

            int i = 0;
            for (TableScheme table : scheme.getTableSchemes()) {
                i++;
                result.add("from(" + table.getClass().getSimpleName() + ".class)");
            }

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<String>();
        }
    }
}
