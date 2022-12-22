package practice73;

public class MovableCircle implements Movable
{
    private int radius = 0;
    private MovablePoint center = new MovablePoint(0,0,0,0);

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        return "X: "+center.x + " Y: " + center.y + " Radius: "+ radius;
    }

    public void moveUp()
    {
        center.y += center.ySpeed;
    }

    public void moveDown()
    {
        center.y -= center.ySpeed;
    }

    public void moveLeft()
    {
        center.x -= center.xSpeed;
    }

    public void moveRight()
    {
        center.x += center.xSpeed;
    }
}
