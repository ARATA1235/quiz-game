package src;

import java.awt.*;
import java.util.List;
public class Quiz {

    private int quizNumber;

    private String mainText;

    private int answer;


    public Quiz(int quizNumber, String mainText, int answer) {

        this.quizNumber = quizNumber;

        this.mainText = mainText;

        this.answer = answer;

    }


    //[問題1]

    //パンはパンでも食べられないパンは?

    public void showQuiz() {

        //TODO:実装する

        System.out.println("[問題" + this.quizNumber + "]");

        System.out.println(this.mainText);

    }
}