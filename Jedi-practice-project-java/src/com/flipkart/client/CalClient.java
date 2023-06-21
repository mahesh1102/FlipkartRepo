/**
 * 
 */
package com.flipkart.client;
import com.flipkart.service.Calservice;

/**
 * 
 */
public class CalClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we need to create the instance
		Calservice service = new Calservice();
		System.out.println("addition --->" +service.add(10,10));
		System.out.println("substraction --->" +service.sub(10,10));
		System.out.println("Multipication --->" +service.multiply(10,10));
		System.out.println("Division--->" +service.divide(10,10));
		
	}

}
