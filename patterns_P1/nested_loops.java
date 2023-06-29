public class nested_loops {
    public static void main(String[] args) {
        /* ------- NESTED LOOPS ------- */

        /* to print this pattern */
        // *
        // * *
        // * * *
        // * * * *
        // for (int i = 1; i <= 4; i++){
        //     for (int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        /* to print inverted star pattern */
        // * * * *
        // * * *
        // * *
        // *
        // for (int i = 4; i > 0; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // alternate method
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= (4-i+1); j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        /* TO PRINT HALF PYRAMID PATTERN */
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        /* TO PRINT CHARACTER PATTERN */
        // A
        // B C 
        // D E F
        // G H I J
        char ch = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}