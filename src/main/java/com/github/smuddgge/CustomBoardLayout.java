package com.github.smuddgge;

import com.github.smuddgge.game.ChessBoard;
import com.github.smuddgge.game.ChessColour;
import com.github.smuddgge.game.layout.BoardLayout;
import com.github.smuddgge.pieces.Wizard;
import com.github.smuddgge.positions.TilePosition;

public class CustomBoardLayout implements BoardLayout {

    @Override
    public void update(ChessBoard chessBoard) {
        chessBoard.getTile(new TilePosition(1, 1)).setPiece(new Wizard(ChessColour.WHITE));
        chessBoard.getTile(new TilePosition(10, 10)).setPiece(new Wizard(ChessColour.BLACK));
    }
}
