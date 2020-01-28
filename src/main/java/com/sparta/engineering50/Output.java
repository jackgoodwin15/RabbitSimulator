package com.sparta.engineering50;

import java.io.FileReader;

public class Output {

    public static void returnDeathCounter(){
        System.out.println("Dead rabbit counter: " + RabbitCounter.getDeadCounter());
    }

    public static void returnRabbitCounter(){

for (int y = 0; y < Field.rabbits.size()-1; y++){
    if (Field.rabbits.get(y).getGender() == "male"){
        RabbitCounter.increaseMaleCounter();
    }
    else {
        RabbitCounter.increaseFemaleCounter();
    }
}
        System.out.println("Female rabbit counter: " + RabbitCounter.getFemaleRabbitCounter());
        System.out.println("Male rabbit counter: " + RabbitCounter.getMaleRabbitCounter());}
}