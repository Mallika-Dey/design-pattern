package singletone.lazy;

/**
 *
 * @author Mallika Dey
 */
public class LazySingletone {
    private static LazySingletone lazySingletone = null;

    private LazySingletone() {
    }

    public static LazySingletone getLazySingletone() {
        if (lazySingletone == null) {
            lazySingletone = new LazySingletone();
        }
        return lazySingletone;
    }
}
