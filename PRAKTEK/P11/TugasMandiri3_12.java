package P11;

import java.util.Scanner;

class TugasMandiri3_12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        int n = 5;
        String[][] Sport = new String[4][n];
        String[] name = { "badminton", "tenis meja", "basket", "bola voly" };
        for (int i = 0; i < Sport.length; i++) {
            System.out.printf("sport name: %s\n", name[i]);
            for (int j = 0; j < Sport[0].length; j++) {
                switch (j) {
                    case (0):
                        System.out.print("enter player: ");
                        Sport[i][j] = input12.nextLine();
                        break;
                    case (1):
                        System.out.print("enter player: ");
                        Sport[i][j] = input12.nextLine();
                        break;
                    case (2):
                        System.out.print("enter player: ");
                        Sport[i][j] = input12.nextLine();
                        break;
                    case (3):
                        System.out.print("enter player: ");
                        Sport[i][j] = input12.nextLine();
                        break;
                    case (4):
                        System.out.print("enter player: ");
                        Sport[i][j] = input12.nextLine();
                        break;
                }

            }

        }
        System.out.println("===========================================");
        System.out.println("unsorted player data: \n");
        for (int i = 0; i < Sport.length; i++) {
            for (int j = 0; j < Sport[0].length; j++) {
                System.out.print(Sport[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=============================================");
        System.out.println("sorted player data: \n");
        for (int i = 0; i < Sport.length; i++) {
            System.out.printf("player: %s\n", name[i]);
            for (int j = 0; j < Sport[0].length; j++) {
                System.out.println("player- " + (j + 1) + ":  " + Sport[i][j] + " ");
            }
            System.out.println();
        }

        input12.close();
    }
}
