import java.util.Scanner;
class TuanLangit3 {
  public static void main(String[] argumen) {
//membuka program dengan boolean
    boolean programBerjalan = true;
//memasukkan nilai pada variabel untuk perhitungan kedepannya
    int totalBarang1 = 0;
    int totalBarang2 = 0;
    int totalBarang3 = 0;
    int totalBarang4 = 0;
    int totalKeuntungan = 0;
    int kembalian = 0;
    int totalkotor =0;
    int modal = 0;
    int stock1 = 100;
    int stock2 = 100;
    int stock3 = 100;
    int stock4 = 100;
//membuat scanner input untuk memasukan data
    try (Scanner inputPengguna = new Scanner(System.in)) {
      //untuk pemanggilan variabel
        int nomorBarangDibeli;
        int kuantitasBarangDibeli;
        int bayar;
        String kataPembuka;
       //untuk tampilan menu berulang
        while(programBerjalan) {
          kataPembuka = "                        ========                        ";
          kataPembuka += "\n                      ============                      ";
          kataPembuka += "\n                    ================                    ";
          kataPembuka += "\n                  ====================                  ";
          kataPembuka += "\n                ========================                ";
          kataPembuka += "\n              ============================              ";
          kataPembuka += "\n            ================================            ";
          kataPembuka += "\n          ===========[TOKO IMPIAN]============          ";
          kataPembuka += "\n        ========================================        ";
          kataPembuka += "\n      ============================================      ";
          kataPembuka += "\n    ================================================    ";
          kataPembuka += "\n  ====================================================  ";
          kataPembuka += "\n========================================================";
          kataPembuka += "\nSelamat datang di Toko Impian, mau beli barang apa ?";
          kataPembuka += "\n1. Poster Hidup bahagia dunia akhirat ($ 35) - " + totalBarang1 + " barang terjual " + stock1 + " stok yang tersedia";
          kataPembuka += "\n2. Poster Kapal pesiar dan uang 63 trilyun rupiah ($ 25) - " + totalBarang2 + " barang terjual " + stock2 + " stok yang tersedia";
          kataPembuka += "\n3. Poster Kemampuan untuk bernapas di dalam air ($ 40) - " + totalBarang3 + " barang terjual " + stock3 + " stok yang tersedia";
          kataPembuka += "\n4. Poster Kebun berisi tomat dan apel untuk dijual ($ 15) - " + totalBarang4 + " barang terjual " + stock4 + " stok yang tersedia";
          kataPembuka += "\n0. Program ini kurang bermanfaat, saya memilih keluar";
          kataPembuka += "\n9. menu pembayaran";
          kataPembuka += "\n\nTotal keuntungan toko saat ini: $ " + totalKeuntungan + ",,, alhamdulillah";
          kataPembuka += "\n========================================================";
          kataPembuka += "\n\nPilih nomor barang (1 / 2 / 3 / 4):";

          System.out.println(kataPembuka);
          //input pilihan
          nomorBarangDibeli = inputPengguna.nextInt();

          if (nomorBarangDibeli == 1 || nomorBarangDibeli == 2 || nomorBarangDibeli == 3 || nomorBarangDibeli == 4) {

            System.out.println("Barang nomor " + nomorBarangDibeli + " dipilih\nMau berapa banyak ?");
            //input jumlah
            kuantitasBarangDibeli = inputPengguna.nextInt();

            System.out.println("Barang nomor " + nomorBarangDibeli + " dibeli sejumlah " + kuantitasBarangDibeli + " buah");
            //untuk menghitung keuntungan,stock
            switch(nomorBarangDibeli) {
              case 1:
                totalBarang1 += kuantitasBarangDibeli;
                stock1 -= kuantitasBarangDibeli;
                modal += kuantitasBarangDibeli * 30;
                totalkotor += kuantitasBarangDibeli * 35;
                totalKeuntungan = totalkotor - modal;
                break;
                case 2:
                totalBarang2 += kuantitasBarangDibeli;
                stock2 -= kuantitasBarangDibeli;
                modal += kuantitasBarangDibeli * 20;
                totalkotor += kuantitasBarangDibeli * 25;
                totalKeuntungan = totalkotor - modal;
                break;
                case 3:
                totalBarang3 += kuantitasBarangDibeli;
                stock3 -= kuantitasBarangDibeli;
                modal += kuantitasBarangDibeli * 35;
                totalkotor += kuantitasBarangDibeli * 40;
                totalKeuntungan = totalkotor - modal;
                break;
                case 4:
                totalBarang4 += kuantitasBarangDibeli;
                stock4 -= kuantitasBarangDibeli;
                modal += kuantitasBarangDibeli * 12;
                totalkotor += kuantitasBarangDibeli * 15;
                totalKeuntungan = totalkotor - modal;
                break;
            }
           //untuk menu keluar
          } else if (nomorBarangDibeli == 0) {
            System.out.println("Sayang sekali, kamu melewatkan barang rahasia");
            break;
            //untuk tampilan pembayaran dan kembalian
          } else if (nomorBarangDibeli ==  9) {
            System.out.println("----[PEMBAYARAN]----");
            System.out.println(" total belanja: $ " + totalkotor);
            System.out.print(" membayar: $ ");
            bayar = inputPengguna.nextInt();
            System.out.println("--------------------");
            kembalian = bayar - totalkotor;
            System.out.println("kembalian: $ " + kembalian ); 
            break;
          }//jika salah input nomor yg tertera maka otomatis keluar
          else{programBerjalan = false;} 
          System.out.println("yang anda input salah");
        }
      }
    }
}

