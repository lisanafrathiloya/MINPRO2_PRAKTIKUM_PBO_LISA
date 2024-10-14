# MINPRO1
# TO-DO-LIST

## ToDoListApp adalah pemograman sederhana untuk mengelola daftar tugas (to-do list). Program ini memungkinkan pengguna untuk login, menambahkan tugas baru, melihat semua tugas, memperbarui tugas, dan menghapus tugas. Aplikasi ini dibangun dengan bahasa pemrograman Java.

## Fitur
1. **Login Pengguna:**
   - Pengguna dapat login dengan username dan password.
   - Validasi pengguna berdasarkan data yang ada di dalam program.

2. **Manajemen Tugas:**
   - **Tambah Tugas:** Pengguna dapat menambahkan tugas baru dengan judul, deskripsi, dan status selesai atau belum.
   - **Lihat Semua Tugas:** Pengguna dapat melihat semua tugas yang sudah ditambahkan.
   - **Update Tugas:** Pengguna dapat memperbarui judul, deskripsi, dan status tugas yang sudah ada.
   - **Hapus Tugas:** Pengguna dapat menghapus tugas berdasarkan judul.

## Struktur Kode
- **`ToDoListApp.java`:** 
  Berisi kelas utama yang mengatur alur login dan interaksi pengguna dengan sistem manajemen to-do list. Kelas ini memungkinkan pengguna untuk menambahkan tugas, melihat       tugas, memperbarui, dan menghapus tugas.
  
- **`Task.java`:** 
  - Kelas abstrak yang merepresentasikan objek tugas (task), dengan atribut title, description, dan isCompleted.
  - Menggunakan enkapsulasi melalui penggunaan getter dan setter untuk atribut.
  - Kelas ini juga memiliki metode abstrak displayTaskInfo() yang harus diimplementasikan oleh subclass yang mewarisinya.

- **`PersonalTask.java`:**
  - Subclass yang mewarisi dari Task.
  - Mengimplementasikan metode abstrak displayTaskInfo() untuk menampilkan informasi tugas pribadi.
  - Kelas ini menunjukkan pewarisan (inheritance) dari kelas Task
    
- **`WorkTask.java`:**
  - Subclass yang mewarisi dari Task.
  - Mengimplementasikan metode abstrak displayTaskInfo() untuk menampilkan informasi tugas kerja.
  - Sama dengan PersonalTask, kelas ini juga menerapkan pewarisan dari Task.
  
- **`User.java`:** 
  - Kelas yang merepresentasikan objek pengguna (user), menyimpan informasi login berupa username dan password.
  - Menggunakan final keyword pada kelas dan propertinya untuk mencegah modifikasi atau pewarisan lebih lanjut.

- **`TaskService.java`:**
  - Kelas yang bertanggung jawab untuk mengelola daftar tugas (task) dan pengguna (user), termasuk menambahkan, memperbarui, menampilkan, dan menghapus tugas.
  - Mengimplementasikan interface CRUDOperations untuk operasi CRUD (Create, Read, Update, Delete) tugas.
  - Kelas ini menunjukkan abstraksi dan penerapan interface CRUD.
    
- **`CRUDOperations.java`:**
  - Interface yang mendefinisikan metode abstrak untuk operasi CRUD (Create, Read, Update, Delete).
  - Interface ini mengatur kontrak yang harus diikuti oleh kelas TaskService dalam mengelola tugas.

  ## DOKUMENTASI
  ## 1. LOGIN AKUN
     ![Screenshot 2024-10-14 180113](https://github.com/user-attachments/assets/3b65fb7b-094a-481a-b29a-b3d248ae136f)
        yang pertama kita bisa login menggunakan akun user yang sudah tersedia di dalam pemograman yang sudah tervalidasi akun untuk login nya
  

   ## 2. TAMPILAN MENU UTAMA 
   ![image](https://github.com/user-attachments/assets/179475e7-e554-474d-bf36-551b8a95c268)
      yang kedua jika berhasil login maka kita akan di bawa ke menu utama dari sebuah aplikasi To-Do-List, dan di sana ada 5 fitur yaitu menambahkan tugas, Lihat semua             tugas, update tugas, hapus tugas, dan keluar dari program.

  ## 3. TAMPILAN MENU UTAMA PILIHAN PERTAMA
     ![image](https://github.com/user-attachments/assets/e13ee010-7b54-4bdb-ad48-12ffca52da3d)
        yang ketiga, jika kita memilih pilihan pertama maka akan menampilkan pilihan untuk input list ke tugas pribadi atau tugas kerja.
     ![image](https://github.com/user-attachments/assets/9df46e6d-8875-4e4b-a74f-d9e19fc2db51)
        jika memilih pilihan pertama maka bisa menginput untuk mengisi list tugas pribadi.
     ![image](https://github.com/user-attachments/assets/b2466355-7c62-4698-b89d-c90f24698717)
        jika memilih pilihan kedua maka bisa menginput untuk list tugas kerja.

  ## 4. TAMPILAN MENU UTAMA PILIHAN KEDUA
     ![image](https://github.com/user-attachments/assets/33fbbc78-0bfb-4ff7-a5b9-ecf0319590c2)
     Yang keempat, jika memilih pilihan ke tiga maka kita akan di perlihatkan hasil dari tugas yang telah kita kerjakan anatar sudah selesai atau belum selesai

  ## 5. TAMPILAN MENU UTAMA PILIHAN KE TIGA







