import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.printf("Enter size");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.printf("enter element["+i+"]["+j+"]: ");
                array[i][j] = scanner.nextInt();
                if(i==j){
                    sum+=array[i][j];
                }
            }
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.printf(array[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.printf("Result: %d", sum);
    }
}
