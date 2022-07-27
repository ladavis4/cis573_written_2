public class Bear extends Animal {

    enum BearType { BROWN, BLACK, POLAR, POOH };

    private String name;
    private BearType type;


    public Bear(String name, BearType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public BearType getType() {
        return type;
    }

}