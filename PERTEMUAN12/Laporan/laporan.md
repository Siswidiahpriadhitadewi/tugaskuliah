## 12.2.3 Pertanyaan Percobaan
1. Jelaskan perbedaan antara single linked list dengan double linked lists!

jawaban :
• Single Linked List merupakan linked list yang hanya memiliki satu variabel 
pointer saja, dimana pointer tersebut menunjuk ke node selanjutnya. Field 
pada tail menunjukk ke NULL.
• Double Linked List merupakan linked list yang memiliki dua variabel 
pointer yaitu, pointer yang menunjuk node selanjutnya dan node sebelumnya. 
Setiap head dan tailnya menunjuk ke NULL.

2. Perhatikan class Node, didalamnya terdapat atribut next dan prev. Untuk 
apakah atribut tersebut?

Jawaban :• Atribut next digunakan untuk menunjuk ke node selanjutnya.
• Atribut prev digunakan untuk menunjuk ke node sebelumnya.

3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan 
inisialisasi atribut head dan size seperti pada gambar berikut ini?

Jawaban :Untuk menginisialisasi bahwa node terdepan pada linked list adalah null dan 
menginisialisasi size dari linked list adalah 0.

4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor 
class Node prev dianggap sama dengan null?

Jawaban :Karena, data dimasukkan akan dijadikan sebagai head, sehingga untuk Node 
prevnya diisi dengan NULL. 

5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = 
newNode ?

Jawaban :Maksudnya data baru yang ada pada newNode akan diletakkan pada node 
sebelum head dan, data pada newNode akan menjadi head.

6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node 
dengan mengisikan parameter prev dengan current, dan next dengan null?

Jawaban :Maksudnya karena, pengisian datanya diletakkan diakhir prev dari data yang 
akan ditambahkan akan menunjuk ke current atau data sebelumnya dan, untuk 
nextnya karena merupakan data terakhir akan bernilai NULL.

## 12.3.3 Pertanyaan Percobaan
1. Apakah maksud statement berikut pada method removeFirst()?

jawaban :Maksudnya yang akan menjadi head setelah head yang awal diremove adalah 
data yang berada setelah head yang awal dan, untuk prev head yang baru adalah 
sama dengan NULL.

2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method 
removeLast()?

Jawaban :Dengan menggunakan sintaks “ while (current.next.next != null) 
{“ jika current.next.next sama dengan NULL maka itu adaalah data yang 
terakhir.

3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk 
perintah remove!

Jawaban :Tidak cocok, karena petunjuk pointernya tidak jelas atau ambigu.

4. Jelaskan fungsi kode program berikut ini pada fungsi remove!

Jawaban :Fungsinya untuk mengganti current.prev.next menjasdi current.next dan, 
mengganti current.next.prev menjadi current.prev.

## 12.4.3 Pertanyaan Percobaan
1. Jelaskan method size() pada class DoubleLinkedLists!

jawaban :Method sixe dugunakan untuk menunjukkan jumlah data yang ada pada linked list

2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat 
dimulai dari indeks ke1!

jawaban : Dengan mengubah head menjadi head.next sehingga, nanti head akan berada 
pada index ke-1 dan index ke-0 akan dikosongkan.

3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists 
dan Single Linked Lists!

jawaban :Perbedaan method Add pada single linked list dan double linked list adalah pada 
single linked list hanya perlu mengubah pointer nextnya saja sedangkan, pada 
double single linked list perlu mnegubah pointer next dan pointer prevnya.

4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!

jawaban : Pada method isEmpty yang a untuk mengecek kosong tidaknya linked list dilihat 
dari variabel sizenya jika size == 0 maka linked linst kosong. Sedangkan, pada 
method isEmpty yang b dilihat dari headnya jika head == null maka linked list 
kosong.