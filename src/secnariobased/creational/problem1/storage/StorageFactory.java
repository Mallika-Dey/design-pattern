package secnariobased.creational.problem1.storage;

public class StorageFactory {
    public Storage createStorage(String storageName) {
        if (storageName.equalsIgnoreCase("sd card")) {
            return new SDCardStorage();
        } else if (storageName.equalsIgnoreCase("buildin storage")) {
            return new BuildInStorage();
        }
        return null;
    }
}
