package com.mycompany.fibcalc;

import java.util.Scanner;

/**
 *
 * @author Simon
 */

public class FibCalc {
    
  public static long fibonacciSequence(int n) {
      
    if (n <= 1) return n;
    else return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
  }

  public static void main(String[] args) {
      
    Scanner scanner=new Scanner(System.in);
    System.out.println("FibCalc\nSzymon Schab\nI2S 2.4\n");
    System.out.println("Wprowadz indeks dla elementu ciagu Fibonacciego (kolejnosc od zera):");
    int n=scanner.nextInt();
    System.out.println("Wartosc dla wskazanego elementu wynosi: " + fibonacciSequence(n));
  }
}
