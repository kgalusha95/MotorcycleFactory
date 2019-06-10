package ktm;

import motorcyclefactory.Dirtbike;
import motorcyclefactory.MotorcycleFactory;
import motorcyclefactory.Nakedbike;
/* KTM is a KTM factory*/
public class KTM extends MotorcycleFactory {
	@Override
	public Nakedbike getNakedbike() {
		return new SuperDuke();
	}
	@Override
	public Dirtbike getDirtbike() {
		return new SX250();
	}

}
