package com.github.smuddgge;

import com.github.smuddgge.controllers.Player;
import com.github.smuddgge.game.ChessColour;
import com.github.smuddgge.game.ChessGame;
import com.github.smuddgge.game.CustomChessGame;
import com.github.smuddgge.game.layout.BoardLayoutDefault;
import com.github.smuddgge.positions.BoardSize;
import com.github.smuddgge.positions.ModularPosition;
import com.github.smuddgge.positions.Position;

import java.util.ArrayList;

/**
 * Application pointer
 */
public class Main extends ModdedClient {

    /**
     * Starting point
     * @param args No arguments required
     */
    public static void main(String[] args) {

        Main main = new Main();
        main.start();

    }

    public ArrayList<CustomChessGame> getChessGames() {
        ArrayList<CustomChessGame> chessGames = new ArrayList<>();

        CustomChessGame customChessGame = new CustomChessGame(
                new ModularPosition(500, 500).setStatic(true).setPos1(
                        new Position(10, 10)
                ).setToFirstPosition(),

                new Player(ChessColour.WHITE),
                new Player(ChessColour.BLACK),

                new BoardSize(10, 10),
                new CustomBoardLayout(),
                "Wizard!"
        );

        chessGames.add(customChessGame);

        return chessGames;
    }
}