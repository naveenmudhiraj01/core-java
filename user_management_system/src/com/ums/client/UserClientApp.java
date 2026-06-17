package com.ums.client;

import java.util.List;
import java.util.Scanner;

import com.ums.model.user.User;
import com.ums.service.UserService;
import com.ums.service.impl.UserServiceImpl;

public class UserClientApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserService service = new UserServiceImpl();

        while (true) {
            System.out.println("\n===== USER MANAGEMENT SYSTEM =====");
            System.out.println("1. Register");
            System.out.println("2. View All Users");
            System.out.println("3. Login");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.addRegister();
                    break;

                case 2:
                    List<User> users = service.viewAllUsers();
                    if (users.isEmpty()) {
                        System.out.println("No users found!");
                    } else {
                        for (User u : users) {
                            System.out.println("----------------------------");
                            System.out.println("ID: " + u.getId());
                            System.out.println("Name: " + u.getName());
                            System.out.println("Email: " + u.getEmail());
                            System.out.println("Username: " + u.getUserName());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Username: ");
                    String uname = sc.next();
                    System.out.print("Enter Password: ");
                    String pass = sc.next();

                    boolean isValid = service.verifyUserNameAndPassword(uname, pass);

                    if (isValid) {
                        System.out.println("Login Successful ✅");
                    } else {
                        System.out.println("Invalid Credentials ❌");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Application...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}