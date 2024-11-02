package tugasArray;
import java.util.ArrayList;
import java.util.Scanner;
public class buahArraylist {
    public static void main(String[] args) {
        String[][] buah = {
            {"apel", "35000"},
            {"jeruk", "50000"},
            {"mangga", "25000"},
            {"duku", "15000"},
            {"semangka", "20000"}
        };
        ArrayList<String> namaBuahList = new ArrayList<>();
        ArrayList<Integer> jumlahList = new ArrayList<>();
        ArrayList<Integer> hargaList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean lanjut = true;

        System.out.println("""
                Menu:
                1. Beli buah
                2. Struk belanja
                3. Keluar
                """);
        while (lanjut) {
            System.out.print("\nMasukan pilihan: ");
            int pilih = sc.nextInt();
            if(pilih == 1){
                System.out.print("Pilih buah (0-4): ");
                int indexBuah = sc.nextInt();
                System.out.print("Masukkan jumlah: ");
                int jumlah = sc.nextInt();
                if (indexBuah >= 0 && indexBuah < buah.length) {
                    String namaBuah = buah[indexBuah][0];
                    int harga = Integer.parseInt(buah[indexBuah][1]);
                    namaBuahList.add(namaBuah);
                    jumlahList.add(jumlah);
                    hargaList.add(harga);
                } else {
                    System.out.println("Pilihan tidak valid!");
                }
            }else if(pilih == 2){
                System.out.println("""
                        Struk Belanja:
                        =================================================================================
                        No \t\t Buah \t\t Jumlah \t\t Harga \t\t Subtotal
                        ---------------------------------------------------------------------------------
                        """);
                int x = 1;
                int total = 0;
                for (int i = 0; i < namaBuahList.size(); i++) {
                    String namaBuah = namaBuahList.get(i);
                    int jumlahItem = jumlahList.get(i);
                    int hargaItem = hargaList.get(i);
                    int subtotal = jumlahItem * hargaItem;
                    total += subtotal;
                    System.out.println((x++)+"\t\t"+namaBuah+"\t\t"+jumlahItem+"\t\t"+hargaItem+"\t\t"+subtotal);
                }System.out.println("==================================================================================");
                System.out.println("Total: " + total);
                int diskon = (int)(total * 0.15);
                System.out.println("Diskon (15%): " + diskon);
                System.out.println("Total bayar: " + (total - diskon));
            }
            else if (pilih == 3) {
                lanjut = false;
            } else { // Pilihan tidak valid
                System.out.println("Pilihan tidak valid!");
            }
        }
        sc.close();
    }
}