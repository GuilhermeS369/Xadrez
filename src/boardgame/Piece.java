package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // USADO APENAS PARA ENFATIZAR Q POSTION � POR PADRAO NULO
		
	}

	protected Board getBoard() { //LOCALIZA��O DA PE�A DENTRO DO TABULEIRO
		return board;
	}

	
}
