package main;

public class FizzBuzz {

  private final int TOTAL_NUMBERS = 100;

  public void printNumbers(){
    for (int index = 0; index < TOTAL_NUMBERS; index++){
      System.out.println(translate(index));
    }
  }

  public String translate(int number){
    if (number % 3 == 0 && number % 5 == 0)
      return "FizzBuzz";
    if(number % 3 == 0)
      return "Fizz";
    if(number % 5 == 0)
      return "Buzz";

    return String.valueOf(number);
  }
}
