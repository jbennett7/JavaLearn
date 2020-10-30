class GameShape {
	public void displayShape() {
		System.out.println("displaying shape");
	}
}
class PlayerPiece extends GameShape {
	public void movePiece() {
		System.out.println("moing game piece");
	}
}
class TilePiece extends GameShape {
	public void getAdjacent() {
		System.out.println("getting adjacent tiles");
	}
}
public class TestShapes {
	public static void main (String[] args) {
		PlayerPiece player = new PlayerPiece();
		TilePiece tile = new TilePiece();
		doShapes(player);
		doShapes(tile);
	}
	public static void doShapes(GameShape shape) {
		shape.displayShape();
	}
}
