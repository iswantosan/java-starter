case 1 -> (Kayanya) Melanggar Liskov Substitution, karena terdapat method yang sama namun berbeda perhitungannya. Artinya perhitungannya tidak akan sama dengan parent nya
case 2 -> Melanggar Dependency Inversion, karena bergantung pada 2 kelas lainnya. Harusnya 2 kelas lainnya bisa dipisahkan menggunakan implements
case 3 -> Melanggar Single Responsibility, karena terdapat 2 tugas berbeda yaitu pengiriman notification dan register nasabah. 
case 4 -> Melanggar Open/Closed karena tidak terbuka untuk penambahan tipe transaksi baru
case 5 -> Melanggar Interface Segregation, karena class tersebut dipaksa untuk mengimplementasikan semua method yang tersedia padahal tidak semua dibutuhkan  