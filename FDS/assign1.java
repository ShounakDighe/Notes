import java.util.*;

class assign1 {

    //Input fuction
    public static void inputArr(int row,int col,int matrix[][]){
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<row;i++){
            for (int j = 0; j < col; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
    }

    //Output fuction
    public static void displayinp(int row ,int col,int matrix[][]){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void addmatrix(int row,int col,int matrix1[][],int matrix2[][],int total [][]){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               total[i][j]= matrix1[i][j]+matrix2[i][j];
            }
        }
    }
    
    public static void subMatrix(int row,int col,int matrix1[][],int matrix2[][],int total[][]){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                total[i][j]= matrix1[i][j]-matrix2[i][j];
            }
        }
    }

    public static void mulmatrix(int matrix1[][],int matrix2[][],int row,int col1,int col2 ,int total[][]){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col2; j++) {
                total[i][j]=0;
                for (int j2 = 0; j2 < col1; j2++) {
                    total[i][j]+=matrix1[i][j2]*matrix2[j2][i];
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Matrix Input 1
            System.out.print("Enter the row 1 : ");
            int row1= sc.nextInt();

            System.out.print("Enter the col 1 : ");
            int col1 = sc.nextInt();

        //Matrix Input 2
            System.out.print("Enter the row 2 : ");
            int row2=sc.nextInt();

            System.out.print("Enter the col 2 : ");
            int  col2=sc.nextInt();

        //Declaration of Matrix 1 and 2
            int [][]matrix1= new int[row1][col1];
            int [][]matrix2=new int[row2][col2];
            int [][]total = new int[row1][col1];


        //Switch case
        int choice;
        do {
            System.out.print("1]Insert data in matrix \n    2]Display the matrix\n    3]Add\n    4]Sub\n    5]Mul\n    6]Exit\n    Enter the choice  :");
            choice = sc.nextInt();
            switch (choice) {
                
                case 1:

                //Input matrix 1 :
                    System.out.println("Enter the matrix 1 : ");
                    inputArr(row1,col1,matrix1);

                //Input matrix 2 :
                    System.out.println("Enter the matrix 2 : ");
                    inputArr(row2,col2,matrix2);
                    break;
                
                case 2:
                
                //Display matrix 1 :
                    System.out.println("Matrix 1 :");
                    displayinp(row1,col1,matrix1);
                //Display matrix 2 :
                    System.out.println("Matrix 2 :");
                    displayinp(row2,col2,matrix2);
                    break;

                case 3:

                //Add matrix

                    System.out.println("The addition of matrix is : ");
                    addmatrix(row1,col2,matrix1,matrix2,total);
                    displayinp(row2, col2, total);
                    break;

                case 4:

                //Sub matrix

                    System.out.println("The Subtraction of matrix is : ");
                    subMatrix(row1,col2,matrix1,matrix2,total);
                    displayinp(row2, col2, total);
                    break;

                case 5:
                
                //Multiplication 
                if(col1==row1){
                    System.out.println("The Mul of matrix is : ");
                    mulmatrix(matrix1,matrix2,row1,col1,col2,total);
                    displayinp(row2, col2, total);
                }else{
                    System.out.println("Incomplete matrix");
                }
                    break;
                
            }
        } while (choice!=6);

    }
}