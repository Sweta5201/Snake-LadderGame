class SnakeLadder
{
 public static final int POS = 0;
 public static final int MAX = 7;
 public static final int MIN = 1;
 public static void main(String[] args)
  {
    System.out.println("Single Player Starting at position "+ POS);
    int number =(int) Math.floor(Math.random() * (MAX - MIN))+1;
    System.out.println("The number on die is : "+number);

  }
}
