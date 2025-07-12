package com.example.oop.nestedClasses;

public class Button {
    private final String label;

    public Button(String label) {
        this.label = validateLabel(label);
    }

    public String getLabel() {
        return label;
    }

    public interface ClickListener {
        public abstract void onClick();
   }

   private ClickListener listener;

   public void addClickListener(ClickListener listener) {
       this.listener = listener;
   }

   public void click() {
       if (listener != null ) {
           listener.onClick();
       }
   }

    private String validateLabel(String label) {
        if (label == null || label.trim().isEmpty()) {
            throw new IllegalArgumentException("Метка не может быть null или пустой");
        }
        return label.trim();
    }

    public static void main(String[] args) {
        Button button = new Button("Click Me");
        button.addClickListener(new Button.ClickListener() {
            public void onClick() {
                System.out.println("Button " + button.getLabel() + " clicked");
            }
        });
        button.click();
    }
}
