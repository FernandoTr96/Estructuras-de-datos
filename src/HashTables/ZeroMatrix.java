package HashTables;

import java.util.List;

// Dada una matriz, escribe un algoritmo para establecer ceros en la fila F y columna C si existe un 0 en la celda F:C

public class ZeroMatrix {

    public void zeroMatrix(int[][] matrix){
        boolean firstRowContainsZero = hasFirstRowAnyZeros(matrix);
        boolean firstColContainsZero = hasFirstColAnyZeros(matrix);
        checkZeros(matrix);
        processRows(matrix);
        processCols(matrix);
        if(firstRowContainsZero){
            setRowToZero(matrix,0);
        }
        if(firstColContainsZero){
            setColToZero(matrix,0);
        }
    }

    private boolean hasFirstRowAnyZeros(int[][] matrix){
        for(int i=0; i < matrix[0].length; i++){
            if(matrix[0][i] == 0){
                return true;
            }
        }
        return false;
    }

    private boolean hasFirstColAnyZeros(int[][] matrix){
        for(int i=0; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                return true;
            }
        }
        return false;
    }

    private void processRows(int[][] matrix){
        for(int r = 0; r < matrix.length; r++){
            if(matrix[r][0] == 0){
                setRowToZero(matrix,r);
            }
        }
    }

    private void setRowToZero(int[][] matrix, int r){
        for (int c = 0; c < matrix.length; c++){
            matrix[r][c] = 0;
        }
    }

    private void processCols(int[][] matrix){
        for(int c = 0; c < matrix[0].length; c++){
            if(matrix[0][c] == 0){
                setColToZero(matrix,c);
            }
        }
    }

    private void setColToZero(int[][] matrix, int c){
        for (int r = 0; r < matrix.length; r++){
            matrix[r][c] = 0;
        }
    }

    private void checkZeros(int[][] matrix){
        for (int r = 1; r < matrix.length; r++){
            for (int c = 1; c < matrix[0].length; c++){
                if(matrix[r][c] == 0){
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }
    }
}
