package P11;

import java.util.Scanner;
public class ArrayDua12 {
    public static void main(String[] args) {
        Scanner scan12 = new Scanner(System.in);
        int [][] data = new int [4][4];
        int [] jam = {3, 6, 9, 12};
        int [] max = {0, 0, 0, 0};
        double [] total = {0, 0, 0, 0};
        double [] rata = {0, 0, 0, 0};

        for (int i = 0; i < data.length; i++){
            System.out.printf("jam %s \n",jam[i]);
            for (int j = 0; j < data[0].length; j++){
                switch (j)  {
                    case (0):
                        System.out.print("masukan suhu: ");
                        data[i][j] = scan12.nextInt();
                        if (max[j] > data [i][j]){      
                            }else if (max[j] < data [i][j]){
                            max[j] = data [i][j];
                            }
                            total[j] += data [i][j];
                        break;
                    case (1):
                        System.out.print("masukan Kelembaban: ");
                        data [i][j] = scan12.nextInt();
                        if (max[j] > data [i][j]){      
                            }else if (max[j] < data [i][j]){
                            max[j] = data [i][j];
                            }
                            total[j] += data [i][j];
                        break;
                    case (2):
                        System.out.print("masukan kecepatan: ");
                        data [i][j] = scan12.nextInt();
                       if (max[j] > data [i][j]){      
                            }else if (max[j] < data [i][j]){
                            max[j] = data [i][j];
                            }
                            total[j] += data [i][j];
                        break;
                    case (3):
                        System.out.print("Masukan Index UV: ");
                        data [i][j] = scan12.nextInt();
                       if (max[j] > data [i][j]){      
                            }else if (max[j] < data [i][j]){
                            max[j] = data [i][j];
                            }
                            total[j] += data [i][j];
                        break;
                }
                rata[j] = total[j]/data[0].length;
            }
        }
            for (int i = 0; i < data.length; i++){
                for (int j = 0; j < data[0].length; j++){
                    System.out.print(data[i][j]+" ");
                }
                System.out.println();
            }
        System.out.println("---------------");
            int column = 2;
            for (int [] row : data){
                System.out.println(row[column]+" ");
            }
            System.out.println("--------------");
            System.out.printf("presentasi uv: %s\n", max[3]);
    }
}
