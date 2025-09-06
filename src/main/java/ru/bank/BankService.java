package ru.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void deleteUser(String passport) {
        User user = findByPassport(passport);
        if (user != null) {
            users.remove(user);
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite() {
        return null;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite, double amount) {

        return false;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }

    public static void main(String[] args) {
        BankService service = new BankService();
        User ivan = new User("1234", "Иван");
        User maria = new User("5678", "Мария");
        service.users.put(ivan, new ArrayList<>());
        service.users.put(maria, new ArrayList<>());
        User found1 = service.findByPassport("1234");
        User found2 = service.findByPassport("5678");
        User found3 = service.findByPassport("9999");
        System.out.println(found1 != null ? found1.getUsername() : null);
        System.out.println(found1 != null ? found2.getUsername() : null);
        System.out.println(found3);
    }
}
