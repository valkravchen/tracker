package ru.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BankServiceTest {

    @Test
    void addUser() {
        User user = new User("3434", "Ivan Ivanov");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434")).isEqualTo(user);
    }

    @Test
    void deleteUserIsTrue() {
        User first = new User("3434", "Ivan Ivanov");
        User second = new User("3434", "Ivan Ivanov");
        BankService bank = new BankService();
        bank.addUser(first);
        bank.addUser(second);
        bank.deleteUser("3434");
        assertThat(bank.findByPassport(first.getPassport())).isNull();
    }

    @Test
    void deleteUserIsFalse() {
        User first = new User("3434", "Ivan Ivanov");
        User second = new User("3434", "Ivan Ivanov");
        BankService bank = new BankService();
        bank.addUser(first);
        bank.addUser(second);
        bank.deleteUser("343434");
        assertThat(bank.findByPassport(first.getPassport())).isEqualTo(first);
    }
}