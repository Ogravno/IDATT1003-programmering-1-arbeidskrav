package oppgave3;

public class Matrix {
    private final int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return this.matrix;
    }

    public Matrix add(int[][] matrixToAdd) {
        if (!(this.matrix.length == matrixToAdd.length && this.matrix[0].length == matrixToAdd[0].length)) {
            return null;
        }
        int[][] newMatrix = new int[this.matrix.length][this.matrix[0].length];

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                newMatrix[i][j] = this.matrix[i][j] + matrixToAdd[i][j];
            }
        }

        return new Matrix(newMatrix);
    }

    public Matrix multiply(int[][] matrixToMultyply) {
        if (!(this.matrix[0].length == matrixToMultyply.length)) {
            return null;
        }
        int[][] newMatrix = new int[this.matrix.length][matrixToMultyply[0].length];

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                int value = 0;
                for (int k = 0; k < this.matrix[0].length; k++) {
                    value += this.matrix[i][k] * matrixToMultyply[k][j];
                }

                newMatrix[i][j] = value;
            }
        }

        return new Matrix(newMatrix);
    }

    public Matrix transpose() {
        int[][] newMatrix = new int[this.matrix[0].length][this.matrix.length];

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                newMatrix[i][j] = this.matrix[j][i];
            }
        }

        return new Matrix(newMatrix);
    }
}

