package ru.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        if (citizens.containsKey(citizen.getPassport())) {
            return false;
        }
        citizens.put(citizen.getPassport(), citizen);
        return true;
    }

    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
