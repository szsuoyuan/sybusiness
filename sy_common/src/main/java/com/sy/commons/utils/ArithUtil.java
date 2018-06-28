package com.sy.commons.utils;

import java.math.BigDecimal;

public class ArithUtil {
	
	private static final int DEF_DIV_SCALE=10;
	
	private ArithUtil() {}
	
	//add：加
	public static double add(double v1,double v2) {
		BigDecimal b1=BigDecimal.valueOf(v1);
		BigDecimal b2=BigDecimal.valueOf(v2);
		return b1.add(b2).doubleValue();
	}
	
	//subtract：减
	public static double sub(double v1,double v2) {
		BigDecimal b1=BigDecimal.valueOf(v1);
		BigDecimal b2=BigDecimal.valueOf(v2);
		return b1.subtract(b2).doubleValue();
	}
	
	//multiply：乘
	public static double mul(double v1,double v2) {
		BigDecimal b1=BigDecimal.valueOf(v1);
		BigDecimal b2=BigDecimal.valueOf(v2);
		return b1.multiply(b2).doubleValue();
	}
	
	//divide：除
	public static double div(double v1,double v2) {
		BigDecimal b1=BigDecimal.valueOf(v1);
		BigDecimal b2=BigDecimal.valueOf(v2);
		return b1.divide(b2, DEF_DIV_SCALE,BigDecimal.ROUND_HALF_UP).doubleValue();
		
	}
	
	public static void main(String[] args) {
		System.out.println(ArithUtil.add(0.2, 0.345));
		System.out.println(ArithUtil.sub(0.2, 0.3));
		System.out.println(ArithUtil.mul(0.2, 0.3));
		System.out.println(ArithUtil.div(10.0, 3));
	}
	

}
