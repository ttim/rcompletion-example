package tuple;

import static tuple.Tuple.only;

public class Usages {
    public static void main(String[] args) {
        Human human = new Human();

        human.set("Name", only(String.class, "Timur")); // suggest at human.set(
        human.set("Surname", only(String.class, "Abishev"));
        human.set("Age", only(Integer.class, 21));

        human.get("Age").as(Integer.class); // suggest at human.get(

        human.get("Surname").as(String.class);

//        human.get

        System.out.println(human.get("Surname").as(String.class));

//        System.out.println(human.getSuggestions());
    }
}
