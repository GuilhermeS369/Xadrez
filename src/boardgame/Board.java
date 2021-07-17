package boardgame;

public class Board {

	private int rows; //LINHAS
	private int columns; //COLUNAS
	private Piece [][] pieces; //A MATRIZ 
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; //A PEÇA VAI SER INTANCIADA NA QUANTIRDADE DE LINHAS E COLUNAS INFORMADAS
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece (int row, int column) {//RETORNA A PEÇA DADA UMA LINHA E UMA COLUNA
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()]; // RETORNA A LOCALIZAÇÃO
	}
	
	
	
}
