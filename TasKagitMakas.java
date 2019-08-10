

import java.util.Scanner;
import java.util.Random;

public class TasKagitMakas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int i = 0,  bilSecim, secim, kulPuan = 0, bilPuan = 0;

		System.out.println("1 -> Tas , 2-> Kagit , 3-> Makas");

		do {
			System.out.print("Bir secim yapiniz : ");
			secim = input.nextInt();
			bilSecim = rand.nextInt(3);

			if (bilSecim == 1) {
				System.out.println("Bilgisayarin Secimi : TAS");
				if (secim == 1) {
					System.out.println("Berabere! Bilgisayar Puanı : " + bilPuan + " Kullanıcı Puanı : " + kulPuan);
					i++;
				} else if (secim == 2) {
					kulPuan++;
					System.out.println("Kazandın! Bilgisayar Puanı : " + bilPuan + " Kullanıcı Puanı : " + kulPuan);
					i++;

				} else if (secim == 3) {
					bilPuan++;
					System.out.println("Kaybettin! Bilgisayar Puanı : " + bilPuan + " Kullanıcı Puanı : " + kulPuan);
					i++;

				}
			} else if (bilSecim == 2) {
				System.out.println("Bilgisayarin Secimi : KAGIT");

				if (secim == 1) {
					bilPuan++;
					System.out.println("Kaybettin! Bilgisayar Puanı : " + bilPuan + " Kullanıcı Puanı : " + kulPuan);
					i++;

				} else if (secim == 2) {
					System.out.println("Berabere! Bilgisayar Puanı : " + bilPuan + " Kullanıcı Puanı : " + kulPuan);
					i++;

				} else if (secim == 3) {
					kulPuan++;
					System.out.println("Kazandın! Bilgisayar Puanı : " + bilPuan + " Kullanıcı Puanı : " + kulPuan);
					i++;

				}
			} else if (bilSecim == 3) {
				System.out.println("Bilgisayarin Secimi : MAKAS");

				if (secim == 1) {
					kulPuan++;
					System.out.println("Kazandın! Bilgisayar Puanı : " + bilPuan + " Kullanıcı Puanı : " + kulPuan);
					i++;

				} else if (secim == 2) {
					bilPuan++;
					System.out.println("Kaybettin! Bilgisayar Puanı : " + bilPuan + " Kullanıcı Puanı : " + kulPuan);
					i++;

				} else if (secim == 3) {
					System.out.println("Berabere! Bilgisayar Puanı : " + bilPuan + " Kullanıcı Puanı : " + kulPuan);
					i++;

				}
			}
		} while (i < 3);
		
		System.out.println();
		if (kulPuan > bilPuan) {
			System.out.println("KULLANICI OYUNU KAZANDI :)");
		} else if (kulPuan < bilPuan) {
			System.out.println("BILGISAYAR OYUNU KAZANDI :(");
		} else {
			System.out.println("OYUN BERABERE BİTTİ :P");
		}
		
		input.close();
	}

}
