case 1: pada case 1 terlihat bahwa fungsi tarik yang dipanggil, di override tapi menambahkan logic untuk mengecek tanggal jatuh tempo, sedangkan berbeda dengan fungsi awal tariknya yang hanya mengecek saldo. ini melanggar LSP

case 2: pada case 2 terlihat pada send dependency nya bergantung pada abstraksi bukan implementasi konkret, sehingga ini melanggar DIP

case 3: jika melihat dari isinya code pada case 3, terlihat pada classnya terdapat open saving account, send welcome sms dan register loyalty program, ini seharusnya terpisah tidak disamakan jadi 1 class. maka ini melanggar SRP

case 4: pada case 4 terlihat bahwa classnya ini menyebabkan apabila ada penambahan baru akan selalu harus merubah ke dalam class ini, sehingga hal ini melanggar OCP

case 5: pada case 5 terlihat bahwa classnya terdapat banyak abstraction, yang seharusnya dipisah pisah, sesuai dengan kebutuhan nya saja. maka disini melanggar ISP