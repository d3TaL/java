package pract5;

public class MovablePoint implements Movable
{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString()
    {
        return "X: "+x + " Y: " + y;
    }

    public void moveUp()
    {
        this.y += ySpeed;
    }

    public void moveDown()
    {
        this.y -= ySpeed;
    }

    public void moveLeft()
    {
        this.x -= xSpeed;
    }

    public void moveRight()
    {
        this.x += xSpeed;
    }
}
