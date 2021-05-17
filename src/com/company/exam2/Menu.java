package com.company.exam2;

import java.util.Scanner;

public class Menu {
    public static int menu() {

        Scanner input = new Scanner(System.in);
        String selection;
        do {
            System.out.println("Нажмите на клавишу, чтобы выполнить действие");
            System.out.println("1 - чтобы начать новую игру");
            System.out.println("2 - чтобы чтобы загрузить игру");
            System.out.println("3- чтобы выйти");
            selection = input.nextLine();
            switch (selection) {
                case "1":
                    startNewGame();
                    break;
                case "2":
                    loadGame();
                    break;
                case "3":
                    break;
                default:
                    System.out.println("действие не распознано");

            }
        } while (!selection.equals("4"))
    }

}
