package db_sample;

public class MyDbScheme implements DbScheme {
    public TableScheme[] getTableSchemes() {
        return new TableScheme[]{new Table1Scheme(), new Table2Scheme()};
    }
}
