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
        int counter = 1;
        int factors = 1;

        tileX.add(factors);
        tileX.add(camX);

        factors++;

        while (factors < camX) {

            if (factors == tileX.get(counter)) {
                break;
                
            } else {

                if (camX % factors == 0) {
                    tileX.add(factors);
                    tileX.add(camX/factors);
                }

                counter++;
                factors++;

            }
        }
    }

    public void findYfactors() {    //A method for finding the factors of the camY value.

    }

    public int getXFactors(int i) { //get an index of tileX.
        return tileX.get(i);
    }

}