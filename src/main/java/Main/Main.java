/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Game.Game;
import GameRepository.GameRepository;

/**
 *
 * @author Kidoo
 */
public class Main {
    public static void main(String[] args) {
        GameRepository gameRepository = new GameRepository();

        // Menambahkan beberapa game ke repository
        gameRepository.addGame(new Game("1", "The Legend of Zelda", "Adventure"));
        gameRepository.addGame(new Game("2", "Super Mario Bros", "Platformer"));
        gameRepository.addGame(new Game("3", "Minecraft", "Sandbox"));

        // Menampilkan semua game
        System.out.println("All Games:");
        for (Game game : gameRepository.getAllGames()) {
            System.out.println(game);
        }

        // Mencari game berdasarkan ID
        System.out.println("\nGame with ID 2:");
        Game game = gameRepository.getGameById("2");
        if (game != null) {
            System.out.println(game);
        } else {
            System.out.println("Game not found");
        }

        // Menghapus game berdasarkan ID
        gameRepository.deleteGameById("2");

        // Menampilkan semua game setelah penghapusan
        System.out.println("\nAll Games after deletion:");
        for (Game g : gameRepository.getAllGames()) {
            System.out.println(g);
        }
    }
}

