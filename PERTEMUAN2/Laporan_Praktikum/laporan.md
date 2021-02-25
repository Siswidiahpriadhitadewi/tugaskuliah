# Laporan praktikum 2
## Pertanyaan 2.2.3

Jawaban : 
1.	atribut dan method. Atribut merupakan status object dan method merupakan tingkah laku dari object tersebut.
2.	Deklarasi Class Kelas pada Java dideklarasikan dengan menggunakan kata kunci class.
3.	Ada 4 yaitu namaBarang, jenisBarang, stok, dan hargaSatuan. Deklarasi atribut pada baris ke 2 dan ke 3
4.	Ada 4 yaitu tampilBarang, tambahStok, kurangstok, dan hitungHargaTotal. Deklarasi atribut ke 4, ke 10, ke 13, ke 16, dan ke 19
5.	If (stok > 0 ){ stok – n; }
6.	Karena fungsi dari method tersebut adalah untuk menambah jumlah stok yang ada dengan data yang berasal dari luar method itu sendiri, sehingga membutuhkan parameter untuk mengambil nilai dari data yang di inputkan. Dan karena fungsinya adalah untuk menambah stok, maka tipe yang sesuai adalah integer 
7.	 Karena method tersebut digunakan untuk menghitung sebuah operasi matematika dan variabel jumlah yang dikali dengan variabel hargaSatuan, sehingga diperlukan tipe data kembalian berupa integer agar ketika dipanggil dimethod lain, method itu bisa menerima atau mendapatkan nilai dari perhitungan atau pengolahan data dari method hitungHargaTotal().
8.	Karena pada metod tambahStok() tidak memerlukan nilai kembalian yaitu hanya digunakan untuk menjalankan aksi tanpa menyimpan tipe data kembalian

## Pertanyaan 2.3.3
Jawaban :
1.	Pada baris ke 6, terdapat instansiasi objek pada class barang dengan nama objek b1. Dengan syntax barang b1 = new barang();
2.	Dengan cara  menginstansiasi barang b1 = new barang();

## Pertanyaan 2.4.3
Jawaban :  
1.	Barang (String nm, String jn, int st, int hs) {
namaBarang = nm;
jenisBarang = jn;
stok = st;
hargaSatuan = hs;
}
2.	Mengisi konstruktor yang tidak berparameter pada class main
3.	Barang b3 = new barang ();
B3.namaBarang = “ Wifi”;
B3.jenisBarang = “4G”;
B3.stok = 1;
B3.hargaSatuan = 300000;
B3.kurangStok(1);
B3.tambahStok(5);
B3.tampilBarang();
Int hargaTotal = b3.hitungHargaTotal(2);
Sytem.out.println(“Harga 2 buah =” + hargaTotal)

