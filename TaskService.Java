/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.User;
import model.Task;
import java.util.ArrayList;

public class TaskService implements CRUDOperations {
    private final ArrayList<Task> taskList = new ArrayList<>();
    private final ArrayList<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    public boolean validateUser(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addTask(Task task) {
        taskList.add(task);
        System.out.println("Tugas berhasil ditambahkan!");
    }

    @Override
    public void displayAllTasks() {
        if (taskList.isEmpty()) {
            System.out.println("Tidak ada tugas.");
        } else {
            for (Task task : taskList) {
                task.displayTaskInfo();
                System.out.println("---------------------");
            }
        }
    }

    @Override
    public void updateTask(String title, String newTitle, String newDescription, boolean newStatus) {
        for (Task task : taskList) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                task.setTitle(newTitle);
                task.setDescription(newDescription);
                task.setCompleted(newStatus);
                System.out.println("Tugas berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Tugas tidak ditemukan.");
    }

    @Override
    public void deleteTask(String title) {
        taskList.removeIf(task -> task.getTitle().equalsIgnoreCase(title));
        System.out.println("Tugas berhasil dihapus!");
    }
}
