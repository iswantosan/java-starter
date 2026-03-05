Case 1 -> violate Liskov Substitution karena function tarik override dari parentnya namun memberikan kondisi error.
Case 2 -> Dependency Inversion karena diperlukan perubahan komponen yang lebih dinamis (bisa menggunakan abstrak)
Case 3 -> melanggar SRP (Single Responsibility) karena banyak function dengan task yang berbeda dalam 1 class.
Case 4 -> OCP karena harus menambahkan fitur tanpa harus mengubah kode lama di bagian validasi hitungBiayaAdmin
Case 5 -> melanggar Interface Segregation (ISP) karena memaksa class menurunkan method yang tidak diperlukan antara lain perpanjang, klaimAsuransiSimpanan, requestBukuCek