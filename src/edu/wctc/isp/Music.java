package edu.wctc.isp;

import java.time.Duration;


public interface Music extends Product{
    String getArtist();

    Duration getPlayingTime();


}
