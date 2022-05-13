package br.com.controleestoque;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * [x] - Criar uma classe PRODUTO(Código, nome, quantidade)
 * [] - Cadastrar produto
 * [] - Listar produto
 * [] - Entrada de produto
 * [] - Saída de produto
 * [] - Comando para encerrar o progama
 */
public class Main {

    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String comando;

        do {
            comando = scanner.nextLine();
            System.out.println(comando);
        }while(!comando.equals("exit"));
    }
}
