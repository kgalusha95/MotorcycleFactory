package race;

import track.DirtTrack;
import track.StreetTrack;
import track.Track;

public class Driver {

	public static void main(String[] args) {
		
		Track dirttrack = new DirtTrack("SouthWick");
		Track streettrack = new StreetTrack("Isle of Man");
		Race dirtrace = new Race(dirttrack);
		Race streetrace = new Race(streettrack);
		//race on a dirt track
		dirtrace.PrintRace();
		dirtrace.Penalty();
		dirtrace.Go();
		//race on street track
		streetrace.PrintRace();
		streetrace.Penalty();
		streetrace.Go();

	}

}
