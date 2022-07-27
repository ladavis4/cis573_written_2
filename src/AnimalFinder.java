import java.util.*;

public class AnimalFinder{

    public enum AnimalType {CAT, DOG, BEAR};

    public static List getAnimals(AnimalType t) {

        List list  = new ArrayList();

        switch(t){
            case CAT:
                list.add(new Cat("Felix"));
                list.add(new Cat("Garfield"));
                break;
            case DOG:
                list.add(new Dog("Snoopy"));
                list.add(new Dog("Blue"));
                break;
            case BEAR:
                list.add(new Bear("Yogi", Bear.BearType.BROWN));
                list.add(new Bear("Pooh", Bear.BearType.POOH));
                break;
        }
        return list;

    }
}
