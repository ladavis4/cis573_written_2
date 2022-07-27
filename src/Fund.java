import java.util.*;
public class Fund {

    private final List<Integer> donations;

    public String name;

    public Fund(String name) {
        this.name = name;
        donations = new LinkedList<>();
    }

    public Fund(Fund other) { // copy constructor
        name = other.name;
        donations = new LinkedList<>(other.donations);
    }

    public List<Integer> getDonations() {
        return donations;
    }

    public void clearDonations() {
        donations.clear();
    }

}
