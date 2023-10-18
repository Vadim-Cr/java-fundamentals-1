package org.lessons.java.security;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        /**
         * salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno in numero
         * generare (e stampare a video) una password  concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere
        * */
//      Istanzio lo scanner
        Scanner scan = new Scanner(System.in);

//      Il programma chiede all’utente il suo nome
        System.out.print("Inserire il nome dell'utente?");
        String name = scan.nextLine();

        System.out.println(name);

//      Il programma chiede all’utente il suo cognome
        System.out.print("Inserire il cognome dell'utente?");
        String surname = scan.nextLine();

        System.out.println(surname);
//      Il programma chiede all’utente il suo colore preferito
        System.out.print("Inserire il colore preferito dell'utente?");
        String favColor = scan.nextLine();

        System.out.println(favColor);

//      Il programma chiede all’utente la sua data di nascita
        System.out.print("Inserire la data di nascita dell'utente in formato anno-mese-giorno: ");
        String inputData = scan.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate userDate = LocalDate.parse(inputData, formatter);
        System.out.println(userDate);

        String Password = name + "-" + surname + "-" + favColor + "-" + inputData ;
        System.out.println(Password);
//      chiudo lo scanner
        scan.close();
    }
}
