package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu ="?nternet ?ubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar D??t? Resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar Y?kseldi Resmi");
		}else {
			System.out.println("Dolar E?ittir Resmi");
		}
		
		
		String[] krediler = 
			{
				"H?zl? Kredi",
				"Mutlu emekli kredisi",
				"Konut kedisi",
				"Msb kredisi",
				"Meb kredisi",
				"K?lt?r bakanl??? kredisi"
				};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		//de?er type
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		 
		//array
		//referans type
		int[] sayilar1 = {1,2,3,4,5,};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		//stringlere ?zel istisnai durum, de?er gibi g?sterir. arka planda char[] ?al??t?r?r.
		String sehir1 = "Ankara";
		String sehir2 = "?stanbul";
		sehir1 = sehir2;
		sehir2 ="?zmir";
		System.out.println(sehir1);
	}

}
