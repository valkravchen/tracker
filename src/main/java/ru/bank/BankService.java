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
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
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

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite, double amount) {
        Account accountSource = findByRequisite(sourcePassport, sourceRequisite);
        Account accountDestination = findByRequisite(destinationPassport, destinationRequisite);
        if (accountSource != null && accountDestination != null && amount > 0) {
            if (accountSource.getBalance() >= amount) {
                accountSource.setBalance(accountSource.getBalance() - amount);
                accountDestination.setBalance(accountDestination.getBalance() + amount);
                return true;
            }
        }
        return false;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
