package br.com.controleestoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * [x] - Criar uma classe PRODUTO(Código, nome, quantidade)
 * [] - (1) Cadastrar produto
 *      [] - Não cadastrar produto com o mesmo código
 * [] - (2) Entrada de produto
 * [] - (3) Saída de produto
 * [] - (4) Listar produto
 * [] - Comando para encerrar o progama
 */
public class Main {
    static List<Produto> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comando;

        do {
            comando = scanner.nextLine();

            if (comando.equals("1")) {
                System.out.print("Digite o código: ");
                String codigo = scanner.nextLine();
                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();
                System.out.print("Digite a quantidade: ");
                int quantidade = Integer.parseInt(scanner.nextLine());

                cadastrarProduto(codigo, nome, quantidade);
            }

            System.out.println(comando);
        } while (!comando.equals("exit"));
    }

    private static void cadastrarProduto(final String codigo, final String nome, final int quantidade) {
        Produto produto = new Produto(codigo, nome, quantidade);

        list.add(produto);
    }

}
