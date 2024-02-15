package lesson8.GenericMatrix;

public class Matrix<T> {
    private T[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = (T[][]) new Object[rows][cols];
    }

    public void setElement(int row, int col, T value) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IllegalArgumentException("Invalid matrix indices");
        }
        data[row][col] = value;
    }

    public T getElement(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IllegalArgumentException("Invalid matrix indices");
        }
        return data[row][col];
    }

    public Matrix<T> transpose() {
        Matrix<T> result = new Matrix<>(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setElement(j, i, data[i][j]);
            }
        }
        return result;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition");
        }

        Matrix<T> result = new Matrix<>(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Assuming T supports addition
                result.setElement(i, j, (T) add(data[i][j], other.getElement(i, j)));
            }
        }
        return result;
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (cols != other.rows) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication");
        }

        Matrix<T> result = new Matrix<>(rows, other.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                T sum = null;
                for (int k = 0; k < cols; k++) {
                    // Assuming T supports multiplication and addition
                    sum = add(sum, multiply(data[i][k], other.getElement(k, j)));
                }
                result.setElement(i, j, sum);
            }
        }
        return result;
    }

    // Helper methods for generic arithmetic operations
    private T add(T a, T b) {
        // Assuming T supports addition
        return a;
    }

    private T multiply(T a, T b) {
        // Assuming T supports multiplication
        return a;
    }

    public static void main(String[] args) {
        // Test Matrix with Integer
        Matrix<Integer> matrixA = new Matrix<>(2, 3);
        matrixA.setElement(0, 0, 1);
        matrixA.setElement(0, 1, 2);
        matrixA.setElement(0, 2, 3);
        matrixA.setElement(1, 0, 4);
        matrixA.setElement(1, 1, 5);
        matrixA.setElement(1, 2, 6);

        Matrix<Integer> matrixB = new Matrix<>(3, 2);
        matrixB.setElement(0, 0, 7);
        matrixB.setElement(0, 1, 8);
        matrixB.setElement(1, 0, 9);
        matrixB.setElement(1, 1, 10);
        matrixB.setElement(2, 0, 11);
        matrixB.setElement(2, 1, 12);

        Matrix<Integer> resultAddition = matrixA.add(matrixB.transpose());
        System.out.println("Matrix Addition Result:");
        printMatrix(resultAddition);

        Matrix<Integer> resultMultiplication = matrixA.multiply(matrixB);
        System.out.println("Matrix Multiplication Result:");
        printMatrix(resultMultiplication);
    }

    // Helper method to print a matrix
    private static <T> void printMatrix(Matrix<T> matrix) {
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                System.out.print(matrix.getElement(i, j) + " ");
            }
            System.out.println();
        }
    }
}

