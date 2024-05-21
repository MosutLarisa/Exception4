
public class Minge {
    private int x;
    private int y;
    
    public Minge(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void suteaza() throws Out, Gol, Corner {
        CoordinateGenerator generator = new CoordinateGenerator();
        x = generator.generateX();
        y = generator.generateY();
        
        if (y == 0 || y == 50) {
            throw new Out();
        }
        
        if ((x == 0 || x == 100) && (y >= 20 && y <= 30)) {
            throw new Gol();
        }
        
        if ((x == 0 || x == 100) && ((y > 0 && y < 20) || (y > 30 && y < 50))) {
            throw new Corner();
        }
    }
}
