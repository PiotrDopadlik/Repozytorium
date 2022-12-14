package com.example.messi;

public class Question
{
    private String content;
    private String[] answers;
    private int trueAnswer;
    private int selectedAnswer;
    private int points;

    public Question(String content, String[] answers, int trueAnswer, int selectedAnswer)
    {
        this.content = content;
        this.answers = answers;
        this.trueAnswer = trueAnswer;
        this.selectedAnswer = selectedAnswer;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String[] getAnswers()
    {
        return answers;
    }

    public void setAnswers(String[] answers)
    {
        this.answers = answers;
    }

    public int getTrueAnswer()
    {
        return trueAnswer;
    }

    public void setTrueAnswer(int trueAnswer)
    {
        this.trueAnswer = trueAnswer;
    }

    public int getSelectedAnswer()
    {
        return selectedAnswer;
    }

    public void setSelectedAnswer(int selectedAnswer)
    {
        this.selectedAnswer = selectedAnswer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void checkAnswer()
    {
        if(trueAnswer == selectedAnswer)
        {
            points++;
        }
        else
        {
            points = points;
        }
    }
}