package tugasArray;
import java.util.Scanner;
public class belanjaBuah {
    public static void main(String[] args) {
        String[][] buah = {
            {"apel", "35000"},
            {"jeruk", "50000"},
            {"mangga", "25000"},
            {"duku", "15000"},
            {"semangka", "20000"}
        };

        int beliBuah[] = new int[100];
        int jumlah[] = new int[100];
        int subtotal[]= new int[100];
        String namaBuah[] = new String[100];
        Scanner sc = new Scanner(System.in);
        boolean lanjut = true;
        int i = 0;

        System.out.print("""
                Menu:
                1. Beli Buah
                2. Struk Belanja
                3. Keluar
                """);
            while (lanjut) {
                System.out.print("\nMasukkan pilihan: ");
                int pilih = sc.nextInt();
                if(pilih == 1){
                    System.out.print("Pilih buah (0-4): ");
                        beliBuah[i] = sc.nextInt();
                        namaBuah[i] =  buah[beliBuah[i]][0];

                        System.out.print("Masukkan jumlah: ");
                        jumlah[i] = sc.nextInt();
                        i++;
                }else if(pilih == 2){
                    System.out.println("\nDaftar Belanja: ");
                    System.out.println("==================================================================================");
                    System.out.println("No \t\t Buah  \t\t Jumlah \t\t Harga \t\t Subtotal");
                    System.out.println("---------------------------------------------------------------------------------");
                    int x=1;
                    for (int k = 0; k < namaBuah.length; k++) {
                        if (jumlah[k] != Integer.valueOf(0)) {
                            subtotal[k] = Integer.valueOf(buah[beliBuah[k]][1]) * jumlah[k];
                            System.out.println((x++) + " \t\t " + buah[beliBuah[k]][0] + " \t\t " + jumlah[k] + " \t\t " + Integer.valueOf(buah[beliBuah[k]][1])+" \t\t "+subtotal[k]);
                        }
                    }System.out.println("==================================================================================");
                    int total=0;
                    for (int num : subtotal) {
                        total += num;
                    }
                    System.out.println("Total: "+total);
                    double diskon = total * 0.15;
                    System.out.println("Diskon(15%):  "+(int)diskon);
                    int bayar = total - (int)diskon;
                    System.out.println("bayar: "+bayar);
                }else if(pilih == 3){
                    lanjut = false;
                }
            }
        sc.close();
        }
    }
    
    
