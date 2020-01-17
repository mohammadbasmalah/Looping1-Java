/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop1;

import static java.lang.System.out;

/**
 *Increment, Decrement
 * @author USER
 */
public class Loop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=5;
        out.println("n = "+n);
        n--;
        out.println("Setelah Menggunakan n--, Nilai n Sekarang Adalah = "+n);
        --n;
        out.println("Setelah Menggunakan --n, Nilai n Sekarang Adalah = "+n+"\n");
        
        int A=n--;
        out.println("Kasus A=n--");
        out.println("Nilai A Adalah" +A);
        out.println("Setelah Menggunakan n--, NIlai n Sekarang Adalah" +n);
        out.println("Ini Artinya");
        out.println("A=n");
        out.println("n=n-1\n");
        
        A=++n;
        out.println("Kasus A=--n");
        out.println("Nilai A Adalah" +A);
        out.println("Setelah MEnggunakan --n, NIlai n Sekarang Adalah" +n);
        out.println("Ini Artinya");
        out.println("n=n-1");
        out.println("A=n\n");
    }
    
}
