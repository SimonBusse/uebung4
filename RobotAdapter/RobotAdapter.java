import Robot;

public class RobotAdapter implements Spieler
{
    public int geheNachLinks(int distanz) {
		int x = Robot.getX() - distanz;
		Robot.rolleNach(x,Robot.getY());
        return Robot.getX();
    }
    
    public int geheNachRechts(int distanz) {
		int x = Robot.getX() + distanz;
		Robot.rolleNach(x,Robot.getY());
        return Robot.getX();
    }
    
    public int geheNachOben(int distanz) {
		int y = Robot.getY() + distanz;
		Robot.rolleNach(Robot.getX(),y);
        return Robot.getY();
    }
    
    public int geheNachUnten(int distanz) {
		int y = Robot.getY() - distanz;
		Robot.rolleNach(Robot.getX(),y);
        return Robot.getY();
    }
    
    public String getName() {
        return this.toString();
    }
}