/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect4;

/**
 *
 * @author sugen
 */
public class Game {
    char board[][]= new char[6][7];
    int height[]=new int[7];
    char winner=' ';
    int lastMove[]=new int[2];
    char lastPlayer=' ';
    
    private Game(){
       
    }
   public boolean isPlaying()
   {
       int countR=0;
       int countC=0;
       int countD1=0;
       int countD2=0;
 
       for(int i=-3; i<4;i++)
       {
           if(lastMove[1]+i<7&&lastMove[1]+i>0)
           {
               if(board[lastMove[0]][lastMove[1]+i]==lastPlayer)
               {
                   countR++;
               }
           }
           if(lastMove[0]+i<6&&lastMove[0]+i>0)
           {
               if(board[lastMove[0]+i][lastMove[1]]==lastPlayer])
               {
                   countC++;
               }
           }
           if(lastMove[0]+i<6&&lastMove[0]+i>0&lastMove[1]+i<7&&lastMove[1]+i>0)
           {
               if(board[lastMove[0]+i][lastMove[1]+i]==lastPlayer])
               {
                   countD1++;
               }
           }
           if(lastMove[0]-i<6&&lastMove[0]-i>0&lastMove[1]-i<7&&lastMove[1]-i>0)
           {
               if(board[lastMove[0]-i][lastMove[1]-i]==lastPlayer)
               {
                   countD2++;
               }
           }
           
           
       }
       if(countD1>=4||countD2>=4||countR>=4||countC>=4)
       {
                winner=lastPlayer;
                return true;  
       }
       return false;
   }
       
    public void pickColumn(char player, int column)
    {
            //checking
                if (height[column]<6){
                    board[height[column]][column]=player;
                    lastMove[0]=height[column];
                    lastMove[1]=column;
                    lastMove[2]=player;
                    height[column]++;  
                    
                }
                    
             
    
    }
    public char getWinner()
    {
        return winner;
    } 
}
