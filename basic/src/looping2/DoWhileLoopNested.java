package looping2;

public class DoWhileLoopNested {
    public String getNumberTriangle (int max) {
        String triangle = "";
        int i = 1;
        do {
            int j = 1;
            do {
                triangle = triangle + j;
                j++;
            } while (j <= i);
            if (i < max) {  // Only add newline if not the last row
                triangle = triangle + "\n";
            }
            i++;
        } while (i <= max);
        return triangle;
    }
}
