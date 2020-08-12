import java.util.ArrayList;

public class Tile { //Defining a tile

    //"Tile" dimensions
    private ArrayList<Integer> tileX = new ArrayList<Integer>();
    private ArrayList<Integer> tileY = new ArrayList<Integer>();

    //"Camera" dimensions
    private int camX;   //Camera dimensions in the Blender file. Used to calculate ideal tile sizes.
    private int camY;

    //ArrayList<Integer> factors = new ArrayList<Integer>();

    public void findXFactors() {   //A method for finding the factors of the camX value.
            
        /* Checking if the remainder of camX and factors is 0, meaning the value of factors is actually a factor.
        the factors <= camX/2 part is to reduce work. Since factors work in pairs, the computer just has to find the lower factor and divide
        camX by that factor to find the other. Then the factors are stuck in an array. Order doesn't matter, because when they're
        checked with the factors of camY, the only the values of the array indicies are checked. */
        for (int factors = 1; factors <= (camX/2); factors++) {

            if ((camX % factors) == 0) {   
                tileX.add(factors);
                tileX.add(camX/factors);
            }

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
    public void setCamDim(int camX, int camY) {
        this.camX = camX;
        this.camY = camY;
    }


}