package tetris;

public class Tile {
    private char status = 'e';
    private int x;
    private int y;

    public Tile(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void setState(char letter){ //Method to update the tile state
        if(!"efa".contains(Character.toString(letter))){ //Check valid input
         throw new IllegalArgumentException("Not a valid state for The tile at:("+x+","+y+")");   
        }
        status = letter;
    }

    public char getState(){
        return status;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public static void main(String[] args) {
    }
}
