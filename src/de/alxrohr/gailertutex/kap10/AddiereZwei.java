/**
 * 
 */
package de.alxrohr.gailertutex.kap10;

import java.util.Scanner;

/**
 * @author Alexander Rohr
 *
 */
class AddiereZwei
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int erster, zweiter, summe ;   // Deklaration der int Variablen

    System.out.println("Geben Sie die erste Ganzzahl ein:");
    erster = scan.nextInt();       // Zeichen einlesen und in int konvertieren

    System.out.println("Geben Sie die zweite Ganzzahl ein:");
    zweiter = scan.nextInt();      // Zeichen einlesen und in int konvertieren

    summe = erster + zweiter;      // addiere die zwei ints, stelle das Ergebnis summe

    System.out.println("Die Summe von " + erster + " und " + zweiter + " ist " + summe );
  }
}