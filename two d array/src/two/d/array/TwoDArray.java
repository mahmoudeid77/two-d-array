/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two.d.array;

import java.util.Scanner;

/**
 *
 * @author MOHAMED HASSAN
 */
public class TwoDArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[][] arr={{5,4,1},{7,8,9},{5,1,5},{1,4,2}};
      
         for(int i=0;i<3;i++){
             for(int k=0;k<4;k++){
                 System.out.print(arr[k][i]);
             }
             System.out.println();     
    }
   
    
}
    
}
