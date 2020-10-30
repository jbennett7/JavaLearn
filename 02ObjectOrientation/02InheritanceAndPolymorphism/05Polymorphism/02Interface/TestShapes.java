interface Animatable {
	public void animate();
}
class GameShape {
	public void displayShape() {
		System.out.println("displaying shape");
	}
}
class PlayerPiece extends GameShape implements Animatable {
	public void movePiece() {
		System.out.println("moving game piece");
	}
	public void animate() {
		System.out.println("animating...");
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
		player.animate();
	}
	public static void doShapes(GameShape shape) {
		shape.displayShape();
	}
}
