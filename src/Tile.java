import java.util.ArrayList;

public class Tile { //Defining a tile

    //"Tile" dimensions
    private ArrayList<Integer> tileX = new ArrayList<Integer>();
    private ArrayList<Integer> tileY = new ArrayList<Integer>();

    //"Camera" dimensions
    private int camX;   //Camera dimensions in the Blender file. Used to calculate ideal tile sizes.
    private int camY;

    public void setCamDim(int camX, int camY) {
        this.camX = camX;
        this.camY = camY;
    }

    //previous system wasn't working. Back to the drawing board.
    public void findXFactors() {   //A method for finding the factors of the camX value.

        int factors = 1;    

        tileX.add(factors);         //This assigns 1 and the value of camX to tileX, because every number has 1 and itself as a factor.
        tileX.add(camX/factors);
        factors++;

        if ((camX % factors) == 0) {   
            tileX.add(factors);
            tileX.add(camX/factors);
        }

    }

    public int getXFactors(int i) { //get an index of tileX.
        return tileX.get(i);
    }
    
    public void findYfactors() {    //A method for finding the factors of the camY value.

    }

    /*
    There are currently no setter methods for the tile dimensions, or getter methods for the camera dimensions.
    This is due to the idea that you enter in the camera dimensions and receive the tile dimensions. Later on a complete
    set of getter and setter methods may be added.
    */


}