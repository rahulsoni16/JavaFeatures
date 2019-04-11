package com.code.lamda;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.youtube.com/watch?v=Pr-p5LNjS0c&t=971s
 *
 * @author rahul.soni
 */
public class Lambda {

    public static void main(String[] args) {

        Game cricket = new Game() {
            @Override
            public void play() {
                System.out.println("I am playing cricket");

            }
        };
        cricket.play();

        Game cricketLamda = () -> System.out.println("I am playing football");
        cricketLamda.play();

        Series odiSeries = (type) -> System.out.println("I am playing " + type);
        odiSeries.play("ODI");

        List<String> players = Arrays.asList("Sachin", "Kohli", "Dhoni", "Sehwag", "Ganguly", "Dravid");

        players.stream().filter(player -> player.equalsIgnoreCase("Sachin"))
                .forEach(player -> System.out.println(player + " is playing"));
    }

    interface Game {
        void play();

        // void players();
    }

    interface Series {
        void play(String type);
    }
}
