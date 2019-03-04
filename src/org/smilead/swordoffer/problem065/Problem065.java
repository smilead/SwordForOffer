package org.smilead.swordoffer.problem065;

import java.util.Stack;

/*
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，
 * 每一步可以在矩阵中向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。 
 * 例如 a b c e s f c s a d e e 这样的3 X 4 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子
"ABCESFCSADEE",3,4,"ABCCED"
 "ABCE
  SFCS
  ADEE",3,4,"SEE"
 */
public class Problem065 {
	   public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
		   if(rows* cols != matrix.length) {
			   return false;
		   }
		   char[][] matrixs = new char[rows][cols];
		   int count = 0;
		   for(int i=0;i<rows;i++) {
			   for(int j = 0;j<cols;j++) {
				   matrixs[i][j] = matrix[count];
				   count++;
			   }
		   }
		   
		   boolean[][] path = new boolean[rows][cols];
		   for(int i = 0;i<rows;i++) {
			   for(int j = 0; j< cols;j++) {
				   path[i][j]=true;
			   }
		   }
		   Stack<Coordinate> pathStack = new Stack<>();
		   for(int i = 0;i<rows;i++) {
			   for(int j = 0;j<cols;j++) {
				   if(judge(matrixs, path, pathStack, str, i, j, rows, cols)) {
					   return true;
				   }
			   }
		   }
		   return false;
	    }
	   
	   public boolean judge(char[][] matrix,boolean[][] path,Stack<Coordinate> pathStack,char[] str,int row,int col,int rows,int cols) {
		   int length = str.length;
		   if(length == pathStack.size()) {
			   return true;
		   }
		   if(col>=cols || col<0 || row>= rows|| row<0) {
			   return false;
		   }
		   
		   char local = str[pathStack.size()];
		   if(local == matrix[row][col]) {
			   if(path[row][col]) {
				   path[row][col] = false;
				   pathStack.push(new Coordinate(row,col));
				   if(judge(matrix, path, pathStack, str, row+1, col,rows,cols)
						   || judge(matrix, path, pathStack, str, row-1, col,rows,cols)
						   || judge(matrix, path, pathStack, str, row, col+1,rows,cols)
						   || judge(matrix, path, pathStack, str, row, col-1,rows,cols)) {
					   return true;
				   }else {
					   Coordinate coordinate= pathStack.pop();
					   path[coordinate.row][coordinate.col] = true;
					   return false;
				   }
			   }else {
				   return false;
			   }
		   }else {
			   return false;
			   
		   }
	   }
	   public static void main(String[] args) {
		   Problem065 problem =new Problem065();
		   char[] matrix = "A".toCharArray();
		   char[] str = "A".toCharArray();
		   System.out.println(problem.hasPath(matrix, 1, 1, str));
		   ;
	}
}
class Coordinate{
	int row;
	int col;
	public Coordinate(int row,int col) {
		this.row = row;
		this.col = col;
	}
}