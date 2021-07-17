package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // USADO APENAS PARA ENFATIZAR Q POSTION É POR PADRAO NULO
		
	}

	protected Board getBoard() { //LOCALIZAÇÃO DA PEÇA DENTRO DO TABULEIRO
		return board;
	}

	
}
