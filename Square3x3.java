
/**
 * Maman 13 , first question & second question.
 * "Square3x3"
 * Name: @David Nalivkin
 * TZ:332403468
 * That class describe square 3x3 of int variables.
 */
public class Square3x3
{
    // instance variables
    private int [][] mat = new int[3][3];
    /** Constructor 1
     * Constructor for objects of class Square3x3
     */
    public Square3x3()
    {
        mat = new int[][]{{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
    }

    /** Constructor 2
     * Constructor for objects of class Square3x3
     * @param array - build square3x3 from array variables
     */
    public Square3x3(int [][] array){
        for(int i = 0; i < mat.length ; i++){
            for(int j = 0; j < mat[0].length ; j++){
                if(j < array[0].length && i < array.length )
                    mat[i][j] = array[i][j];
                else
                    mat[i][j] = -1;
            }
        }
    }

    /** Copy constructor
     * Constructor for objects of class Square3x3 that copy other object of this class.
     * @param other - other square 3x3
     */
    public Square3x3(Square3x3 other)
    {
        for(int i = 0; i < mat.length ; i++){
            for(int j = 0; j < mat[0].length ; j++){
                mat[i][j] = other.mat[i][j];
            }
        }
    }

    /** getCell
     * This method return one of cells that recieve at row and col.
     *
     * @param row - row of matrix
     * @param col - column of matrix
     * @return value of cell of matrix or -1 if its not exist
     */
    public int getCell(int row, int col)
    {
        if(row > -1 && col > -1 && row < 3 && col < 3)
            return mat[row][col];
        return -1;
    }

    /** setXY
     * This method set value of cell that recieve at row and col.
     *
     * @param row - number of row of matrix
     * @param col - number of column of matrix
     */
    public void setXY(int row, int col, int value)
    {
        if(row > -1 && col > -1 && row < 3 && col < 3)
            mat[row][col] = value;
    }

    /** toString
     * Method that override that print object of class in format.
     * x x x
     * x x x
     * x x x
     *
     * @return string of print of square3x3 object
     */
    public String toString()
    {
        String printString = "";
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                printString = printString + mat[i][j] + "\t";
                if(j == 2)
                    printString = printString + "\n";
            }
        }
        return printString;
    }

    /** allThere
     * This method checks if all numbers of 1-9 are exist in.
     *
     * @return  true value if that exist
     */
    public boolean allThere()
    {
        boolean [] all_true = new boolean [10];
        boolean allTrue = true;
        for(int i =0 ; i < mat.length; i++){
            for(int j =0 ; j < mat[0].length; j++){
                all_true [mat[i][j]] = true; 
            } 
        }
        for(int i = 1; i < 10 ; i++){
            allTrue = allTrue && all_true[i];
        }
        return allTrue;
    }

    /** whosThereRow
     * This method checks who exist to row of square3x3 object.
     *
     * @param row - number of row that method check
     * @param values - array that save who exist in row
     */
    public void whosThereRow(int row, boolean[] values)
    {
        for(int i = 0 ; i < mat.length; i++){
            values[mat[row][i]] = true;
        }
    }

    /** whosThereCol
     * This method checks who exist to column of object.
     *
     * @param col - column that choose to check
     * @param values - array that save who exist in column
     */
    public void whosThereCol(int col, boolean[] values)
    {
        for(int i = 0 ; i < mat.length; i++){
            values[mat[i][col]] = true;
        }
    }
}