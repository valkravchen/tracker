package ru.poly;

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void add() {
        store.save("Ivan Ivanov");
    }

    public static void main(String[] args) {
        //MemStore store = new MemStore();
        FileStore store = new FileStore();
        Service service = new Service(store);
        service.add();
    }
}

