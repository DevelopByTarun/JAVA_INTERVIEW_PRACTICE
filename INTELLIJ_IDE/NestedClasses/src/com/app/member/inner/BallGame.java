package com.app.member.inner;

public class BallGame {

    private int ballSpeed;

    public BallGame() {

        this.ballSpeed = 65;
    }

    public void getBallGameResult() {

        new BallColorAndName().setUpBallColorAndName();
        new BallColorAndName().calculateBallSpeed();
    }

    private class BallColorAndName {

        private String ballName;
        private String ballColor;

        private void setUpBallColorAndName() {

            this.ballName = "tarun";
            this.ballColor = "green";
            System.out.println("ball name => " + this.ballName);
            System.out.println("ball color => " + this.ballColor);
        }

        private void calculateBallSpeed() {

            ballSpeed--;    // 1st way to access outer class variable
            ballSpeed += Math.random() * 100;
            BallGame.this.ballSpeed++;        // 2nd way to access outer class variable
            System.out.println("ball speed => " + ballSpeed + " KM");
        }

    }
}
