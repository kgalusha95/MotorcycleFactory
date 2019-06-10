package race;

import motorcyclefactory.Dirtbike;
import motorcyclefactory.MotorcycleFactory;
import motorcyclefactory.Nakedbike;
//The team class uses the motorcycle factories to create the teams that will be racing
public class Team {
	private Nakedbike nakedbike;
	private Dirtbike dirtbike;
	
	public Team(MotorcycleFactory motorcyclefactory) {
		nakedbike = motorcyclefactory.getNakedbike();
		dirtbike = motorcyclefactory.getDirtbike();
	}
	
	public Nakedbike getNakedBike(){
		return nakedbike;
	}
	public Dirtbike getDirtBike(){
		return dirtbike;
	}
	public String toString() {
		return "Racing: " + this.dirtbike + " \n" + this.nakedbike;
	}

}
