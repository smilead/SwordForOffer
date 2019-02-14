package org.smilead.swordoffer.problem007;
/*
 * 时间限制：1秒 空间限制：32768K 热度指数：430183
 算法知识视频讲解
题目描述
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39
 */
public class Problem007 {
    public int Fibonacci(int n) {
        int result = 0;
       if(n==0){
           return 0;
       }else if(n ==1){
           return 1;
       }else{
           int first =0;
           int second =1;
           for(int i = 0; i< n-1;i++){
               result = first+second;
               first = second;
               second = result;
           }
       }
       return result;
   }
   public int Fibonacci(int first,int second){
       return first+second;
   }
}
