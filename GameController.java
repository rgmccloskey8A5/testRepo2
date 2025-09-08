// This is a simplified example of what your controller could look like.
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    // The game logic from your original files would be moved into service classes.
    private final GameService gameService = new GameService();

    // This creates an endpoint like: http://localhost:8080/api/game/reputation
    @GetMapping("/api/game/{albumName}")
    public String getLyrics(@PathVariable String albumName) {
        // Instead of printing to the console, your Java code will return the lyrics as a string.
        return gameService.getInitialLyrics(albumName);
    }
}