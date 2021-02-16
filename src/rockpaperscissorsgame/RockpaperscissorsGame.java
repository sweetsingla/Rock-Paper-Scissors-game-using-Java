/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissorsgame;

/**
 * This program is to play rock paper scissors game with computer.
 * @author sweet singla
 */
import java.util.Scanner;

import java.lang.Math;
/**
 *
 * @author sweet
 */
public class RockpaperscissorsGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       String response="";
        do{
          System.out.print("Choose scissors(0), rock(1), paper(2): ");
          int number= input.nextInt();
          int rand = (int)(Math.random() * 3); 
         
           System.out.println("Computer chose: " +rand);
           String user="";
           String computer="";
         if(number==0 ){
             user="scissors";    
         }
         else if(number==1 ){
             user="rock";   
         }
         else{
              user="paper"; 
         }
         
          if(rand==0){
             computer="scissors";
         }
         else if( rand==1){
             computer="rock";
         }
         else{
             computer="paper";
         }
         
           if(rand==number){
               System.out.println("The computer is "+computer+". You are "+user+" too. It is a draw");
            
           }else{
               if((number==1 && rand==0)||(number==2 && rand==1)||(number==0 && rand==2)){
                              System.out.println("The computer is "+computer+". You are "+user+". You won");
           
           }else{
                   System.out.println("The computer is "+computer+". You are "+user+". You lose");
               }
          }
            System.out.print("Do you want to continue(yes/no): ");
     response =input.next();
     if(response.equals("no")){
         System.out.print("\nGame ended.");
     }
        }while(response.equals("yes"));
    
}
}
