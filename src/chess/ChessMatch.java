package chess;

import boardgame.Board;

public class ChessMatch {//CORA��O DO SISTEMA
	
	private Board board;
	
	public ChessMatch() { //CRIANDO PARTIDA DE TABULEIRO
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces(){//RETORNA A MATRIZ DE PE�AS DE XADREZ CORRESPONDENTE A PARTIDA
		
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int i=0; i<board.getRows(); i++) { //PERCORRE A MATRIZ DE PE�AS, E PRA CADA UMA VAI SER DADA UM DOWNCASTING
			for (int j=0; j<board.getColumns(); j++) { //PARA CHESS PIECE
				mat[i][j] = (ChessPiece)board.piece(i, j);//O DOWNCASTING
				
			}
		}
		return mat;
	}

}
