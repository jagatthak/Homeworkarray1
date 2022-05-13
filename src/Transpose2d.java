public class Transpose2d {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        //print original 2d matrix with for loop
        System.out.println("Original Matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //print Transposed 2d matrix with interchanging row and column elements
        System.out.println("Transposed Matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
