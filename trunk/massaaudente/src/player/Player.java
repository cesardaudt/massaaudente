/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package player;

import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.headless.HeadlessMediaPlayer;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author jwaghetti
 */
public class Player {

	MediaPlayerFactory mediaPlayerFactory;
	HeadlessMediaPlayer mediaPlayer;

	public Player() {
		mediaPlayerFactory = new MediaPlayerFactory();
		mediaPlayer = mediaPlayerFactory.newMediaPlayer();
	}

	public void reinitMediaPlayer() {
		mediaPlayer = mediaPlayerFactory.newMediaPlayer();
	}

	public HeadlessMediaPlayer getMediaPlayer() {
		return mediaPlayer;
	}


}
