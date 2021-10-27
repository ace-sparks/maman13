
/**
 * Write a description of class Square3x3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square3x3
{
    // instance variables
    private int [][] matrix = new int[3][3]; 
    /** Constructor 1
     * Constructor for objects of class Square3x3
     */
    public Square3x3()
    {
        matrix = new int[][]{{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
    }

    /** Constructor 2
     * Constructor for objects of class Square3x3
     */
    public Square3x3(int [][] array){
        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3 ; j++){
                if(j < array[0].length && i < array.length )
                    matrix[i][j] = array[i][j];
                else
                    matrix[i][j] = -1;
            }
        }
    }

    /** Copy constructor
     * Constructor for objects of class Square3x3
     */
    public Square3x3(Square3x3 other)
    {
        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3 ; j++){
                matrix[i][j] = other.matrix[i][j];
            }
        }
    }

    /** getCell
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    public int getCell(int row, int col)
    {
        return matrix[row][col];
    }

    /** setXY
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    public void setXY(int row, int col, int value)
    {
        matrix[row][col] = value;
    }

    /** toString
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    public String toString()
    {
        String printString = "";
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                printString = printString + matrix[i][j] + "\t";
                if(j == 2)
                    printString = printString + "\n";
            }
        }
        return printString;
    }

    /** allThere
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    public boolean allThere()
    {
        for(int i =0 ; i < matrix.length; i++){
            for(int j =0 ; j < matrix[0].length; j++){
                if(matrix[i][j] < 1 || matrix[i][j] > 9){
                    return false;
                }
            } 
        }
        return true;
    }

    /** whosThereRow
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    public void whosThereRow(int row, boolean[] values)
    {
        for(int i = 0 ; i < matrix.length; i++){
            if(matrix[row][i] > 0 && matrix[row][i] < 10)
                values[matrix[row][i]] = true;
        }
    }

    /** whosThereCol
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    public void whosThereCol(int col, boolean[] values)
    {
        for(int i = 0 ; i < matrix.length; i++){
            if(matrix[i][col] > 0 && matrix[i][col] < 10)
                values[matrix[i][col]] = true;
        }
    }
}