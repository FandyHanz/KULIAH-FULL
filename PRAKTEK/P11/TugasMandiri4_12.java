package P11;

import java.util.Scanner;

public class TugasMandiri4_12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner (System.in);
        String [][] name = new String [8][5];
        String [] character = {"F", "A", "N", "D", "Y", "W", "A", "H", "Y", "U", "H", "A", "N", "Z", "U", "R", "A"};
        int index = 0;

            for (int i = 0; i < name.length; i++){
                for (int j = 0; j < name[0].length; j++ ){
                    if (index >= character.length){
                        index = 0;
                    }
                    name[i][j] = character[index];
                    index++; 
                    System.out.print(name[i][j] + " | ");
                }
                System.out.println();
            }
    }
}
