// NIM - Your Name
// NIM - Your Name

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jlhbuku;
        double harga, totalharga, murah;
        boolean next;

        murah = 9999;
        jlhbuku = 0;
        totalharga = 0;
        next = true;
        while (next == true) {
            harga = Double.parseDouble(input.nextLine());
            if (harga == 0) {
                next = false;
            } else {
                if (murah < harga) {
                } else {
                    murah = harga;
                }
                totalharga = totalharga + harga;
                jlhbuku = jlhbuku + 1;
            }
        }
        if (totalharga >= 100) {
            totalharga = totalharga - murah;
        }
        System.out.println(toFixed(totalharga,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
