package ru.lambda;

import java.util.*;

public class FI {
    public static void main(String[] args) {
        Attachment[] attachments = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 10),
                new Attachment("image 2", 23)
        };

        Comparator<Attachment> comparatorSize = (left, right) -> {
            return Integer.compare(left.getSize(), right.getSize());
        };

        Comparator<Attachment> comparatorName = (left, right) -> {
            return left.getName().compareTo(right.getName());
        };

        Comparator<Attachment> comparatorDescSize = (left, right) -> {
            return Integer.compare(right.getSize(), left.getSize());
        };

        Comparator<Attachment> comparatorDescName = (left, right) -> {
            return right.getName().compareTo(left.getName());
        };
    }
}
