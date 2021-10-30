
/**
 * Write a description of class Sudoku here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sudoku
{
    public static void main(String[]args){
        int [][] arr1 = new int[][]{{4,3,5},
                                    {6,8,2},
                                    {1,9,7}};
        int [][] arr2 = new int[][]{{2,6,9},
                                    {5,7,1},
                                    {8,3,4}};
        int [][] arr3 = new int[][]{{7,8,1},
                                    {4,9,3},
                                    {5,6,2}};
        int [][] arr4 = new int[][]{{8,2,6},
                                    {3,7,4},
                                    {9,5,1}};
        int [][] arr5 = new int[][]{{1,9,5},
                                    {6,8,2},
                                    {7,4,3}};
        int [][] arr6 = new int[][]{{3,4,7},
                                    {9,1,5},
                                    {6,2,8}};
        int [][] arr7 = new int[][]{{5,1,9},
                                    {2,4,8},
                                    {7,6,3}};
        int [][] arr8 = new int[][]{{3,2,6},
                                    {9,5,7},
                                    {4,1,8}};
        int [][] arr9 = new int[][]{{8,7,4},
                                    {1,3,6},
                                    {2,5,9}};
        ////////////////
        Square3x3 s1 = new Square3x3(arr1);
        Square3x3 s2 = new Square3x3(arr2);
        Square3x3 s3 = new Square3x3(arr3);
        Square3x3 s4 = new Square3x3(arr4);
        Square3x3 s5 = new Square3x3(arr5);
        Square3x3 s6 = new Square3x3(arr6);
        Square3x3 s7 = new Square3x3(arr7);
        Square3x3 s8 = new Square3x3(arr8);
        Square3x3 s9 = new Square3x3(arr9);
        ////////////////
        Square3x3 [][] arr_sud1 = new Square3x3[][]{{s1,s2,s3},{s4,s5,s6},{s7,s8,s9}};
        Sudoku sudoku1 = new Sudoku(arr_sud1);
        ////////////////

        ////////////////
        //System.out.println(sudoku1.legitLine(2));
        //System.out.println(sudoku1.legitColumn(7));
        System.out.println(sudoku1.isValid());
    }
    // instance variable
    private Square3x3 [][] sud_mat = new Square3x3 [3][3];

    /**
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

    /**
     * Constructor for objects of class Sudoku
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean legitLine(int line)
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean legitColumn(int line)
    {
        boolean [] trueComponents = new boolean [10];
        boolean trueCol = true;
        int col_sud = line / 3;
        int col_3x3 = line % 3;

        for(int i = 0; i < sud_mat.length; i++){
            sud_mat[i][col_sud].whosThereCol(col_3x3,trueComponents);
        }
        for(int i = 1; i < 10; i++){
            trueCol = trueCol && trueComponents[i];
        }
        return trueCol;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
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
