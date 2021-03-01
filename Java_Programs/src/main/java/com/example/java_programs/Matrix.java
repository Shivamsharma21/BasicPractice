package com.example.java_programs;

        /// program of addition of two matrix ///

public class Matrix {
    public static void main(String[] args) {

        //////////////              //////////////////

        MatrixChecker matrixChecker = new MatrixChecker();

        matrixChecker.Checker();


       ///////////                  /////////////////

        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};

        int arr2[][] = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        int arr3[][] = new int[3][3];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                arr3[i][j] = arr[i][j] + arr2[i][j];

            }

        }

        /// loop for printing resultant Matrix
        for (int k = 0; k < arr3.length; k++) {

            System.out.println("");

            for (int t = 0; t < arr3.length; t++) {

                System.out.print(arr3[k][t]);
            }
        }
    }
}

/// this class is Used to identify that two matrix are equal or not

class MatrixChecker{

    public void Checker(){

        boolean status = true;

        int rowofJ,rowofZ,colofJ,colofZ;

        int J[][] = {
                {4, 4, 4},
                {4, 4, 4},
                {4, 4, 4}
        };

        int Z[][] = {
                {4, 4, 4},
                {4, 4, 4},
                {4, 4, 4}
        };


            rowofJ  =  J.length;     // this will give the number of rows in J

            colofJ = J[0].length;   // this will give the number of columns in J


            rowofZ = Z.length;   //this will give the number of rows in Z

            colofZ = Z[0].length;   // this will give the columns in Z

        if (rowofJ != rowofJ && colofJ != colofZ){
                System.out.println("Matrix are Not Equal");
        }


         for (int i =0; i<rowofJ; i++){

             for (int k =0; k <rowofZ; k++){

                 if (J[i][k] != Z[i][k]){

                     status = false;
                     break;

                 }
             }
         }

        if (status){
            System.out.println("Matrix are Equal");
        }

    }

}