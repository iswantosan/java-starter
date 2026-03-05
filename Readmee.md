Case 1: Liskov, dengan mengextends dari Class Case1, seharusnya tidak merusak prilaku parentsnya dengan menambahkan validasi

Case 2: Depedency, karena class case2creditbureau bergantung jg pada case2pdfwriter 

Case 3: SRP, karena 1 class send sms, register loyalty savings account harus di bedakan classnya. jangan jadi 1

Case 4: OCP, karena function perhitungan dapat di buat class sendiri agar memudahkan saat ada pengembangan kedepannya tidak menganggu class existing

Case 5: ISP, karna ada implenment class yang tidak di butuhkan, seperti perpanjang, klaimAsuransi, requestBukuCek


