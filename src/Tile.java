import java.util.ArrayList;

public class Tile { //Defining a tile

    //"Tile" dimensions
    private ArrayList<Integer> tileX = new ArrayList<>();
    private ArrayList<Integer> tileY = new ArrayList<>();

    //"Camera" dimensions - resolution.
    private int camX;   //Camera dimensions in the Blender file. Used to calculate ideal tile sizes.
    private int camY;

    public void setCamDim(int camX, int camY) {
        this.camX = camX;   //assign the camX and camY parameters to their corresponding fields.
        this.camY = camY;
    }

    //previous system wasn't working. Back to the drawing board.
    public void findXFactors() {   //A method for finding the factors of the camX value.

        int factor = 4;     //Factors to use to divide the camX by.

        tileX.add(factor);  //We know the first two factors of camX - 1 and camX itself.
        tileX.add(camX);

        factor++;           //increase factor by one (so it's 2).

        int index = 1;      //Index - program checks if factor is equal to the tileX elements one and 2 before the current one.
        
        System.out.println((double)factor);                     //debugging - making sure that the remainder of camX and factor is a double.
        System.out.println(((double)camX % (double)factor));

        if (tileX.get(index) != factor || tileX.get(index-1) != factor) {
            
            if ((double)camX % (double)factor == 0) {
                tileX.add(factor);
                tileX.add(camX/factor);
                
                factor++;
                index +=2;
            } else {
                factor++;
                index+=2;
            }
        }

    }

    public void findYfactors() {    //A method for finding the factors of the camY value.

    }

    public int getXFactors(int i) { //get an index of tileX.
        return tileX.get(i);
    }

}