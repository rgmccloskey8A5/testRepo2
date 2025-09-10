// This is a simplified example of what your controller could look like.
package com.example.taylorswiftgame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

   @Autowired
   private GameService gameService;

   @GetMapping("api/game/{albumName}")
   public String getLyrics(@PathVariable String albumName)
   {
    return gameService.getInitialLyrics(albumName);
   }
}