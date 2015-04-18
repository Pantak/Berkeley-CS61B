/** file: Piece.java
*   author: S. Kojoian
*   Implementation of a piece
*/
public class Piece {
	private boolean isFire; 	// true - fire piece; false - water piece
	protected boolean kinged;	// reached final line
	protected boolean captured;		// initializes to false since the piece hasn't
						// at its creation
	private Board board;
	private int x;			// x coordinate
	private int y;			// y coordinate
	private String type;		// pawn/shield/bomb

	/** CONSTRUCTOR 
	*   @param: boolean (is water/fire piece)
	*   @param: Board
	*   @param: int x, int y - the initial coordinates of this piece
	*   @param: String type - pawn/shield/bomb
	*   @return: Piece object
	*/
	public Piece(boolean isFire, Board b, int x, int y, String type){
		this.isFire = isFire;
		this.kinged = false;
		this.board = b;
		this.x = x;
		this.y = y;
		this.type = type;
		this.captured = false;
	}

	/** Returns true if this piece is a fire piece.
	*   False otherwise.
	*
	*  @return: Boolean
	*/
	public boolean isFire(){
		return isFire;
	}

	/** Returns 0 if this piece is a fire piece.
	*   1 otherwise.
	*
	*   @return: int
	*/
	public int side(){
		return captured ? 1 : 0;
	}

	/** Returns true if this piece has been Kinged.
	*   False otherwise.
	*
	*   @return: Boolean
	*/
	public boolean isKing(){
		return kinged;
	}

	/** Returns true if this piece is a Bomb.
	*   False otherwise.
	*
	*   @return: Boolean
	*/
	public boolean isBomb(){
		return getType() == "bomb";
	}

	/** Returns true if this piece is a Shield.
	*   False otherwise.
	*
	*   @return: Boolean
	*/
	public boolean isShield(){
		return getType() == "shield";
	}

	/** Helper method that returns the type
	*   of this piece.
	*
	*   @return: String type
	*/
	private String getType(){
		return type;
	}

	/** Returns true if this piece captured this
	*    turn. False otherwise.
	*
	*    @return: Boolean
	*/
	public boolean hasCaptured(){
		return captured;
	}

	/** Sets captured to false before current player's
	*   turn is over.
	*/
	public void doneCapturing(){
		captured = false;
	}
}