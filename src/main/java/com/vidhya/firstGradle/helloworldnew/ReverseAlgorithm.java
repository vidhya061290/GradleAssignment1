package com.vidhya.firstGradle.helloworldnew;

import java.util.Scanner;

	public class ReverseAlgorithm {
		public static void toReverseButNotSpecialSign(char[] charArray) {
			int l=0;
			int r=charArray.length-1;
				while(l < r) {
					 if (!Character.isLetterOrDigit(charArray[l])) {
						 l++;
					 }
						 else if(!Character.isLetterOrDigit(charArray[r])){
							 r--;
						
					}
						 else {
							
								 char temp=charArray[l];
								 charArray[l]=charArray[r];
								 charArray[r]=temp;
								 l++;
								 r--;
							 }
				}
			}
			
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the input: ");
			String input=sc.nextLine();
			char[] charArray = input.toCharArray();
			toReverseButNotSpecialSign(charArray);
			String reversedArray= new String(charArray);
			System.out.println("AfterReverse: " + reversedArray );
			sc.close();
			
		}
		

	}



