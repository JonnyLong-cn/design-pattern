package structural.adapter.player.impl;

import structural.adapter.player.AdvancedMediaPlayer;

/**
 * @author Jonny Long
 * @date 2021/3/26 15:58
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {}

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
