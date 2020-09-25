class SnakeLadder
{
 public static final int MAX = 7;
 public static final int MIN = 1;
 public static final int LADDER = 1;
 public static final int SNAKE = 2;
 public static void main(String[] args)
  {
    System.out.println("Welcome to Snake and Ladder game between two players.");
    int pos1 = 0,pos2 = 0,chance = 0,option = 0;
    while(pos1 < 100 && pos2 < 100){
                  chance++;
                  if(chance % 2 != 0)
                  { 
                     //Player 1 will roll the dice
                do{
                   System.out.println("Player 1 is at position "+pos1);
                   int number =(int) Math.floor(Math.random() * (MAX - MIN))+1;
                   System.out.println("The number on die is : "+number);
                      option = (int) Math.floor(Math.random() * 3);
		    switch(option){
			case LADDER:
                                    pos1 += number;
			            System.out.println("Option: LADDER "+"\n"+"The Player 1 goes at position "+pos1);
				     break;
			case SNAKE: pos1 -= number;
				    System.out.println("Option: SNAKE" +"\n"+"The Player 1 goes at position "+pos1);
				    break;
			default:  System.out.println("Option: NO PLAY"+ "\n"+"The Player 1 stays at position "+pos1);
		                }
                       if(pos1 < 0)
                              pos1 = 0;
                       if(pos1 > 100)
                              pos1 -= number;
                       System.out.println("Player 1 is now at "+pos1);
                    }while(option == LADDER && pos1 != 100);
                   }
               else{    
                      // Player 2 will roll the dice
                      do{
                   System.out.println("Player 2 is at position "+pos2);
                   int number =(int) Math.floor(Math.random() * (MAX - MIN))+1;
                   System.out.println("The number on die is : "+number);
                      option = (int) Math.floor(Math.random() * 3);
                    switch(option){
                        case LADDER:
                                    pos2 += number;
                                    System.out.println("Option: LADDER "+"\n"+"The Player 2 goes at position "+pos2);
                                     break;
                        case SNAKE: pos2 -= number;
                                    System.out.println("Option: SNAKE" +"\n"+"The Player 2 goes at position "+pos2);
                                    break;
                        default:  System.out.println("Option: NO PLAY"+ "\n"+"The Player 2 stays at position "+pos2);
                                }
                       if(pos2 < 0)
                              pos1 = 0;
                       if(pos2 > 100)
                              pos2 -= number;
                       System.out.println("Player 2 is now at "+pos2);
                    }while(option == LADDER && pos2 != 100);
                   }
              }
        if(pos1 == 100)
           System.out.println("Player 1 is the WINNER. ");
         else
            System.out.println("Player 2 is the WINNER. ");
 }

}
