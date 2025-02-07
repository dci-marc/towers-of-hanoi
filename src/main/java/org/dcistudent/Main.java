package org.dcistudent;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input: ");
    int n = scanner.nextInt();
    System.out.println("Output:");
    Main.solveTowerOfHanoi(n, 'A', 'C', 'B');
    scanner.close(); // Close the scanner to prevent resource leaks
  }

  public static void solveTowerOfHanoi(int n, char source, char destination, char auxiliary) {
    if (n == 1) {
      System.out.println("Move disk 1 from tower " + source + " to tower " + destination);
      return;
    }
    Main.solveTowerOfHanoi(n - 1, source, auxiliary, destination);
    System.out.println("Move disk " + n + " from tower " + source + " to tower " + destination);
    Main.solveTowerOfHanoi(n - 1, auxiliary, destination, source);
  }
}