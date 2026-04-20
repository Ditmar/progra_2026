public class DamageGenerator {
    public static int getDamage() {
        double random = Math.random() * 100 + 1;
        long roundNumber = Math.min(Math.round(random), 100);
        long minNumber = Math.max(roundNumber, 10);
        return (int)minNumber;
    }   
}
