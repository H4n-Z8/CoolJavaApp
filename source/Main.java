public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World! :3");
        System.out.println("Omg is that Hatune Miku?");

        Magazine M1 = new Magazine("Colt", 30);
        Magazine M2 = new Magazine("Kalashnikov", 60);

        Gun G1 = new Gun("M4A1", "Colt", M1);
        Gun G2 = new Gun("Ak12", "Kalashnikov", M2);

        G2.shoot();
        G2.switchFiremode();
        G2.shoot();
        G2.switchFiremode();
        G2.shoot();

    }
}