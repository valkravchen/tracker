package ru.bank;

import java.util.Objects;

/**
 * Класс описывает банковский счёт клиента.
 * Содержит реквизиты счёта и текущий баланс.
 * Используется в банковской системе для выполнения переводов между клиентами.
 *
 * @author Ivan Ivanov
 * @version 1.0
 * @since 2025
 */
public class Account {
    /**
     * Уникальный идентификатор счёта (реквизит клиента).
     */
    private String requisite;
    /**
     * Текущий баланс счёта.
     */
    private double balance;

    /**
     ** Конструктор создаёт объект счёта с заданными реквизитами и балансом.
     * @param requisite реквизиты счёта.
     * @param balance начальный баланс.
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Возвращает реквизиты счёта.
     *
     * @return строка с реквизитами.
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Устанавливает новые реквизиты счёта.
     *
     * @param requisite новые реквизиты.
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Возвращает текущий баланс счёта.
     *
     * @return значение баланса.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Устанавливает новое значение баланса.
     *
     * @param balance новое значение баланса.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Сравнивает два объекта Account по реквизитам.
     *
     * @param o объект, с которым производится сравнение.
     * @return true, если реквизиты совпадают, иначе false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Возвращает хэш-код объекта на основе реквизитов счёта.
     *
     * @return хэш-код счёта.
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
