package ru.poly;

public class Service {
    private FileStore store;

    public Service(FileStore store) {
        this.store = store;
    }

    public void add() {
        store.save("Ivan Ivanov");
    }

    public static void main(String[] args) {
       MemStore store = new MemStore();
       Service service =new Service(store);
       service.add();
    }
}

