class Muzakki extends Warga{
	public Muzakki(char rt, String Nama, String JK, int Jml, int Shdqh){
		super(rt, Nama, JK, Jml, Shdqh);
	public void infoMuzakki(){
		int Shdqh;
		double Beras = 2.5;
		int hargaberas = 10000;
		int ZPJ = 25000;
		int ZakatBayar = Beras*jml*hargaberas;
		int Total = ZakatBayar + Shdqh;
		String [][] Muzakki = new String Muzakki [][]; 
		System.out.println(+Muzakki[0][0]+ +Muzakki[0][1]+ +Muzakki[0][2]+ +Muzakki[0][3]+ +Muzakki[0][4]);
		System.out.println(+Muzakki[1][0]+ +Muzakki[1][1]+ +Muzakki[1][2]+ +Muzakki[1][3]+ +Muzakki[1][4]);
		System.out.println(+Muzakki[2][0]+ +Muzakki[2][1]+ +Muzakki[2][2]+ +Muzakki[2][3]+ +Muzakki[2][4]);
		System.out.println(+Muzakki[3][0]+ +Muzakki[3][1]+ +Muzakki[3][2]+ +Muzakki[3][3]+ +Muzakki[3][4]);
		System.out.println("Jumlah Muzakki = " +Jml);
		System.out.println("Harga Beras = " +hargaberas);
		System.out.println("Besar Zakat Fitrah Per Jiwa = " +ZPJ);
	}
	
	}	
}