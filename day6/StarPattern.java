public class StarPattern {
    public static void main(String[] args) {

        int rows = 10;   

        for (int i = 1; i <= rows; i++) {

   
            for (int s = rows; s > i; s--) {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}
