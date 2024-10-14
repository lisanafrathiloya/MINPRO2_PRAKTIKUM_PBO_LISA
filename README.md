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

  
