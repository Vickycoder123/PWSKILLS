public class PatternQ5 {
    // WAP to print your full name using pattern programming logic
    public static void main(String[] args) {
        int n=7;
        //SHUBHAM
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ;j++){
                if (i==0 || i==(n-1)/2 || i==n-1 || j==0&&i<(n-1)/2 || j==n-1&&i>(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0 ; j<n ;j++){
                if (j==0 || i==(n-1)/2 || j==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0 ; j<n ;j++){
                if (j==0&&i<n-1 || i==(n-1)&&j>0&&j<n-1 || j==n-1&&i<n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0 ; j<n ;j++){
                if (j==0 || i==0&&j<n-1 ||i==(n-1)/2&&j<n-1 || i==n-1&&j<n-1 || j==n-1&&i>0&&i!=(n-1)/2&&i<n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0 ; j<n ;j++){
                if (j==0 || i==(n-1)/2 || j==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0 ; j<n ;j++){
                if (j==0&&i>0 || i==(n-1)/2 || j==n-1&&i>0 || i==0&&j!=0&&j!=n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0 ; j<n ;j++){
                if (j==0 || j==n-1 || i==j&&i<=(n-1)/2 || i+j==n-1&&i<(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            System.out.println();
        }
        System.out.println();
        //VILAS
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if (i==j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("");
            for(int j=0 ; j<n ;j++){
                if (i+j==n-1&& i<n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0 ; j<n ;j++){
                if (i==0 || i==n-1 || j==(n-1)/2 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0 ; j<n ;j++){
                if (j==0 || i==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0 ; j<n ;j++){
                if (j==0&&i>0 || j==n-1&&i>0 || i==0&&j>0&&j<n-1 || i==(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0 ; j<n ;j++){
                if (i==0 || i==n-1 || j==0&&i<(n-1)/2 || j==n-1&&i>(n-1)/2 ||i==(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            System.out.println();
        }
        System.out.println();
        //MANE
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if (j==0 || j==n-1 || i==j&&i<=(n-1)/2 || i+j==n-1&&i<(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=0 ; j<n ; j++){
                if (j==0&&i>0 || j==n-1&&i>0 || i==0&&j>0&&j<n-1 || i==(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=0 ; j<n ; j++){
                if (j==0 || j==n-1 || i==j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=0 ; j<n ; j++){
                if (j==0 || i==0 || i==(n-1)/2 || i==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
