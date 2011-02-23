import java.util.Arraylist

public class Artist {
	
	private String name;
	private ArrayList<Album> albums;
	//private Image artist_cover;
	
	private boolean valid_name = false;
	private boolean valid_artist_cover = false;

	//GETTERS
	public String getName();
	public ArrayList<Album> getAlbums();
	//public Image getArtistCover();
	
	public boolean isValidName();
	public boolean isValidArtistCover();
	
	//SETTERS
	public void setName(String name);
	//!!!!vvvvvv
	public void setTracks();
	//public void setCover(Image cover);

	public void setValidName(boolean value);
	public void setValidCover(boolean value);
}
