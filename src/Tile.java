
public class Tile { //Defining a tile

    //"Tile" dimensions
    private int tileX;  //Every tile has an X and Y dimension.
    private int tileY;

    //"Camera" dimensions
    private int camX;   //Camera dimensions in the Blender file. Used to calculate ideal tile sizes.
    private int camY;

    /*
    The concept for this project is simple.
    */
    public void findXFactors() {   //A method for finding the factors of the camX value.

    }
    
    public void findYfactors() {    //A method for finding the factors of the camY value.

    }
    
    /*
    There are currently no setter methods for the tile dimensions, or getter methods for the camera dimensions.
    This is due to the idea that you enter in the camera dimensions and receive the tile dimensions. Later on a complete
    set of getter and setter methods may be added.
    */
    public void setCamX(int camX) {
        this.camX = camX;
    }

    public void setCamY(int camY) {
        this.camY = camY;
    }

    public int getTileX() {
        return tileX;
    }

    public int getTileY() {
        return tileY;
    }



}