package ru.bank;

import java.util.*;

/**
 * Класс описывает сервис для управления пользователями и их банковскими счетами.
 * Позволяет добавлять и удалять пользователей, создавать счета,
 * искать пользователей и счета по различным параметрам,
 * а также выполнять переводы между счетами.
 *
 * @author Ivan Ivanov
 * @version 1.0
 * @since 2025
 */
public class BankService {

    /**
     * Хранилище всех пользователей и их счетов.
     * В качестве ключа используется объект {@link User},
     * а в качестве значения — список его счетов {@link Account}.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет нового пользователя в систему.
     * Если пользователь уже существует, то повторное добавление не выполняется.
     *
     * @param user пользователь, который добавляется в банк
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Удаляет пользователя из системы по номеру паспорта.
     * Если пользователь с таким паспортом не найден, операция игнорируется.
     *
     * @param passport номер паспорта пользователя
     */
    public void deleteUser(String passport) {
        User user = findByPassport(passport);
        if (user != null) {
            users.remove(user);
        }
    }

    /**
     * Добавляет новый банковский счёт пользователю по номеру паспорта.
     * Если пользователь найден и такого счёта у него ещё нет — добавляет.
     *
     * @param passport номер паспорта пользователя
     * @param account  банковский счёт, который нужно добавить
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Ищет пользователя по номеру паспорта.
     *
     * @param passport номер паспорта
     * @return найденный пользователь или {@code null}, если пользователь не найден
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Ищет счёт пользователя по номеру паспорта и реквизиту.
     *
     * @param passport  номер паспорта пользователя
     * @param requisite реквизиты счёта
     * @return объект {@link Account}, если найден, иначе {@code null}
     */
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

    /**
     * Переводит деньги с одного счёта на другой.
     *
     * @param sourcePassport       паспорт отправителя
     * @param sourceRequisite      реквизит счёта отправителя
     * @param destinationPassport  паспорт получателя
     * @param destinationRequisite реквизит счёта получателя
     * @param amount               сумма перевода
     * @return {@code true}, если перевод выполнен успешно; {@code false} — если не удалось
     */
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

    /**
     * Возвращает список всех счетов пользователя.
     *
     * @param user пользователь, для которого нужно получить список счетов
     * @return список объектов {@link Account}, принадлежащих пользователю
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
