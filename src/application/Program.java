package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
	
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces()); //FUN??O QUE IMPRIME AS PE?AS DA PARTIDA
		
	}

}
