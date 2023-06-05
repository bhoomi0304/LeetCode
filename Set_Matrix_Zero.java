class Solution {
    public static void removeRow(int i,int c,int[][] matrix){
        for(int j=0;j<c;j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-11;
            }
        }
    }
    public static void removeCol(int i,int r,int[][] matrix){
        for(int j=0;j<r;j++){
            if(matrix[j][i]!=0){
                matrix[j][i]=-11;
            }
        }
    }
    public static void setZeroes(int[][] matrix) {
        int  r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    removeRow(i,c,matrix);
                    removeCol(j,r,matrix);
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==-11){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}
