package boardgame;

public class Board {

	private int rows; //LINHAS
	private int columns; //COLUNAS
	private Piece [][] pieces; //A MATRIZ 
	
	public Board(int rows, int columns) {
		
		if (rows <1 || columns < 1 )
			throw new BoardException("Error creating board: thjere must be at least 1 row and 1 column");
		
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; //A PEÇA VAI SER INTANCIADA NA QUANTIRDADE DE LINHAS E COLUNAS INFORMADAS
	}

	public int getRows() {
		return rows;
	}


	public int getColumns() {
		return columns;
	}

	public Piece piece (int row, int column) {//RETORNA A PEÇA DADA UMA LINHA E UMA COLUNA
		if (!positionExists(row, column))
				throw new BoardException("Position not on hte board"); // PROGRAMAÇÃO DEFENSIVA
		
		return pieces[row][column];
	}
	
	public Piece piece(Position position) 	{
		if (!positionExists(position))
			throw new BoardException("Position not on hte board"); // PROGRAMAÇÃO DEFENSIVA
		return pieces[position.getRow()][position.getColumn()]; // RETORNA A LOCALIZAÇÃO
	}
	
	public void placePiece(Piece piece, Position position) { //COLAR PEÇAS NO TABULEIRO
		if (thereIsAPiece(position))
			throw new BoardException("There is already a piece on position" + position);
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >=0 && row < rows && column >= 0 && column < columns; //SE APOSIÇÃO EXISTE
	
	}
	
	public boolean positionExists(Position position) { //COMPLEMENTO
		return positionExists(position.getRow(), position.getColumn());
		
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position))
			throw new BoardException("Position not on hte board"); // PROGRAMAÇÃO DEFENSIVA
		return piece(position) != null;
				
	
	}
	
	
}
