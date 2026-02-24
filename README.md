Modul 1
Refleksi 1:
Dalam aspek clean code saya rasa saya sudah cukup memenuhinya. Penamaan variabel dan fungsi yang saya tetapkan tidak membingungkan dan jelas. Setiap fungsi yang saya buat, melakukan 1 tugas spesifik seperti halnya fungsi findProduct yang mencari produk berdasarkan idnya
Saya juga Memisahkan logika data di Repository, logika bisnis di Service, dan logika tampilan di Controller sesuai arsitektur Spring Boot.
Selain itu, saya juga menggunakan UUID sebagai ganti ID numerik berurutan mencegah pengguna menebak ID produk lain. Validasi juga dilakukan untuk mencegah pengguna memasukan hal yang tidak sesuai misalnya quantity 0 atau negatif.

Refleksi 2:
Setelah melakukan unit test saya kode saya dapat berjalan sebagaimana mestinya.
Menurut saya jumlah dari unit testnya tidak pasti, yang penting dapat mengcover semua logika yang ada dalam kelasnya. Dengan melihat coverage, saya rasa itu cukup untuk memverifikasi kode saya.
Jika terlihat coveragenya mencapai 100 saya rasa itu belum cukup untuk memastikan kode kita tidak mempunyai bug karena bug bisa saja muncul dari mana saja bahkan tidak kita sangka.

Menurut saya semakin banyak class yang mempunyai struktur kodenya identik maka akan muncul inkonsistensi antara kode-kode yang diuji.
Salah satu mprovement yang dapat dilakukan adalah dengan membuat class induk functional test yang berisi variabel umum seperti base url, meskipun saya belum menerapkannya karena saya perlu mempelajarinya. Dengan usulan tadi, jika terjadi perubahan pada variabel umum kita tinggal mengubahnya di satu file.

Modul 2 Refleksi
List code quality issue:
1. Unused import
2. Penggunaan field injection seperti @Autowired
3. Tidak adanya penggunaan assertion pada salah satu unit test
4. Empty method

Strategi saya dalam memperbaiki issue yang disebutkan diatas adalah dengan mengikuti instruksi pada sonarqloud terlebih dahulu.
Kemudian jika issue yang di sudah saya coba fix tersebut masih muncul saya akan mencoba mencari tahu di internet. Sejauh ini dalam pengerjaan modul 2 saya hanya mendapatkan issue yang simpel.
Saya juga coba menyelesaikan semua issue yang ada.

Pada CI/CD workflows yang saya buat sudah cukup memenuhi definisi CI/CD itu sendiri. Hal tersebut karena dalam file sudah dikonfigurasi agar otomatis menjalan unit test dan analisis kualitas kode setiap kali push dilakukan.
Jadi setiap ada kode yang baru, akan otomatis dianalisis untuk mendeteksi bug.
Sedangkan dari segi CD, hal ini terpenuhi karena terdapat fitur auto deploy pada koyeb yang membuatnya otomatis memeriksa perubahan yang terjadi di github dan melakukan deployment