package looping2;

public class WhileLoopNested {
    public String getTriangle (int max) {
        String triangle = "";
        int i = 1;
        while (i <= max) {
            int j = 1;
            while (j <= i) {
                triangle = triangle + "*";
                j++;
            }
            if (i < max) {  // Only add newline if not the last line
                triangle = triangle + "\n";
            }
            i++;
        }
        return triangle;
    }
}
