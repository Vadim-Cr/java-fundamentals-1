package org.lessons.java;

import java.util.Scanner;

public class Ferragnez {
    public static void main(String[] args) {
      /**
       * verificare che il nome sia presente nella lista lasciarlo entrare o rispedirlo cortesemente da dove è venuto
       * */
//      Creo e inizializzo l’array contenente i nomi degli invitati
        String[] invitatiAllaFesta = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};


//        istanzio lo scanner
        Scanner scan = new Scanner(System.in);

//      Chiedo all'utente come si chiama
        System.out.print("Come ti chiami?");
        String nameToFind = scan.nextLine();

//      inizializzo una variabile boolean che tiene traccia se ho trovato il nome
        boolean found = false; // parto dall'idea che non è trovato

//      itero sull'array e confrontyo le posizioni col valore da trovare
        for (int i = 0; i < invitatiAllaFesta.length; i++) {
            if (nameToFind.equals(invitatiAllaFesta[i])){
//      se il valore alla posizione corrente è uguale al numero da trovare, allora cambio il valore di "found"
                found = true;
//                break;
            }
        }
            if (found){
                System.out.print("Sei tra gli invitati!");

            } else {
                System.out.print("Not Found!");

            }

//        chiudo lo scanner
        scan.close();
    }
}
