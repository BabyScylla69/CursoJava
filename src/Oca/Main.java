package Oca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        ArrayList <Player> players = new ArrayList<>();
        boolean hasEnded = false;
        System.out.println("How many players will play?");

        int numPlayers = Integer.parseInt(br.readLine());
        for (int i = 0; i < numPlayers; i++)
        {
            System.out.println("Introduce player " + (i+1) + "'s name");
            players.add(new Player(br.readLine(), 0));
        }

        logic(hasEnded, players);
    }
    public static void logic(boolean hasEnded, ArrayList<Player> playerList)
    {
        int dice, currentBox, aliveCount;
        while (!hasEnded)
        {
            aliveCount = 0;
            for (Player player : playerList) {
                if (player.getTurnsLeft() == 0 && player.isAlive())
                {
                    dice = throwDice();
                    System.out.println(player.getName() + " rolled a " + dice);
                    currentBox = player.getBox() + dice;
                    if (mapContainsKey(currentBox, getGooseMap())) {
                        GeeseText();
                        player.setBox(returnBox(currentBox, getGooseMap()));

                        dice = throwDice();
                        System.out.println(player.getName() + " rolled a " + dice);

                        currentBox = player.getBox() + dice;
                        player.setBox(currentBox);
                    } else if (mapContainsKey(currentBox, getBridgeMap())) {
                        bridgeText();
                        player.setBox(returnBox(currentBox, getBridgeMap()));

                        dice = throwDice();
                        System.out.println(player.getName() + " rolled a " + dice);

                        currentBox = player.getBox() + dice;
                        player.setBox(currentBox);
                    } else if (mapContainsKey(currentBox, getDiceMap())) {
                        diceText();
                        player.setBox(returnBox(currentBox, getDiceMap()));

                        dice = throwDice();
                        System.out.println(player.getName() + " rolled a " + dice);

                        currentBox = player.getBox() + dice;
                        player.setBox(currentBox);
                    } else if (mapContainsKey(currentBox, getTimeOutMap())) {
                        timeOutText(returnBox(currentBox, getTimeOutMap()), player);
                    } else if (player.getBox() == 58) {
                        System.out.println("Oh no! " + player.getName() + " lost!");
                        player.setAlive(false);
                    } else
                        player.setBox(currentBox);
                    System.out.println(player.getName() + "'s current box: " + player.getBox());
                }
                else
                {
                    player.setTurnsLeft(player.getTurnsLeft() - 1);
                    System.out.println(player.getName() + " cant throw the dice for the next: " + player.getTurnsLeft());
                }
                if(player.isAlive())
                    aliveCount++;
                if(checkWin(player) || aliveCount == 0)
                {
                    System.out.println("Game finished");
                    hasEnded = true;
                    break;
                }
            }
        }
    }
    public static int throwDice()
    {
        return (int) Math.floor(Math.random() * 6 + 1);
    }
    public static void GeeseText()
    {
        System.out.println("From goose to goose and I dice again cuz I want");
    }
    public static void bridgeText()
    {
        System.out.println("From bridge to bridge and I dice again cuz I want");
    }
    public static void diceText()
    {
        System.out.println("From dice to dice and I throw cuz I can");
    }
    public static void timeOutText(int time, Player p)
    {
        System.out.println("Oh no! " + p.getName() + " cant play for the next " + time + " turns");
        p.setTurnsLeft(time);
    }
    public static boolean checkWin(Player p)
    {
        if (p.getBox() > 63)
        {
            System.out.println(p.getName() + " has won!");
            return true;
        }
        return false;
    }
    public static HashMap<Integer, Integer> getGooseMap()
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(5, 9);
        map.put(9, 14);
        map.put(14, 18);
        map.put(18, 23);
        map.put(23, 27);
        map.put(27, 32);
        map.put(32, 36);
        map.put(36, 41);
        map.put(41, 45);
        map.put(45, 50);
        map.put(50, 54);
        map.put(54, 59);

        return map;
    }
    public static HashMap<Integer, Integer> getBridgeMap()
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(6, 12);
        map.put(12, 6);
        return map;
    }
    public static HashMap<Integer, Integer> getDiceMap()
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(26, 53);
        map.put(53, 26);
        return map;
    }
    public static HashMap<Integer, Integer> getTimeOutMap()
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(19, 2);
        map.put(3, 1);
        map.put(52, 3);
        return map;
    }
    public static boolean mapContainsKey(int box, HashMap<Integer, Integer> map)
    {
        return map.containsKey(box);
    }
    public static int returnBox(int box, HashMap<Integer, Integer> map)
    {
        return map.get(box);
    }
}
