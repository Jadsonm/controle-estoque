package br.com.controleestoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * [x] - Criar uma classe PRODUTO(Código, nome, quantidade)
 * [x] - (1) Cadastrar produto
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
            System.out.println("1 - Para cadastrar\n4 - Para listar" );
            comando = scanner.nextLine();

            switch (comando){
                case "1":
                    System.out.print("Digite o código: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());

                    cadastrarProduto(codigo, nome, quantidade);
                    break;
                case "4":
                    listarProdutos();
                    break;
            }

        } while (!comando.equals("exit"));
    }

    private static void listarProdutos() {
        if(list.isEmpty()){
            System.out.println("A lista está vazia");
        }
        for(int i = 0; i < list.size(); i++){
            Produto produto = list.get(i);
            System.out.println("Codigo: " + produto.getCodigo() + "\nNome: " + produto.getNome() + "\nQuantidade: " + produto.getQuantidade());
        }
    }

    private static void cadastrarProduto(final String codigo, final String nome, final int quantidade) {
        Produto produto = new Produto(codigo, nome, quantidade);

        list.add(produto);
    }

}
