package march4codes;

public class tenten {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        //printRowSums();
        //Tenten();
        printColomnSums(tenten());
    }

    public static void Tenten(int [][]arr) {
        int[][] tenByten = new int[10][10];

        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                tenByten[i][j] = index;
                index++;
            }
        }
        for (int[] numberarr : arr) {
            for (int number : numberarr) {
                System.out.format("%5d", number);

            }
            System.out.println();
        }
    }

    public static void printRowSums(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("sum of row" + i + ":" + sum);
        }
    }

    public static void printColomnSums(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[j][i];

            }
            System.out.println(sum);
        }

        for (int[] numbers : arr) {
            for (int number : numbers) {
                System.out.format("%5d", number);

            }
            System.out.println();
        }
    }
}
