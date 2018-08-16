package com.company;

public class NumberUtils {
    public boolean multipleOfFive(int number){
        return (number % 5) == 0;
    }
    public boolean multipleOfThree(int number){
        return (number % 3) == 0;
    }
    public boolean multipleOfFiveAndThree(int number){
        return multipleOfFive(number) && multipleOfThree(number);
    }
    public String getConvertedString(int number){
       String converted = String.valueOf(number);
       if(multipleOfFiveAndThree(number)){
           converted = "Linianos";
       } else if (multipleOfFive(number)){
           converted = "IT";
       } else if (multipleOfThree(number)){
           converted = "Linio";
       }
       return converted;
       
    }
}
