package javahive;

import org.junit.Test;

public class RozmieniarkaTest {
	private final double[] NOMINALY_PL = { 200, 100, 50, 20, 10, 5, 2, 1, .50, .20, .10, .05, .02, 0.01 };
	@Test
	public void PowinienRozmieniac(){
		System.out.println(new RozmieniarkaImpl().rozmien(34.43,NOMINALY_PL));
	}
}
