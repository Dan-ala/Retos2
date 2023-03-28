import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {

        int sizeOfRows,sizeOfColums;

        System.out.print("Ingrese por favor de qué tamaño desea el Sudoku, ingrese la cantidad de filas:");
        Scanner rowsAndColumns=new Scanner(System.in);
        sizeOfRows=rowsAndColumns.nextInt();

        System.out.print("Ingrese la cantidad de columnas:");
        sizeOfColums=rowsAndColumns.nextInt();

        int[][] sudoku=new int[sizeOfRows][sizeOfColums];

        for(int i=0; i<sizeOfRows; i++){
            for(int j=0; j<sizeOfColums; j++){
                System.out.println("Ingrese el valor para las filas: "+i+" Ingrese el valor para las columnas: "+j);
                sudoku[i][j]=rowsAndColumns .nextInt();
            }
            System.out.println();
        }

        for(int i=0; i<sudoku.length; i++){  
            for(int j=0; j<sudoku[i].length; j++){
                System.out.print(sudoku[i][j] +"\t");
                
            }
            System.out.println();
        }

        //La suma de todos sus lados, debe ser la misma:

        for(int i=0;i<sizeOfRows;i++) {
            int sum=0;
            for(int j=0;j<sizeOfRows;j++) {
                sum+=sudoku[i][j];
            }
            System.out.println("La suma de la fila " + (i+1) + ": " + sum);
        }

        System.out.println();

        for(int j=0;j<sizeOfColums;j++){
            int sumColumss=0;
            for(int k=0;k<sizeOfColums;k++){
                sumColumss+=sudoku[j][k];
            }
            System.out.println("La suma de la columna " + (j+1) + ": " + sumColumss);
        }
        rowsAndColumns.close();
    }
}