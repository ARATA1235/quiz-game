package src;

import java.awt.*;
import java.util.*;

import java.io.*;
import java.util.List;


public class Main {


    public static void main(String[] args) {

        List<Quiz> quizzes = new ArrayList<Quiz>();

        quizzes.add(new Quiz(1, "パンはパンでも食べられないパンは?", 3));

        Player player = new Player();


        for (Quiz quiz : quizzes) {

            quiz.showQuiz();


            System.out.println("[結果]");

            player.showCorrectQuizNum();

        }
    }
}