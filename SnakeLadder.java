class SnakeLadder
{
 public static final int POS = 0;
 public static final int MAX = 7;
 public static final int MIN = 1;
 public static final int LADDER = 1;
 public static final int SNAKE = 2;
 public static void main(String[] args)
  {
    System.out.println("Single Player Starting at position "+ POS);
    int pos = 0;
    int temp;
    int i=0;
    while(pos!=100){
                   int number =(int) Math.floor(Math.random() * (MAX - MIN))+1;
                   i++;
                   System.out.println("The number on die is : "+number);
                   int option = (int) Math.floor(Math.random() * 3);
		    switch(option){
			case LADDER:temp = pos;
                                    pos += number;
			            if(pos>100) {
				               pos=temp;
			                        }
                                     System.out.println("Option: LADDER "+"\n"+"The Player goes at position "+pos);
				     break;
			case SNAKE: pos -= number;
                                    if(pos<0)
                                      {
				       pos=0;
			              }
				    System.out.println("Option: SNAKE" +"\n"+"The Player goes at position "+pos);
				    break;
			default:  System.out.println("Option: NO PLAY"+ "\n"+"The Player stays at position "+pos);
		                }

                   }
                   System.out.println("Dice was played "+i+" times.");
  }
}
