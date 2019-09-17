/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitus_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Janne
 */
public class Harjoitus_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä nimi: ");
        String nimi = lukija.next();
        StringBuilder str = new StringBuilder();
        for (int i = nimi.length()-1; i >= 0; i--) {
            str.append(nimi.charAt(i));
        }
        System.out.println(str);
        //tarkastetaan onko nimi palindromi
        if(nimi.toUpperCase().equals(str.toString().toUpperCase())) {
            System.out.println("Nimi on palindromi.");
        } else {
            System.out.println("Nimi ei ole palindromi.");
        }
        System.out.println("Minnan lottorivi: " + luoLottorivi());
        System.out.println("Matin lottorivi: " + luoLottorivi());
    }
    
    public static List<Integer> luoLottorivi() {
         List<Integer> numerot = new ArrayList<>();
        for (int i = 1; i < 41; i++) {
            numerot.add(i);            
        }
        Collections.shuffle(numerot);
        numerot = numerot.subList(0, 7);
        return numerot;
    }
    
    public static List<Integer> vertaaLottorivit(List<Integer> rivi1, List<Integer> rivi2) {
        List<Integer> samatLuvut = new ArrayList<>();
        for (Integer luku : rivi1) {
            if (rivi2.contains(luku)) {
                samatLuvut.add(luku);
            }
        }
        return samatLuvut;
    }
            
}
