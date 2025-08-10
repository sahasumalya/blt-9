package packag1;

public class Singleton {

    private static Singleton instance;
    private String name;

    private Singleton(String name) {
        this.name = name;
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton(Config.NAME);
        }
        return instance;
    }



}
