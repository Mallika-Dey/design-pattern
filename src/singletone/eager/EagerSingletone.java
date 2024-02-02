package singletone.eager;

/**
 * Instantiation happen during class loading and outside method
 * drawback- if the class is not being used by client application
 *
 * @author Mallika Dey
 */
public class EagerSingletone {
    private static EagerSingletone eagerSingletone = new EagerSingletone();

    private EagerSingletone() {
    }

    public static EagerSingletone getEagerSingletone() {
        return eagerSingletone;
    }
}
