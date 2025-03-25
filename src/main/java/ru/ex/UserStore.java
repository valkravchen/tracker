package ru.ex;

import java.util.Objects;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (Objects.equals(login, user.getUsername())) {
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден.");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Пользователь не валиден.");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Ли", true)
        };
        try {
            User user = findUser(users, "Ли");
            if (validate(user)) {
                System.out.println("Пользователь валиден.");
            }
        } catch (UserNotFoundException | UserInvalidException e) {
            System.err.println(e.getMessage());
        }
    }
}
