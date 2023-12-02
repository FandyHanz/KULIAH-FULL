package P13;

import java.util.Scanner;

public class Nilai12 {
     static int i, j;

    static int[][] Inputdata (String[] dataMahasiswa, int row, int column){
        Scanner sc12 = new Scanner (System.in);
        int [][] dataArray1 = new int [row][column];
        int Array = 0;
        for (i = 0; i < dataArray1.length; i++){
            System.out.printf("data daripada-%s \n",dataMahasiswa[i]);
            for(j = 0; j < dataArray1[0].length; j++){
                System.out.printf("data dari minggu ke = %d: ", j);
                dataArray1[i][j] = sc12.nextInt();
            }
        }
        return dataArray1;
    }

    static void TampilArray (int[][] nilai){
          for (int[] i : nilai){
            for (int temps : i){
                System.out.print(temps + " ");
            }
            System.out.println();
        }
    }

    static void BigestWeek(int[][] data){
        int max = 0;
        int week = 0;
        for (int row = 0; row < data.length; row++){
            for (int column = 0; column < data[0].length; column++){
                if (data[row][column] > max){
                    max = data[row][column];
                    week = column + 1;
                }
            }
        }
        System.out.println("data tertinggi ada di minggu ke "+ week);
    }

    static void Bigestperson (int[][] data, String[] mahasiswa){
        int max = 0;
        int student = 0;
        for (int row = 0; row < data.length; row++){
            for (int column = 0; column < data[0].length; column++ ){
                if(data[row][column] > max){
                    max = data[row][column];
                    student = row;
                }
            }
        }
        System.out.println("nilai tertinggi adalah " + max + " oleh murid bernama " + mahasiswa[student] );
    }
    public static void main(String[] args) {
        Scanner sc12 = new Scanner (System.in);
        int row, column;
        System.out.print("masukan jumlah siswa: ");
        row = sc12.nextInt();
        System.out.print("Masukan jum;lah tugas: ");
        column = sc12.nextInt();
        int [][] dataArray = new int [row][column];
        String [] dataMahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        
        dataArray = Inputdata(dataMahasiswa, row, column);
        System.out.println("=================================");
        TampilArray(dataArray);
        System.out.println("=================================");
        BigestWeek(dataArray);
        Bigestperson(dataArray, dataMahasiswa);
    }
}
