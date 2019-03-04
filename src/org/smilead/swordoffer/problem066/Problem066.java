package org.smilead.swordoffer.problem066;
/*
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class Problem066 {
	
	public int movingCount(int threshold, int rows, int cols){
		boolean[][] flags = new boolean[rows][cols];
		for(int i = 0 ; i<rows;i++) {
			for(int j = 0; j<cols; j++) {
				flags[i][j] = false;
			}
		}
		return count(threshold, rows, cols, 0, 0, flags);
		
	}
	public int count(int threshold ,int rows,int cols,int row,int col,boolean[][] flags) {
		if(row<0 || row >= rows ||col < 0 || col >= cols || !enable(row, col, threshold) || flags[row][col]) {
			return 0;
		}
		flags[row][col] = true;
			
		
		return 1+count(threshold, rows, cols, row-1, col, flags)
				+count(threshold, rows, cols, row+1, col, flags)
				+count(threshold, rows, cols, row, col-1, flags)
				+count(threshold, rows, cols, row, col+1, flags);
	}
	
	
	public boolean enable(int x,int y,int threshold) {
		int sum = 0;
		char[] xArray =  String.valueOf(x).toCharArray();
		char[] yArray = String.valueOf(y).toCharArray();
		for(int i = 0;i<xArray.length;i++) {
			sum= sum +xArray[i]-'0';
		}
		for(int j = 0;j<yArray.length;j++) {
			sum+=yArray[j]-'0';
		}
		if(sum>threshold) {
			return false;
		}else {
			return true;
		}
	}

}
