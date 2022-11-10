package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên");
		int n = sc.nextInt();
		if(n % 3 == 0 || n % 5 == 0)  {
			System.out.println("Day la so chia het cho 3 hoac 5");
			
		}


}}