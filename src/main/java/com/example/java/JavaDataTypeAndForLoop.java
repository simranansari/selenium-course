package com.example.java;

public class JavaDataTypeAndForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int mynum = 7;
       boolean Murat = true;
       Boolean Hamza = false;
       Boolean zafar = new Boolean(true);
       char word ='Z';
       String name = "Google";
       double decimal = 67.786;
       float deci = 5.67f;
       
//       System.out.println(mynum);
//       System.out.println(word+"Hamza");
//       System.out.println("Murat");
       
       int[] arr = new int[5];
       arr[0] = 1;
       arr[1] = 2;
       arr[2] = 3;
       arr[3] = 4;
       arr[4] = 5;
      
       int[] arr2 = {1,2,3,4,5};
       
//       System.out.println(arr[3]);
//       System.out.println(arr2[0]);
       
       //for loop
       
//       for(int i=2;i < arr.length; i++) {
//    	   System.out.println(arr[i]);
//       }
       
//       for(int i=2;i < arr.length - 1; i++) {
//    	   System.out.println(arr[i]);
//       }
       
//       for(int i=2; ; i++) {
//    	   System.out.println(arr[i]);
//       }
       
       String[] names = {"Merlin","Benjamin","Aroma","Bacardi"};
       for( String s: names) {
   	   System.out.println(s);
       }
       
	}

}
