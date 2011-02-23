package massaaudente.tags.album;
import java.util.ArrayList;
import massaaudente.tags.track.*;

public interface AlbumIf {

	//GETTERS
	public String getName();
	public int getYear();
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
	
	public void sortTracks();
}
