public class Resource {

    private static Resource instance;

    private Resource() {
        System.out.println("initializing resource");
    }

    public static Resource getResource() {
        if (instance == null) {
            instance = new Resource();
        }
        return instance;
    }

}