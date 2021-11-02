
/**
 * Maman 13 , third question & fourth question.
 * "Sudoku"
 * Name: @David Nalivkin
 * TZ:332403468
 * That class describe square 3x3 of squares 3x3 that have int variables inside, looks like sudoku field.
 */
public class Sudoku
{
    // instance variable
    private Square3x3 [][] sud_mat = new Square3x3 [3][3];

    /** Constructor 1
     * Constructor for objects of class Sudoku
     */
    public Sudoku()
    {
        for(int i = 0; i < sud_mat.length; i++){
            for(int j = 0; j < sud_mat[0].length ; j++){
                sud_mat[i][j] = new Square3x3();
            }
        }
    }

    /** Constructor 2
     * Constructor for objects of class Sudoku that copy other object of this class.
     * @param square3x3Array - array of objects of class Square3x3
     */
    public Sudoku(Square3x3 [][] square3x3Array)
    {
        for(int i = 0; i < sud_mat.length ; i++){
            for(int j = 0; j < sud_mat[0].length ; j++){
                sud_mat[i][j] = new Square3x3(square3x3Array[i][j]);
            }
        }
    }

    /**legitLine
     * Private class that i use to checks if all 1-9 exist in line of object.
     *
     * @param  line - line that checks
     * @return trueLine - value of legit
     */
    private boolean legitLine(int line)
    {
        boolean [] trueComponents = new boolean [10];
        boolean trueLine = true;
        int line_sud = line / 3;
        int line_3x3 = line % 3;

        for(int i = 0; i < sud_mat.length; i++){
            sud_mat[line_sud][i].whosThereRow(line_3x3,trueComponents);
        }
        for(int i = 1; i < 10; i++){
            trueLine = trueLine && trueComponents[i];
        }
        return trueLine;
    }

    /** legitColumn
     * Private class that i use to checks if all 1-9 exist in column of object.
     *
     * @param col - column of object htat we checks
     * @return trueCol - value of legit
     */
    private boolean legitColumn(int col)
    {
        boolean [] trueComponents = new boolean [10];
        boolean trueCol = true;
        int col_sud = col / 3;
        int col_3x3 = col % 3;

        for(int i = 0; i < sud_mat.length; i++){
            sud_mat[i][col_sud].whosThereCol(col_3x3,trueComponents);
        }
        for(int i = 1; i < 10; i++){
            trueCol = trueCol && trueComponents[i];
        }
        return trueCol;
    }
    
    /** isValid
     * This method check if object is valid like sudoku field, rows and columns and squares are have different int values.
     *
     * @return value of legit of object
     */
    public boolean isValid()
    {
        boolean allInSquare3x3 = true,allLinesCols = true;
        for(int i = 0; i < sud_mat.length ; i++){
            for(int j = 0; j < sud_mat[0].length ; j++){
                allInSquare3x3 = allInSquare3x3 && sud_mat[i][j].allThere();
                if(allInSquare3x3 == false)
                    return false;
            }
        }
        for(int k = 0 ; k < 9; k++){
            allLinesCols = allLinesCols && legitColumn(k) && legitLine(k);
            if(allLinesCols == false)
                return false;
        }
        return allInSquare3x3 && allLinesCols;
    }

}
