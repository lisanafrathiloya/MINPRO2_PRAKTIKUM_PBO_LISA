/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



package com.mycompany.todolistapp;
import model.User;
import model.WorkTask;
import model.PersonalTask;
import service.TaskService;
import java.util.Scanner;

public class ToDoListApp {

    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        Scanner scanner = new Scanner(System.in);

        // Akun user
        taskService.addUser(new User("lisa", "lalilu"));
        
        System.out.println("== Login Aplikasi To-Do-List ==");
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
            
            if (taskService.validateUser(username, password)) {
                System.out.println("Login berhasil");
                System.out.println("Selamat datang di aplikasi To-Do-List");
                loggedIn = true;
            } else {
                System.out.println("Username atau password salah, silahkan coba lagi");
            }
        }
        
        // Menu utama program manajemen To-Do-List
        while (true) {
            System.out.println("=== Manajemen To-Do List ===");
            System.out.println("|   1. Tambah Tugas        |");    
            System.out.println("|   2. Lihat Semua Tugas   |");
            System.out.println("|   3. Update Tugas        |");
            System.out.println("|   4. Hapus Tugas         |");
            System.out.println("|   5. Keluar              |");
            System.out.println("============================");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    // Menambahkan tugas
                    System.out.println("Pilih jenis tugas:");
                    System.out.println("1. Tugas Pribadi");
                    System.out.println("2. Tugas Kerja");
                    System.out.println("Pilih Opsi: "); 
                    int taskType = scanner.nextInt();
                    scanner.nextLine();  

                    
                    System.out.print("Masukkan Judul Tugas: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan Deskripsi Tugas: ");
                    String description = scanner.nextLine();
                    System.out.print("Apakah tugas selesai? (true/false): ");
                    boolean isCompleted = scanner.nextBoolean();

                    if (taskType == 1) {
                        taskService.addTask(new WorkTask(title, description, isCompleted));
                    } else {
                        taskService.addTask(new PersonalTask(title, description, isCompleted));
                    }
                    break;

                case 2:
                    // Menampilkan semua tugas
                    taskService.displayAllTasks();
                    break;

                case 3:
                    // Memperbarui tugas
                    System.out.print("Masukkan judul tugas yang ingin diperbarui: ");
                    String oldTitle = scanner.nextLine();
                    System.out.print("Masukkan judul baru: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Masukkan deskripsi baru: ");
                    String newDescription = scanner.nextLine();
                    System.out.print("Apakah tugas selesai? (true/false): ");
                    boolean newStatus = scanner.nextBoolean();
                    taskService.updateTask(oldTitle, newTitle, newDescription, newStatus);
                    break;

                case 4:
                    // Menghapus tugas
                    System.out.print("Masukkan judul tugas yang ingin dihapus: ");
                    String deleteTitle = scanner.nextLine();
                    taskService.deleteTask(deleteTitle);
                    break;

                case 5:
                    // Keluar dari aplikasi
                    System.out.println("Keluar...");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
}
