package looping2;

public class ForLoopNested {
    public String getGrid(int max) {
        String grid = "";
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                grid = grid + "Row " + i + " Col " + j + "\n";
            }
        }
        return grid.trim();
    }
}