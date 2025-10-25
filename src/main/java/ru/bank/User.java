package ru.bank;

import java.util.Objects;

/**
 * Класс описывает пользователя банковской системы.
 * Каждый пользователь имеет уникальный номер паспорта и имя.
 * Используется для идентификации клиента в системе {@link BankService}.
 *
 * @author Ivan Ivanov
 * @version 1.0
 * @since 2025
 */
public class User {

    /**
     * Номер паспорта пользователя. Является уникальным идентификатором клиента.
     */
    private String passport;

    /**
     * Имя пользователя.
     */
    private String username;

    /**
     * Конструктор создаёт объект пользователя с заданными паспортом и именем.
     *
     * @param passport номер паспорта пользователя
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Возвращает номер паспорта пользователя.
     *
     * @return строка с номером паспорта
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Устанавливает новый номер паспорта пользователя.
     *
     * @param passport новый номер паспорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Возвращает имя пользователя.
     *
     * @return строка с именем пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Устанавливает новое имя пользователя.
     *
     * @param username новое имя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Сравнивает текущего пользователя с другим по номеру паспорта.
     *
     * @param o объект, с которым производится сравнение
     * @return {@code true}, если паспорта совпадают, иначе {@code false}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Возвращает хэш-код пользователя, основанный на номере паспорта.
     *
     * @return хэш-код пользователя
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
