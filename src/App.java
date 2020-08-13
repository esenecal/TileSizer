
/* 
For Testing: Factors of 1920 are (in pairs):
(1, 1920), (2, 960), (3, 640), (4, 480), (5, 384), (6, 320), (8, 240), (10, 192), 
(12, 160), (15, 128), (16, 120), (20, 96), (24, 80), (30, 64), (32, 60), (40, 48) 

Factors of 32:
(1, 32), (2, 16), (4,8)
*/


public class App {
    public static void main(String[] args) throws Exception {

        Tile tile = new Tile();
        tile.setCamDim(1920, 1080);

        tile.findXFactors();


        
        try {   //try catch statements - instead of trying to find the length of an array, this just prints out the array until it is done.

            int counter = 0;

            for ( ; ; ) {
                System.out.println(tile.getXFactors(counter));
                counter++;
            }

        } catch (IndexOutOfBoundsException e) {

            System.out.println();
            
        }

    }

}
