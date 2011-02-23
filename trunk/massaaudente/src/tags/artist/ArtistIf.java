package massaaudente.tags.artist;
import java.util.ArrayList;
import massaaudente.tags.album.*;

public interface ArtistIf {

	//GETTERS
	public String getName();
	public ArrayList<AlbumIf> getAlbums();
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
