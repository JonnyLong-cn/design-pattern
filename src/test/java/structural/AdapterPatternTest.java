package structural;

import org.junit.Test;
import structural.adapter.AudioPlayer;

import java.util.concurrent.Callable;

/**
 * @author Jonny Long
 * @date 2021/3/26 16:01
 */
public class AdapterPatternTest {
    @Test
    public void adapterPatternTest(){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
