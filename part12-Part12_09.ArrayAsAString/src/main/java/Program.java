
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }
    
    public static String arrayAsString(int[][] array) {
        StringBuilder reprezentare = new StringBuilder();
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j< array[i].length; j++) {
                reprezentare.append(array[i][j]);
            }
            reprezentare.append("\n");
        }
        
        return reprezentare.toString();

}
}
