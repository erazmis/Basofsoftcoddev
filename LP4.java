// Изменить число формата ххх.ууу на ууу.ххх
package com.company;

import java.util.Scanner;

public class LP4 {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double a = scan.nextDouble();
	int n = (int) a;
	int m = (int) ((a % 1) * 1000);
	System.out.println(m + "." + n);

    }
}
