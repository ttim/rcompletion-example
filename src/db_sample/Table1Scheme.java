package db_sample;

public class Table1Scheme implements TableScheme {
    public String getName() {
        return "Table1";
    }

    public String[] getFieldNames() {
        return new String[] {"aa", "bb", "Table1"};
    }
}
