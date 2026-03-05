### Handson 1 ###
Case 1 -> 
melanggar LSP, karna function yg di pake di child class merusak perilaku logika pada function parent nya.

Case 2 ->
melanggar DIP, karna bergantung abstraksi pada class Case2

Case 3 -> 
melanggar SRP, karna dalam 1 class terdapat beberapa logic yang tidak berhubungan sehingga dapat meyebabkan class tersebut berubah untuk alasan yg banyak, seperti logika untuk buka Saving Account, Send Notif SMS pembukaan Account, Register Loyalty program.

Case 4 -> 
melanggar OCP, karna dalam class tersebut memiliki logika yg fixed jadi jika ada tambahan tipe hitung biaya admin akan terjadi perubahan logika yang existing.

Case 5 ->
melanggar ISP, karna pada class Case5TermDeposit melakukan extend ke class Case5, sedangkan class Case5TermDeposit tidak memerlukan beberapa function yang ada di class Case5
