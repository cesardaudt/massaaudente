package massaaudente.tags.track;

public class Track {

	private int track_number;
	private String title;
	private String file_path;
	private int length;
	private int disc;
	private String composer;
	private String genre;
	private int bitrate;
	
	private boolean valid_name = false;
	private boolean valid_track = false;
	private boolean valid_disc = false;
	private boolean valid_composer = false;
	private boolean valid_genre = false;
	private boolean valid_bitrate = false;

	//GETTERS
	public int getTrackNumber();
	public String getTitle();
	public String getFilePath();
	public int getLength();
	public int getDisc();
	public String getComposer();
	public String getGenre();
	public int getBitrate();
	
	public boolean isValidName();
	public boolean isValidTrack();
	public boolean isValidDisc();
	public boolean isValidComposer();
	public boolean isValidGenre();
	public boolean isValidBitrate();
	
	//SETTERS
	public void setTrackNumber(int number);
	public void setTitle(String title);
	public void setFilePath(String path);
	public void setLength(int length);
	public void setDisc(int disc);
	public void setComposer(String composer);
	public void setGenre(String genre);
	public void setBitrate(int bitrate);
	
	public void setValidName(boolean value);
	public void setValidTrack(boolean value);
	public void setValidDisc(boolean value);
	public void setValidComposer(boolean value);
	public void setValidGenre(boolean value);
	public void setValidBitrate(boolean value);
}
