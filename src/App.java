public class App {
    public static void main(String[] args) throws Exception {

        Tile tile = new Tile();
        tile.setCamDim(1920, 1080);

        tile.findXFactors();

        for (int x = 0; x < 100; x++) {
            System.out.println(tile.getXFactors(x));
        }

    }
}
