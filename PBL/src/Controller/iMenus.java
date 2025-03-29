package Controller;

import java.util.Scanner;

public interface iMenus
{
    void fazerTela();
    default int entrada()
    {
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
        return valor;
    }
}
