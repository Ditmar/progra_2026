public class App {
    public static void main(String[] args) throws Exception {
        for (Integer i = 0; i < 1000; i ++ ) {
            long number = DamageGenerator.getDamage();
            if (number >= 10 && number <= 100) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("ERROR");
            }
        }
    }
}
