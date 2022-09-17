package com.github.smuddgge.pieces;

import com.github.smuddgge.game.ChessBoard;
import com.github.smuddgge.game.ChessBoardTile;
import com.github.smuddgge.game.ChessColour;
import com.github.smuddgge.game.pieces.Piece;
import com.github.smuddgge.game.pieces.standered.Bishop;
import com.github.smuddgge.game.pieces.standered.Knight;
import com.github.smuddgge.game.pieces.standered.Rook;
import com.github.smuddgge.positions.TilePosition;

import java.util.ArrayList;

public class Wizard extends Piece {

    /**
     * Used to create a wizard piece
     * @param colour The colour of the piece
     */
    public Wizard(ChessColour colour) {
        super(colour);

        this.getOptions().endsGame = true;
    }

    public String getPathWhite() {
        return "src/main/resources/wizard.jpeg";
    }

    public String getPathBlack() {
        return "src/main/resources/wizard.jpeg";
    }

    public int getValue() {
        return 10;
    }

    public ArrayList<ChessBoardTile> getValidPositions(ChessBoard chessBoard, ChessBoardTile chessBoardTile) {
        ArrayList<ChessBoardTile> tiles = new ArrayList<>();

        tiles.addAll(new Knight(ChessColour.BLACK).getValidPositions(chessBoard, chessBoardTile));
        tiles.addAll(new Rook(ChessColour.BLACK).getValidPositions(chessBoard, chessBoardTile));

        return tiles;
    }

    public ArrayList<ChessBoardTile> getTakePositions(ChessBoard chessBoard, ChessBoardTile chessBoardTile) {
        return this.getValidPositions(chessBoard, chessBoardTile);
    }
}
