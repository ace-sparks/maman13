
/**
 * Write a description of class Sudoku here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sudoku
{
    // instance variable
    private Square3x3 [][] sud_mat = new Square3x3 [3][3];

    /**
     * Constructor for objects of class Sudoku
     */
    public Sudoku()
    {
        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3 ; j++){
                sud_mat[i][j] = new Square3x3();
            }
        }
    }

    /**
     * Constructor for objects of class Sudoku
     */
    public Sudoku(Square3x3 [][] square3x3Array)
    {
        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3 ; j++){
                sud_mat[i][j] = new Square3x3(square3x3Array[i][j]);
            }
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        
    }
}
