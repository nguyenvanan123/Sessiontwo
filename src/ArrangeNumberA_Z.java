import java.util.Scanner;

public class ArrangeNumberA_Z {


    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter the number of element to array" );
        int n = scanner.nextInt ( );

        int[] arrays = new int[ n ];

        for (int i = 0; i < arrays.length; i++) {
            System.out.println ( "Enter the " + (i + 1) + ":" );
            arrays[ i ] = scanner.nextInt ( );
        }

        // Call getMax and store the result in a variable
        int maxElement = getMax ( arrays );

        System.out.println ( "The maximum element in the array is: " + maxElement );
    }

    private static int getMax ( int[] arrays ) {
        int max = arrays[ 0 ];
        for (int i = 0; i < arrays.length; i++) {
            if ( max < arrays[ i ] ) {
                max = arrays[ i ];
            }
        }
        return max;
    }

}
