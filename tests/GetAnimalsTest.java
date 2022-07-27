import org.junit.*;
import java.util.*;
import static org.junit.Assert.assertEquals;


public class GetAnimalsTest {

    @Test
    public void testGetCats() {
        List<Cat> animals = AnimalFinder.getAnimals(AnimalFinder.AnimalType.CAT);
        assertEquals("Felix", (animals.get(0)).getName());
        assertEquals("Garfield", (animals.get(1)).getName());
    }

    @Test
    public void testGetDogs() {
        List<Dog> animals = AnimalFinder.getAnimals(AnimalFinder.AnimalType.DOG);
        assertEquals("Snoopy", (animals.get(0)).getName());
        assertEquals("Blue", (animals.get(1)).getName());
    }

    @Test
    public void testGetBearNames() {
        List<Bear> animals = AnimalFinder.getAnimals(AnimalFinder.AnimalType.BEAR);
        assertEquals("Yogi", (animals.get(0)).getName());
        assertEquals("Pooh", (animals.get(1)).getName());
    }

    @Test
    public void testGetBearTypes() {
        List animals = AnimalFinder.getAnimals(AnimalFinder.AnimalType.BEAR);
        assertEquals(Bear.BearType.BROWN, ((Bear)(animals.get(0))).getType());
        assertEquals(Bear.BearType.POOH, ((Bear)(animals.get(1))).getType());
    }

}

