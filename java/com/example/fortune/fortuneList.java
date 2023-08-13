package com.example.fortune;
import java.util.Random;

public class fortuneList {

    private String [] fortunes = {"A beautiful, smart, and loving person will be coming into your life.",
            "A dubious friend may be an enemy in camouflage.", "A faithful friend is a strong defense." ,
            "A feather in the hand is better than a bird in the air.", "A fresh start will put you on your way.",
            "A friend asks only for your time not your money." , "A friend is a present you give yourself.",
            "A gambler not only will lose what he has, but also will lose what he doesn’t have."};

    public String getFortune() {
        Random random = new Random();
        int x = random.nextInt(7);
        return fortunes[x];
    }
}

