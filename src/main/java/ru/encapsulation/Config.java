package ru.encapsulation;

public class Config {
    private String name;
    private int position;
    private int[] properties;

    public Config(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(position);
    }

   private String search(String key) {
        return key;
   }

   public String getProperty(String key) {
        return search(key);
   }
}
