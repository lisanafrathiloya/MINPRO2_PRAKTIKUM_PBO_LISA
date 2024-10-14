/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author ASUS
 */
import model.Task;

public interface CRUDOperations {
    void addTask(Task task);
    void displayAllTasks();
    void updateTask(String title, String newTitle, String newDescription, boolean newStatus);
    void deleteTask(String title);
}
