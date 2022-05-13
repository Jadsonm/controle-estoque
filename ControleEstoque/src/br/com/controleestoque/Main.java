package br.com.controleestoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * [x] - Criar uma classe PRODUTO(Código, nome, quantidade)
 * [x] - (1) Cadastrar produto
 *      [ ] - Não cadastrar produto com o mesmo código
 * [x] - (2) Entrada de produto
 * [x] - (3) Saída de produto
 * [x] - (4) Listar produto
 * [x] - Comando para encerrar o progama
 */
public class Main {
    static List<Produto> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comando;
        String codigo;
        String nome;
        int quantidade;

        do {
            System.out.println("1 - Para cadastrar\n2 - Para dar entrada\n3 - Saida de produto\n4 - Para listar");
            comando = scanner.nextLine();

            switch (comando) {
                case "1":
                    System.out.print("Digite o código: ");
                    codigo = scanner.nextLine();
                    System.out.print("Digite o nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    quantidade = Integer.parseInt(scanner.nextLine());

                    cadastrarProduto(codigo, nome, quantidade);
                    break;
                case "2":
                    System.out.print("Digite o código: ");
                    codigo = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    quantidade = Integer.parseInt(scanner.nextLine());

                    entradaProduto(codigo, quantidade);
                    break;
                case "3":
                    System.out.print("Digite o código: ");
                    codigo = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    quantidade = Integer.parseInt(scanner.nextLine());

                    saidaProduto(codigo,quantidade);
                    break;
                case "4":
                    listarProdutos();
                    break;
                default:
                    System.out.println("Comando invalido!");
            }

        } while (!comando.equals("exit"));
    }

    private static void saidaProduto(String codigo, int quantidade) {
        for (Produto produto : list) {
            if (produto.getCodigo().equals(codigo)) {
                produto.subQuantidade(quantidade);
                return;
            }
        }
        System.out.println("Não foi possivel encontrar produto com o código: " + codigo);
    }

    private static void entradaProduto(final String codigo, final int quantidade) {
        for (Produto produto : list) {
            if (produto.getCodigo().equals(codigo)) {
                produto.addQuantidade(quantidade);
                return;
            }
        }

        System.out.println("Não foi possível encontrar produto com código: " + codigo);
    }

    private static void listarProdutos() {
        if (list.isEmpty()) {
            System.out.println("A lista está vazia");
        }

        for (int i = 0; i < list.size(); i++) {
            Produto produto = list.get(i);
            System.out.println("Codigo: " + produto.getCodigo() + "\nNome: " + produto.getNome() + "\nQuantidade: " + produto.getQuantidade());
        }
    }

    private static void cadastrarProduto(final String codigo, final String nome, final int quantidade) {
        for (Produto produto : list){
            if (produto.getCodigo().equals(codigo)){
                System.out.println("Já existe cadastro com esse codigo, tente outro");
                return;
            }
        }
        Produto produto = new Produto(codigo, nome, quantidade);
        list.add(produto);
    }

}
