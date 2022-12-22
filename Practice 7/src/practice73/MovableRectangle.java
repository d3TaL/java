package practice73;

public class MovableRectangle implements Movable {

    MovablePoint topLeft = new MovablePoint(0, 1 ,0 ,0);
    MovablePoint bottomRight = new MovablePoint(1, 0 ,0 ,0);


    MovableRectangle(int tlx, int tly, int brx, int bry, int xSpeed, int ySpeed)
    {
        topLeft.x = tlx;
        topLeft.y = tly;
        bottomRight.x = brx;
        bottomRight.y = bry;
        topLeft.xSpeed = bottomRight.xSpeed = xSpeed;
        topLeft.ySpeed = bottomRight.ySpeed = ySpeed;
    }
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString()
    {
        return "Top left X: "+topLeft.x + " Top left Y: " + topLeft.y + " Bottom right X: "+bottomRight.x + " Buttom right Y: " + bottomRight.y;
    }

    public void speedTest(){
        if (topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed)
            System.out.println("Скорости совпадают");
        else
            System.out.println("Скорости различаются");
    }

}
