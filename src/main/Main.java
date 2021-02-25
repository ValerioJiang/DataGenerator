package main;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] nome = {"Mario","Silvio","Marco","Gianni","Andrea","Fabio","Beppe","Mauro","Carlo","Nicolo","Sandro"};//11
        String[] cognome = {"Rossi","Pio","Esposito","Bignardi","Russo","Di felice","Pieri","Tommasini","Bonfatti","La russa","Di maio"};

        StringBuilder sb = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < 50; i++) {
            sb.append("insert into ricercatore values(");
            sb.append(i);
            sb.append(","+nome[rand.nextInt(nome.length)]+","+cognome[rand.nextInt(cognome.length)]+");\n");
        }

        System.out.println(sb);
    }
}
