
/**
 * Write a description of class Square3x3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square3x3
{
    // instance variables
    private int [][] mat = new int[3][3];
    public static void main(String[]args){
        Square3x3 s1 = new Square3x3();
        System.out.println(s1);
        ///////////////////////////
        int [][] arr2 = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
        int [][] arr3 = new int [][] {{1,2},{4,5}};
        int [][] arr4 = new int [][] {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
        Square3x3 s2 = new Square3x3(arr2);
        Square3x3 s3 = new Square3x3(arr3);
        Square3x3 s4 = new Square3x3(arr4);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        ///////////////////////////
        int [][] arr5 = new int [][]{{5,4,6},{2,1,3},{7,8,9}};
        Square3x3 s5 = new Square3x3(arr5);
        System.out.println(s5.allThere());
        ///////////////////////////
        int [][] arr6 = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
    }
    /** Constructor 1
     * Constructor for objects of class Square3x3
     */
    public Square3x3()
    {
        mat = new int[][]{{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
    }

    /** Constructor 2
     * Constructor for objects of class Square3x3
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
     * Constructor for objects of class Square3x3
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
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    public int getCell(int row, int col)
    {
        if(row > -1 && col > -1 && row < 3 && col < 3)
            return mat[row][col];
        return -1;
    }

    /** setXY
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    public void setXY(int row, int col, int value)
    {
        if(row > -1 && col > -1 && row < 3 && col < 3)
            mat[row][col] = value;
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
                printString = printString + mat[i][j] + "\t";
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
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    public void whosThereRow(int row, boolean[] values)
    {
        for(int i = 0 ; i < mat.length; i++){
            values[mat[row][i]] = true;
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
        for(int i = 0 ; i < mat.length; i++){
            values[mat[i][col]] = true;
        }
    }
}