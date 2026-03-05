# Hands On answers:

## Case 1: 
melanggar principle L, karena child class mengubah behavior parentnya

## Case 2:
melanggar principle D, karena saat approve kredit seharusnya bisa write ke PDF atau ke yang lain. Dengan adanya tightly coupling ke pdf writer, class Case2 terkunci harus menggunakan pdf writer, tidak bisa ke export yang lain. Seharusnya ada abstract class yang digunakan instead.

## Case 3:
melanggar principle S, karena class saving account seharusnya tidak ada reponsibility untuk mengirim SMS atau register loyalty. Itu seharusnya ada di class terpisah.

## Case 4:
melanggar principle O, karena ketika perlu menambah child class baru, harus menambah if else condition yang ada.

## Case 5:
melanggar principle I, karena class Case5TermDeposit tidak mengimplementasikan semua method yang seharusnya di implement saat menggunakan interface Case5.