/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.airoshambo;

/**
 *
 * @author Artmar
 */
import java.util.*;

public class AiRoshamboRunner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rounds;
        String name;
        System.out.print("Enter your name: ");
        name = input.next();
        System.out.println("You are P1");
        System.out.print("Enter the number of Rounds you wish to play: ");
        rounds = input.nextInt();
        HumanPlayer p1 = new HumanPlayer(name);
        ComputerPlayer p2 = new ComputerPlayer("Roshambot");
        Game game = new Game(p1, p2, rounds);

        game.run();
    }

}
