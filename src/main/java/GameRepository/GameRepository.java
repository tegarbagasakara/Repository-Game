/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameRepository;

/**
 *
 * @author Kidoo
 */
import Game.Game;
import java.util.ArrayList;
import java.util.List;

public class GameRepository {
    private final List<Game> games;

    public GameRepository() {
        this.games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public Game getGameById(String id) {
        for (Game game : games) {
            if (game.getId().equals(id)) {
                return game;
            }
        }
        return null;
    }

    public List<Game> getAllGames() {
        return games;
    }

    public void deleteGameById(String id) {
        games.removeIf(game -> game.getId().equals(id));
    }
}
