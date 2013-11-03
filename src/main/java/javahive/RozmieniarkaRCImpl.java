package javahive;

public class RozmieniarkaRCImpl implements Rozmieniarka {
	
	private final double EPS = 1e-10;
	
	public Nominaly rozmien(double kwota, double[] dostepneNominaly) { 
		Nominaly nominaly = new Nominaly();
		int kwotaInt = (int) (100.0 * kwota + EPS);
		if (kwotaInt < 0) {
			throw new ArithmeticException();
		}
		int biezNomInd = 0;
		while (kwotaInt > 0) {
			int biezNom = (int) (100.0 * dostepneNominaly[biezNomInd] + EPS);
			int ilosc = kwotaInt / biezNom;
			kwotaInt %= biezNom;
			if (ilosc > 0) {
				nominaly.setIlosc(dostepneNominaly[biezNomInd], ilosc);
			}
			biezNomInd++;
		}
		return nominaly;
	}
}
