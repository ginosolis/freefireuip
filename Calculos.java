package com.company;

import java.security.PrivateKey;

public class Calculos {

    private double num1, num2, res;

    public Calculos(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;

    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public void sumar(double num1, double num2){
        res=num1+num2;
        System.out.println("El resultado de la suma es: "+res);
    }

    public void resta(double num1, double num2){
        res=num1-num2;
        System.out.println("El resultado de la resta es: "+res);
    }

    public void multiplicacion(double num1, double num2){
        res=num1*num2;
        System.out.println("El resultado de la multiplicacion es: "+res);
    }

    public void division(double num1, double num2){
        res=num1/num2;
        System.out.println("El resultado de la division es: "+res);
    }

}
