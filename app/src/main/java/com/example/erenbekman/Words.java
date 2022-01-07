package com.example.erenbekman;

public class Words {
    String Question;
    String O1;
    String O2;
    String O3;
    String O4;
    String Ans;


    public Words(String question, String O1, String O2, String O3, String O4, String Ans){
        Question = question;
        this.O1 = O1;
        this.O2 = O2;
        this.O3 = O3;
        this.O4 = O4;
        this.Ans = Ans;
    }
    public String getQuestion() {return Question;}
    public String getO1() {return O1;}
    public String getO2() {return O2;}
    public String getO3() {return O3;}
    public String getO4() {return O4;}
    public String getAns() {return Ans;}
}
