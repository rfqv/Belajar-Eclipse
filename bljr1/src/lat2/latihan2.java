package lat2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan2 {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// Deklarasi
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int a, b;
		int hasil_penjumlahan, hasil_pengurangan, hasil_perkalian, hasil_modulus;
		double hasil_pembagian;
		
		// Input
		System.out.print("Masukkan nilai a = ");
		a = Integer.parseInt(br.readLine());
		System.out.print("Masukkan nilai b = ");
		b = Integer.parseInt(br.readLine());
		
		// Proses
		hasil_penjumlahan = a+b;
		hasil_pengurangan = a-b;
		hasil_pembagian = (double)a/b;
		hasil_perkalian = a*b;
		hasil_modulus = a%b;
		
		// Output
		System.out.println("Hasil penjumlahan = " +hasil_penjumlahan);
		System.out.println("Hasil pengurangan = " +hasil_pengurangan);
		System.out.println("Hasil perkalian = " +hasil_perkalian);
		System.out.println("Hasil pembagian = " +hasil_pembagian);
		System.out.println("Hasil modulus = " +hasil_modulus);

	}

}
