import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        List<List<Integer>> matrix = new ArrayList<>();

        int col_number = 7;
        int row_number = 7;
        int value = 1;

        // Inicijalizacija matrice 7x7
        for (int i = 0; i < col_number; i++) 
        {
            List<Integer> row = new ArrayList<>();
            
            for (int j = 0; j < row_number; j++) 
            {
                row.add(value++);
            }
            
            matrix.add(row);
        }

        // Ispis matrice
        for (int i = 0; i < col_number; i++) 
        {
            for (int j = 0; j < row_number; j++) 
            {
                System.out.printf("%3d ", matrix.get(i).get(j));
            }
            
            System.out.println();
        }
    }
}
