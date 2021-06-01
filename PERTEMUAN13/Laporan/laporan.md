## 13.2.2 Pertanyaan Percobaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih
efektif dilakukan dibanding binary tree biasa?

jawab : Karena pada binary search tree semua datanya sudah diurutkan terlebih dahulu
sehingga memudahkan pada saat proses pencarian data.

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?

jawab : Sebagai petunjuk left-child dan right-child.

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?

jawab : Sebagai tempat menyimpan data root pada tree.
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?

jawab : Nilai dari root adalah null.

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru,
proses apa yang akan terjadi?

jawab : Program akan menjalankan method add() untuk menambahkan sebuah node
baru.

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di
bawah ini. Jelaskan secara detil untuk apa baris program tersebut?

jawab : if(data<current.data){
if(current.left!=null){
current = current.left;
}else{
current.left = new Node(data);
break;
}
}
Jika data yang ditambahkan kurang dari data sekarang maka dilakukan
pemilihan. Jika node sebelah kiri data sekarang tidak null maka, data yang
diinputkan diletakkan di node tersebut dan menggeser data sebelumnya. Jika
tidak maka, data yang diinputkan menempati node tersebut.


## 13.3.2 Pertanyaan Percobaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class
BinaryTreeArray?

jawab : Atribut data digunakan untuk menyimpan data yang ada pada array, dan atribut
idxLast digunakan untuk menyimpan data yang terakhir pada array tersebut.

2. Apakah kegunaan dari method populateData()?

jawab : Sebagai konstruktor yang berparameter.
3. Apakah kegunaan dari method traverseInOrder()?

jawab : Untuk menampilkan isi dari tree dengan menggunakan metode InOrder.
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di
indeks berapakah posisi left child dan rigth child masin-masing?

jawab : Posisi left child = 2(2*i+1) >> (2*2+1) = 5
Posisi right child = (2*i+2) >> (2*2+2) = 6

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?

jawab : Menentukan panjang indeks array yang akan ditampilkan.
