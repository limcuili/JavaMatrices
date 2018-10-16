// this is a template for creating the class Matrix, as specified in
// exercise 2
//
// java Matrix n m max 
// generates the random n times m matrix a and the random m times m matrix b,
// both with integer values in [0,max] and calculates a*b and b^T

class Matrix {

    static int[][] randomMatrix (int n, int m, int max) {
        // see exercise 2.1
        return null;
    }

    static int[][] product ( int[][] a, int[][] b) {
        // see exercise 2.2
        return null;
    }

    static void transpose (int[][] matrix) {
        // see exercise 2.3
    }

    static void printMatrix ( String name, int[][] matrix) {
        // see exercise 2.4
        System.out.println( name + " = " );
        if (matrix == null) {
            System.out.println( "null" );
            return;
        }
        // print the matrix
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                String entry = Integer.toString( matrix[i][j] );
                System.out.print(entry + " ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        if (args.length<3) {
            return;
        }
        int n = Integer.parseInt( args[0] );
        int m = Integer.parseInt( args[1] );
        int max = Integer.parseInt( args[2] );
        int[][] a = randomMatrix(n,m,max);
        int[][] b = randomMatrix(m,m,max);
        printMatrix( "a", a );
        System.out.println();
        printMatrix( "b", b );        
        System.out.println();
        printMatrix( "a*b", product(a,b) );                
        System.out.println();
        transpose(b);
        printMatrix( "b^T", b );                
    }

}


// example: java Matrix 3 6 20
// a = 
// 1 6 4 11 1 15 
// 16 1 14 8 11 17 
// 19 12 8 20 19 2 
//
// b = 
// 12 6 8 18 5 14 
// 9 4 10 3 20 12 
// 12 5 13 13 11 1 
// 10 12 1 11 15 1 
// 7 7 2 20 14 17 
// 15 3 2 12 7 14 
//
// a*b = 
// 456 234 163 409 453 328 
// 781 394 384 985 647 683 
// 795 581 438 1106 1003 789 
//
// b^T = 
// 12 9 12 10 7 15 
// 6 4 5 12 7 3 
// 8 10 13 1 2 2 
// 18 3 13 11 20 12 
// 5 20 11 15 14 7 
// 14 12 1 1 17 14 
