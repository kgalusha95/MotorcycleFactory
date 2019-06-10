package kawasaki;

import motorcyclefactory.Dirtbike;
import motorcyclefactory.MotorcycleFactory;
import motorcyclefactory.Nakedbike;
/*Kawasaki is a Kawasaki factory*/
public class Kawasaki extends MotorcycleFactory {
	@Override
	public Nakedbike getNakedbike() {
		return new Z1000();
	}
	@Override
	public Dirtbike getDirtbike() {
		return new KX250();
	}

}
