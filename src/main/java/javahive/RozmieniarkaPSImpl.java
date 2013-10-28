package javahive;

public class RozmieniarkaPSImpl implements Rozmieniarka {
	
	Double[] wynik = new Double[100];
	Nominaly pieniadze = new Nominaly();
	

	public Nominaly rozmien(double kwota, double[] dostepneNominaly) {
		
		for(int i=0;i<dostepneNominaly.length;i++)
		{
			wynik[i] = kwota % dostepneNominaly[i];
			
			if(wynik[i] != 0)
			{
				continue;
			}
			else
			{
				kwota = kwota-(dostepneNominaly[i]*wynik[i]);
				Integer count = wynik[i].intValue();
				
				return pieniadze;
				
			}
		}
		
		
		return null;
	}

}
