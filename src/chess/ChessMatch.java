package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {//CORAÇÃO DO SISTEMA
	
	private Board board;
	
	public ChessMatch() { //CRIANDO PARTIDA DE TABULEIRO
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){//RETORNA A MATRIZ DE PEÇAS DE XADREZ CORRESPONDENTE A PARTIDA
		
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int i=0; i<board.getRows(); i++) { //PERCORRE A MATRIZ DE PEÇAS, E PRA CADA UMA VAI SER DADA UM DOWNCASTING
			for (int j=0; j<board.getColumns(); j++) { //PARA CHESS PIECE
				mat[i][j] = (ChessPiece)board.piece(i, j);//O DOWNCASTING
				
			}
		}
		return mat;
	}
	
	private void initialSetup() { //METODO RESPONSAVEL POR COLOCAR AS PEÇAS NO TABUELIRO
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}

	
}
