package javahive;

public class RozmieniarkaPSImpl implements Rozmieniarka {
	
	Double wynik;
	Nominaly pieniadze = new Nominaly();
	

	public Nominaly rozmien(double kwota, double[] dostepneNominaly) {
		
		for(int i=0;i<dostepneNominaly.length;i++)
		{
			wynik = kwota % dostepneNominaly[i];
			
			if(wynik != 0)
			{
				continue;
			}
			else
			{
				kwota = kwota-(dostepneNominaly[i]*wynik);
				Integer count = wynik.intValue();
				
				pieniadze.setIlosc(dostepneNominaly[i], count);
				
			}
		}
		
		
		return pieniadze;
	}

}
