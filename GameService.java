package com.example.game; 

import org.springframework.stereotype.Service; 

@Service
public class GameService
{
    public String getInitialLyrics (string albumName)
    {
        return "Lyrics for " + albumName; 
    }
}