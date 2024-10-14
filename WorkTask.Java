/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class WorkTask extends Task {

    public WorkTask(String title, String description, boolean isCompleted) {
        super(title, description, isCompleted);
    }

    @Override
    public void displayTaskInfo() {
        System.out.println("Tugas Pribadi");
        System.out.println("Judul: " + getTitle());
        System.out.println("Deskripsi: " + getDescription());
        System.out.println("Status: " + (isCompleted() ? "Selesai" : "Belum Selesai"));
    }
}
