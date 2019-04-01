package com.example.si;

public class SI {
    private int principal;
    private int rate;
    private int time;

    public SI(int principal, int rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public float getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int SimpleInterest(){
        return principal*time*rate/100;
    }

}
