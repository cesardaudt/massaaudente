package massaaudente.tags.album;
import java.util.ArrayList;
import massaaudente.tags.track.*;

public class Album {

	private String name;
	private int year;
	//private Image cover;
	private int number_of_tracks;
	private ArrayList<TrackIf> tracks;
	private int number_of_discs;
	
	private boolean valid_name = false;
	private boolean valid_year = false;
	private boolean valid_cover = false;
	private boolean valid_number_of_discs = false;

	//GETTERS
	public String getName() {
		return "";
	}
	public int getYear() {
		return 666;
		//the number of the beast
	};
	//public Image getCover();
	public int getNumberOfTracks();
	public ArrayList<TrackIf> getTracks();
	public int getNumberOfDiscs();
	
	public boolean isValidName();
	public boolean isValidYear();
	public boolean isValidCover();
	public boolean isValidNumberOfDiscs();
	
	//SETTERS
	public void setName(String name);
	public void setYear(int year);
	//public void setCover(Image cover);
	public void setNumberOfTracks(int tracks);
	//!!!!vvvvvv
	public void setTracks();
	public void setNumberOfDiscs(int discs);
	
	public void setValidName(boolean value);
	public void setValidYear(boolean value);
	public void setValidCover(boolean value);
	public void setValidNumberOfDiscs(boolean value);
	
	private void sortTracks();
}
