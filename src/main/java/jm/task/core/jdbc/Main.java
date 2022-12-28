package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();
        userService.saveUser("Юрий", "Сидоров", (byte) 43);
        userService.saveUser("Александр", "Кузнецов", (byte) 37);
        userService.saveUser("Сергей", "Иванов", (byte) 28);
        userService.saveUser("Виталий", "Солодов", (byte) 32);
        userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
