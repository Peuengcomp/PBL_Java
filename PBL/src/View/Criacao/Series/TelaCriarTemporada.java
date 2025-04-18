package View.Criacao.Series;

import Model.Entidades.Temporada;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TelaCriarTemporada
{
    public static Temporada fazerTela(Scanner entrada, int id)
    {
        System.out.println("Digite os dados da temporada " + id);

        System.out.println("Digite o ano da temporada:");
        int ano = entrada.nextInt();

        System.out.println("Digite a quantidade de episódios da temporada:");
        int qtd = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Faça um review da temporada:");
        String review = entrada.nextLine();

        System.out.println("avalie de 1 a 5 a temporada:");
        int avaliacao = entrada.nextInt();

        System.out.println("Preencha as informaçõe acerca da data em que finalizou a temporada:");

        System.out.println("dia: ");
        int dia = entrada.nextInt();

        System.out.println("mẽs: ");
        int mes = entrada.nextInt();

        System.out.println("ano: ");
        int ano_assistido = entrada.nextInt();

        LocalDate data = LocalDate.of(ano_assistido,mes,dia);
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        data.format(formatar);

        return new Temporada(id, ano, qtd, review, avaliacao, data);
    }
}
