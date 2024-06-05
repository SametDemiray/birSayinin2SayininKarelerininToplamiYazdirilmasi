package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        boolean result;

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir tamsayı al
        System.out.print("Pozitif bir tamsayı girin: ");
        number = scanner.nextInt();

        // İki sayının kareleri toplamı şeklinde yazılıp yazılamayacağını kontrol et
        result = isSumOfSquares(number);

        // Sonucu ekrana yazdır
        if (result) {
            System.out.println(number + ", iki sayının kareleri toplamı şeklinde yazılabilir.");
        } else {
            System.out.println(number + ", iki sayının kareleri toplamı şeklinde yazılamaz.");
        }

        scanner.close();
    }

    public static boolean isSumOfSquares(int number){
        int i,j;
        // İki sayıyı aralık olarak 1'den başlayıp number'a kadar döngü ile kontrol et
        for (i=1; i*i<number; i++){
            j = (int) Math.sqrt(number - i * i); // İkinci sayıyı hesapla
            if (i * i + j * j == number){        // Eğer iki sayının kareleri toplamı number'a eşitse
                return true;                     // True döndür
            }
        }
                return false;                    // Hiçbir kombinasyon bulunamazsa false döndür
    }
}