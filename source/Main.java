public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World! :3");
        System.out.println("Omg is that Hatune Miku?");

        Gun G1 = new Gun("M4A1", "Colt", 30);
        Gun G2 = new Gun("Ak12", "Kalashnikov", 60);

        G2.shoot();
        G2.switchFiremode();
        G2.shoot();
        G2.switchFiremode();
        G2.shoot();

    }
}