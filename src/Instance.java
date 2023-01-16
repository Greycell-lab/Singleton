public class Instance {
    public static Instance instance = null;
    public String s;
    private Instance(){
        s = "Erste instanz";
    }
    public static Instance getInstance(){
        if(instance == null) instance = new Instance();
        return instance;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
