## 9.2.3 Pertanyaan
1. Mengapa hasil compile kode program di baris pertama menghasilkan 
“Linked List Kosong”?

Jawaban : Karena, pada kode program langsung memanggil method print tanpa ada 
penambahan data pada linked list sebelumnya.

2. Pada step 10, jelaskan kegunaan kode berikut
Kegunaannya adalah untuk menginsertkan data yang diinput kedalam temp yang 
selanjutnya.

Jawaban : 

3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan 
kode berikut

Jawaban :Kegunaannya adalah untuk mengecek apakan tmp.next.next bernilai null, jika iya 
maka temp.next akan dijadikan sebafai tail, jika tidak maka akan dilanjutka ke 
kondisi setelahnya.

9.3.3 Pertanyaan
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!

Jawaban :Untuk melakukan penghentian atau menghentikan sebuah kode program, jika 
sudah memenuhi atau mencapai kondisi tertentu.

2. Jelaskan kegunaan kode dibawah pada method remove

Jawaban :Kegunaannya adalah untuk mengganti data dari temp.next menjadi 
temp.next.next, jika temp.next.data sama dengan variable key.

3. Apa saja nilai kembalian yang dapat dikembalikan pada method indexOf? 
Jelaskan maksud masing-masing kembalian tersebut

Jawaban :Nilai kembalian atau return yang dikembalikan pada method indexOf adalah 
berupa -1 jika, tmp sama dengan null dan mengembalikan variable index jika, data 
yang dicari telah diketemukan