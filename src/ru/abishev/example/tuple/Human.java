package ru.abishev.example.tuple;

import java.util.ArrayList;
import java.util.List;

public class Human extends Tuple {
    @Override
    public List<TupleType> tupleDeclaration() {
        return new ArrayList<TupleType>() {{
            add(TupleType.of("Name", String.class));
            add(TupleType.of("Surname", String.class));
            add(TupleType.of("Age", Integer.class));
        }};
    }
}
