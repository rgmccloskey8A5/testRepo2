package com.example.taylorswiftgame;

import org.springframework.stereotype.Service; 

@Service
public class GameService
{
    public String getInitialLyrics (String albumName)
    {
        return "Lyrics for " + albumName; 
    }
}