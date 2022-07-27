import java.util.*;
public class Thing {
    public String name;
    public Thing(String n) {
        name = n;
    }

    public static void print(List<Thing> list, int N) {
        list.stream()
                .distinct()
                .map((t) -> t.name)
                .distinct()
                .filter((t) -> t.length() > N)
                .sorted()
                .forEach((t) -> System.out.println(t));
    }

    public static void main(String[] args) {
        Thing t1 = new Thing("banana");
        Thing t2 = new Thing("monkey");
        Thing t3 = new Thing("dog");
        Thing t4 = new Thing("aardvark");
        Thing t5 = new Thing("monkey");
        List<Thing> things = List.of(t1, t2, t3, t4, t5);
        Thing.print(things, 4);
    }
}
