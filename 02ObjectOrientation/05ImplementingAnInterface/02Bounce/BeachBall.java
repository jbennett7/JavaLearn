abstract class Ball implements Bounceable {
	public void bounce() {}
}
public class BeachBall extends Ball {
//	public void bounce() {}
	public void setBounceFactor(int bf) {}
}
interface Bounceable {
	public void bounce();
	public void setBounceFactor(int bf);
}
