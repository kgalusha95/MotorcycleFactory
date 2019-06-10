package race;

import java.util.ArrayList;

import kawasaki.Kawasaki;
import ktm.KTM;
import motorcyclefactory.Color;
import motorcyclefactory.Dirtbike;
import motorcyclefactory.Motorcycle;
import motorcyclefactory.MotorcycleFactory;
import motorcyclefactory.Nakedbike;
import track.DirtTrack;
import track.StreetTrack;
import track.Track;
//This class is acting as a facade for all the motorcycle, factory, and track classes 
/* this class uses functionality from all the classes so that the user of these classes can
 simply provide a track to a race and have a race between the KTM and Kawasaki teams*/
public class Race {
	ArrayList<Motorcycle<Integer>> bikes = new ArrayList<Motorcycle<Integer>>();
	Track track;
	Team ktmTeam;
	Team kawasakiTeam;
	//initializes a race
	public Race(Track track) {
		this.track = track;
		MotorcycleFactory ktm = new KTM();
		ktmTeam = new Team(ktm);
		MotorcycleFactory kawasaki = new Kawasaki();
		kawasakiTeam = new Team(kawasaki);
		bikes.add(ktmTeam.getNakedBike());
		bikes.add(ktmTeam.getDirtBike());
		bikes.add(kawasakiTeam.getNakedBike());
		bikes.add(kawasakiTeam.getDirtBike());
	}
	//takes the track type into consideration for top speed
	public void Penalty() {
		for(Motorcycle<Integer> m : bikes) {
			if(track instanceof DirtTrack) {
				if(m instanceof Nakedbike)
					m.setTopSpeed(m.getTopSpeed() - 100);
			}
			if(track instanceof StreetTrack) {
				if(m instanceof Dirtbike)
					m.setTopSpeed(m.getTopSpeed() - 10);
			}
		}
	}
	//starts the drag race which will be won by top speed
	public void Go() {
		int i = bikes.size();
		System.out.println("Ready... Set... Go!");
		Motorcycle<Integer> winner = new Motorcycle<Integer>("", 0, 0, Color.ORANGE);
		bikes.sort((m1, m2)-> m1.getTopSpeed().compareTo(m2.getTopSpeed()));
		for(Motorcycle<Integer> m : bikes) {
				System.out.println("Position " + i + ": " + m);
				i--;
			}
		winner = bikes.get(bikes.size() - 1);
		System.out.println("The winner is " + winner + "!");
		System.out.println("--------------------------\n");
		}
	//Prints track and teams
	public void PrintRace() {
		System.out.println("Race is at " + track);
		System.out.println("Team KTM is " + ktmTeam);
		System.out.println("Team Kawaski is " + kawasakiTeam);
	}
}
