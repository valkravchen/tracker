package ru.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> departments) {
        Set<String> temp = new LinkedHashSet<>();
        for (String department : departments) {
            String[] parts = department.split("/");
            StringBuilder sb = new StringBuilder();
            for (String part : parts) {
                if (!sb.toString().isEmpty()) {
                    sb.append("/");
                }
                sb.append(part);
                temp.add(sb.toString());
            }
        }
        return new ArrayList<>(temp);
    }

    public static void sortAsc(List<String> departments) {
        departments.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> departments) {
        departments.sort(new DepartmentsDescComparator());
    }
}
