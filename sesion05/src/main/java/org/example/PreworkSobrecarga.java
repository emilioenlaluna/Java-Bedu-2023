package org.example;

public class PreworkSobrecarga {
    public double math(){
        return 0;
    }
    public double math(double param){
        return 1;
    }

    public double math(int paramInt){
        return 0;
    }

    //

    //no hay distincia entre metodos
    /*
    public double Math(){
        return 0;
    }

    public int Math(){
        return 0;
    }
    //ERROR
     */
}
