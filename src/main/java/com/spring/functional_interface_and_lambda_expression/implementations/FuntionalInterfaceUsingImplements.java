package com.spring.functional_interface_and_lambda_expression.implementations;

public class FuntionalInterfaceUsingImplements {
    public static void main(String[] args) {
        BCCI bcci = new BCCI();
        bcci.totalPlayers();
    }
}

class BCCI implements Cricket{

    @Override
    public void totalPlayers() {
        System.out.println("Having total 11 players");
    }
}