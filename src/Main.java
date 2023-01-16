public class Main {
    public static void main(String[] args) {
        Instance instance = Instance.getInstance();
        Instance instance2 = Instance.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}