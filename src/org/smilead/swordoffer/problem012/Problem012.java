package org.smilead.swordoffer.problem012;

public class Problem012 {
	   public double Power(double base, int exponent) {
	        double result = base;
	        if(exponent>0){
	            if(exponent ==1){
	                return result;
	            }else{
	                for(int i = 1;i<exponent;i++){
	                    result = result*base;
	                }
	            }
	        }else if(exponent<0){
	            exponent=Math.abs(exponent);
	                for(int i = 1;i<exponent;i++){
	                    result = result*base;
	                }
	            result = 1/result;
	        }else{
	            return 1;
	        }
	        return result;
	  }
}
