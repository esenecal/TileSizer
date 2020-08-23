import java.util.ArrayList;

public class Tile { //Defining a tile

    //"Tile" dimensions
    private ArrayList<Integer> tileX = new ArrayList<>();
    private ArrayList<Integer> tileY = new ArrayList<>();

    //"Camera" dimensions
    private int camX;   //Camera dimensions in the Blender file. Used to calculate ideal tile sizes.
    private int camY;

    public void setCamDim(int camX, int camY) {
        this.camX = camX;   //assign the camX and camY parameters to their corresponding fields.
        this.camY = camY;
    }

    //previous system wasn't working. Back to the drawing board.
    public void findXFactors() {   //A method for finding the factors of the camX value.

        int factor = 1;     //Factors to use to divide the camX by.

        tileX.add(factor);  //We know the first to factors of camX - 1 and camX itself.
        tileX.add(camX);

        factor++;           //increase factor by one.

        int index = 1;      //Index - program checks if factor is equal to the tileX elements one and 2 before the current one.
        while (tileX.get(index) != factor || tileX.get(index-1) != factor) {

            if (camX % factor == 0) {
                tileX.add(factor);
                tileX.add(camX/factor);
                
                factor++;
                index +=2;
            } else {
                factor++;
            }

        }


    }

    public void findYfactors() {    //A method for finding the factors of the camY value.

    }

    public int getXFactors(int i) { //get an index of tileX.
        return tileX.get(i);
    }

}