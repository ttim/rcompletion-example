package ru.abishev.example.tuple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract public class Tuple implements ICompletionProvider {
    private final List<TupleType> types;
    private final Map<String, Object> values = new HashMap<String, Object>();

    public Tuple() {
        types = tupleDeclaration();
    }

    abstract public List<TupleType> tupleDeclaration();

    public void set(String name, Object value) {
        for (TupleType type : types) {
            if (type.name.equals(name)) {
                try {
                    type.clazz.cast(value);
                    values.put(name, value);
                    return;
                } catch (ClassCastException e) {
                    throw new RuntimeException("Error field type!");
                }
            }
        }

        throw new RuntimeException("Unknown field!");
    }

    public ObjectHolder get(String name) {
        if (!values.containsKey(name)) {
            throw new RuntimeException("Unknown field!");
        }
        return new ObjectHolder(values.get(name));
    }

    public static class ObjectHolder {
        private final Object obj;

        public ObjectHolder(Object obj) {
            this.obj = obj;
        }

        public <T> T as(Class<T> clazz) {
            return (T) obj;
        }
    }

    public static <T> T only(Class<T> clazz, T arg) {
        return arg;
    }

    public List<String> getCompletionList() {
        List<String> suggestions = new ArrayList<String>();

        for (TupleType type : types) {
            // .set("Name", only(String.class, "%"));
            suggestions.add("set(\"" + type.name + "\", only(" + type.clazz.getSimpleName() + ".class, ))");
            // .get("Age").as(Integer.class);
            suggestions.add("ge/t(\"" + type.name + "\").as(" + type.clazz.getSimpleName() + ".class)");
        }

        return suggestions;
    }

    public static class TupleType {
        public final String name;
        public final Class clazz;

        public TupleType(String name, Class<?> clazz) {
            this.name = name;
            this.clazz = clazz;
        }

        public static <T> TupleType of(String name, Class<T> clazz) {
            return new TupleType(name, clazz);
        }
    }
}
