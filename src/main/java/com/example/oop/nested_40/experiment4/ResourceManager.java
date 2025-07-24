package com.example.oop.nested_40.experiment4;

public class ResourceManager {
    static class Resource {
        private String resourceId;
        private boolean isActive = true;

        public Resource(String resourceId) {
            this.resourceId = resourceId;
        }

        public void activate() {
            isActive = true;
            System.out.println("Активирован ресурс: " + resourceId);
        }

        public void deactivate() {
            isActive = false;
            System.out.println("Деактивирован ресурс: " + resourceId);
        }

        public void showStatus() {
            System.out.println("Ресурс " + resourceId + " статус: " +
                    (isActive ? "активен" : "неактивен"));
        }
    }

    public static void main(String[] args) {
        ResourceManager.Resource resource1 = new ResourceManager.Resource("база-данных");
        ResourceManager.Resource resource2 = new ResourceManager.Resource("файловая-система");
        ResourceManager.Resource resource3 = new ResourceManager.Resource("сетевое-подключение");
        ResourceManager.Resource resource4 = new ResourceManager.Resource("кэш-память");
        System.out.println("Начальное состояние всех ресурсов:");
        resource1.showStatus();
        resource2.showStatus();
        resource3.showStatus();
        resource4.showStatus();
        resource2.deactivate();
        resource4.deactivate();
        System.out.println("Состояние после частичной деактивации:");
        resource1.showStatus();
        resource2.showStatus();
        resource3.showStatus();
        resource4.showStatus();
        resource1.activate();
        resource2.activate();
        resource3.activate();
        resource4.activate();
        resource1.showStatus();
        resource2.showStatus();
        resource3.showStatus();
        resource4.showStatus();
        System.out.println("Финальное состояние всех ресурсов:");
        resource1.showStatus();
        resource2.showStatus();
        resource3.showStatus();
        resource4.showStatus();
    }
}
