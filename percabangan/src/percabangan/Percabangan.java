/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

/**
 *
 * @author MOKLET-2
 */
public class Percabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String identitas = "Vigo Oktario Arifianto / X RPL 3";
        System.out.println("Identitas : " + identitas);
        
        System.out.print("\nSaran resep dari bahan milik anda\n");
        Scanner scanner = new Scanner (System.in);
        System.out.println("Bahan Pertama: ");
        
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Masukkan no pilihan Anda : ");
        int bahan1 = scanner.nextInt();


    }
    
}
