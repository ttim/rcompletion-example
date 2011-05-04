package db_sample;

public class Table2Scheme implements TableScheme {
    public String getName() {
        return "Table2!";
    }

    public String[] getFieldNames() {
        return new String[] {"aa", "bb", "table2"};
    }
}
