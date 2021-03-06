
// PROBLEM NO.1-------------------------------------------------------------------------------------

public class patternsProblem {
    public static void main(String[] args) {
        Problem01(5);
    }

    static void Problem01(int n){
        for (int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// PROBLEM NO.2----------------------------------------------------------------------------------------

public class patternsProblem {
    public static void main(String[] args) {
        Problem02(5); // taking size of pattern---------
    }

    static void Problem02(int n){
    // row printing starts from here--------------
        for (int row=1;row<=n;row++){
        // column prints starts from here------------
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            // printing in new line----------
            System.out.println();
        }
    }
 }
 
//  PROBLEM.03----------------------------------------------------------------------------------------
 
 public class patternsProblem {
    public static void main(String[] args) {
        Problem03(5); // taking size of pattern---------
    }
 static void Problem03(int n) {
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
 
//  PROBLEM NO.4--------------------------------------------------------------------------------------
 
 public class patternsProblem {
    public static void main(String[] args) {
        Problem04(5);
    }
 static void Problem04(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
 }
 
// PROBLEM-05-----------------------------------------------------------------------------------

public class patternsProblem {
    public static void main(String[] args) {
        Problem05(5);
    }
static void Problem05(int n){
        for(int row=1;row<=2*n;row++){
            if(row <= n) {
                for(int col=1;col<=row;col++){
                    System.out.print("* ");
                }
            }else {
                for (int col = 1; col <= 2*n-row; col++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

/* PROBLEM NO.6--------------------------------------------------------------------------------- */

public class patternsProblem {
    public static void main(String[] args) {
        Problem06(5);
    }
static void Problem06(int n){
        for(int row=1;row<=n;row++){
            for(int col=n;col>=1;col--){
                if(col>row){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

/* PROBLEM NO.7-------------------------------------------------------------------------------- */

public class patternsProblem {
    public static void main(String[] args) {
        Problem07(5);
    }
    static void Problem07(int n) {
        for (int row=0;row<=n;row++){
            for(int space=0;space<=row;space++){
                System.out.print(" ");
            }
            for(int col=n; col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
     
// PROBLEM NO.8-------------------------------------------------------------------------------
 
 public class patternsProblem {
    public static void main(String[] args) {
        Problem08(5);
    }
 
 static void Problem08(int row) {
        int k = 0;
        for (int i = 1; i <= row; ++i, k = 0) {
            for (int space = 1; space <= row - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}

// PROBLEM NO.9--------------------------------------------------------------------------------
     
 public class patternsProblem {
    public static void main(String[] args) {
        Problem09(5);
    }
static void Problem09(int n) {
        int k = 0;
        for (int i = n; i >= 1; --i, k = 0) {
            for (int space = n-i; space >= 1; --space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}
     
// PROBLEM NO.10---------------------------------------------------------------------------------

public class patternsProblem {
    public static void main(String[] args) {
        Problem10(5);
    }
     
static void Problem10(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= 1; col--) {
                if (col > row) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
