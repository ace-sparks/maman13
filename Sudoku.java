
/**
 * Write a description of class Sudoku here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sudoku
{
    public static void main(String[]args){
        int [][] arr1 = new int[][]{{5,9,7},{1,3,3},{7,8,9}};
        int [][] arr2 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int [][] arr3 = new int[][]{{4,8,6},{7,8,9},{7,8,9}};
        ////////////////
        Square3x3 s1 = new Square3x3(arr1);
        Square3x3 s2 = new Square3x3(arr2);
        Square3x3 s3 = new Square3x3(arr3);
        ////////////////
        Square3x3 [][] arr_sud1 = new Square3x3[][]{{s1,s2,s3},{s1,s1,s1},{s1,s1,s1}};
        Sudoku sudoku1 = new Sudoku(arr_sud1);
        ////////////////
        if(sudoku1.lineArr(1))
            System.out.println("Line is 1-9");
    }
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

    /** lineValid
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private boolean lineArr(int line)
    {
        
        int sud_line = line / 3;
        int line_3x3 = line % 3;
        boolean[]rowValue = new boolean[10];
        boolean rowTrue = true;
        for(int i = 0; i < 3; i++){
            sud_mat[sud_line][i].whosThereRow(line_3x3,rowValue);
        }
        for(int j = 1; j < 10; j++){
            rowTrue = rowTrue && rowValue[j];
        }
        return rowTrue;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean isValid()
    {
        boolean squareValue = true;
        for(int i =0; i < 3 ; i++){
            for(int j =0; j < 3 ; j++){
                squareValue = squareValue && sud_mat[i][j].allThere();
            }
        }
        return squareValue;
    }
}
