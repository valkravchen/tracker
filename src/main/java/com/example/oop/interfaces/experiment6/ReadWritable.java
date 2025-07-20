package com.example.oop.interfaces.experiment6;

public interface ReadWritable extends Readable, Writable {
    default void copy() {
        write(read());
    }
}
