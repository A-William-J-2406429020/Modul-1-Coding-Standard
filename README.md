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