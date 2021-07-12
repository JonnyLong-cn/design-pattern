package structural.adapter.player.impl;

import structural.adapter.player.AdvancedMediaPlayer;

/**
 * @author Jonny Long
 * @date 2021/3/26 15:57
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {}
}
