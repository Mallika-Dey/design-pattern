package singletone;

import singletone.eager.EagerSingletone;
import singletone.threadsafe.ThreadSafeSingletone;

/**
 * @author Mallika Dey
 */
public class Main {
    public static void main(String[] args) {
        EagerSingletone eagerSingletone = EagerSingletone.getEagerSingletone();
        EagerSingletone eagerSingletone1 = EagerSingletone.getEagerSingletone();
        System.out.println(eagerSingletone.equals(eagerSingletone1));

        ThreadSafeSingletone instance = ThreadSafeSingletone.getThreadSafeSingletone();
        ThreadSafeSingletone instance1 = ThreadSafeSingletone.getThreadSafeSingletone();
        System.out.println(instance.equals(instance1));
    }
}
