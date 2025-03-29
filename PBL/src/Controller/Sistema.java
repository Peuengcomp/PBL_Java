package Controller;


import View.TelaMenu;

import java.util.Scanner;

public class Sistema
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();

        TelaMenu tela = new TelaMenu();

        entrada.close();
    }
}
