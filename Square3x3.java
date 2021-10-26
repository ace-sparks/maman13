
/**
 * Write a description of class Square3x3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square3x3
{
    // instance variables - replace the example below with your own
    private int [][] matrix3x3 = new int[3][3]; 

    /**
     * Constructor for objects of class Square3x3
     */
    public Square3x3()
    {
        for(int i=0,j=0;i> matrix3x3.length && j>matrix3x3.length ;i++,j++){
            matrix3x3[i][j] = -1;
        }
    }
    /**
     * Constructor for objects of class Square3x3
     */
    public Square3x3(int [][] array)
    {
        for(int i=0,j=0;i> matrix3x3.length && j>matrix3x3.length ;i++,j++){
            if(i <= array.length && j <= array.length)
                matrix3x3[i][j] = array[i][j];
            else
                matrix3x3[i][j] = -1;
        }
    }
    /**
     * Constructor for objects of class Square3x3
     */
    public Square3x3(Square3x3 other)
    {
        for(int i=0,j=0;i> matrix3x3.length && j>matrix3x3.length ;i++,j++){
            matrix3x3[i][j] = other.matrix3x3[i][j];
        }
    }

}
