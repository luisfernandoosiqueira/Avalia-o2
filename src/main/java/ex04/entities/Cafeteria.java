/*
 * Copyright (C) 2024 Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ex04.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @author Gabriel Braga <ninjagame9795286@gmail.com>
 * @date 01/04/2024
 * @brief Class Cafeteria
 */
public class Cafeteria {

   Scanner ler = new Scanner(System.in);

    Locale.setDefault (Locale.US);

    boolean teste = true;
    int controle, opcao, quantidade = 0;
    String nome;
    double valor, total = 0;
    String opcao1;

    ArrayList<Cafe> produto = new ArrayList<>();

    produto.add (new Cafe("cafe expresso", 0.75));
    produto.add (new Cafe("cafe capuccino", 1));
    produto.add (new Cafe("leite com cafe", 1.25));
    produto.add (new Cafe("cafe pingado", 1.75));
    produto.add (new Cafe("cafe latte", 2));
    produto.add (new Cafe("cafe mocha", 1.65));

        do {
        System.out.println("Deseja adicionar um produto?(s/n)");
        opcao1 = ler.next();

        if (opcao1.equals("s")) {
            System.out.println("Qual o nome do produto?");
            ler.nextLine();
            nome = ler.nextLine();
            System.out.println("Qual o valor do produto?");
            valor = ler.nextDouble();
            produto.add(new Cafe(nome, valor));
            continue;
        } else if (opcao1.equals("n")) {
            teste = false;
            break;
        } else {
            System.out.println("Opcao invalida");
            continue;
        }
    }
    while (teste);

        teste  = true;

        do {
            controle = 0;
        System.out.println("Forneca uma opcao:");
        for (Cafe i : produto) {

            System.out.println((controle) + " - " + produto.get(controle).getNome());
            controle++;

        }
        System.out.println((controle) + " - Saida");
        opcao = ler.nextInt();

        if (opcao > controle) {
            System.out.println("Opcao invalida");
            continue;
        } else if (opcao == controle) {
            teste = false;
            break;
        } else {
            produto.get(opcao).addCafe();
            continue;
        }

    }
    while (teste);

        teste  = true;

    
        do{
            System.out.println("Deseja remover um produto?(s/n)");
        opcao1 = ler.next();

        if (opcao1.equals("s")) {
            System.out.println("Qual o produto?");
            controle = 0;
            for (Cafe a : produto) {

                System.out.println((controle) + " - " + produto.get(controle).getNome());
                controle++;
            }

            opcao = ler.nextInt();
            produto.get(opcao).removerCafe();
            continue;
        } else if (opcao1.equals("n")) {
            teste = false;
            break;
        } else {
            System.out.println("Opcao invalida");
            continue;
        }

    }
    while (teste);

        controle  = 0;
    for (Cafe e: produto) {
        System.out.println("Qde " + produto.get(controle).getNome() + " " + produto.get(controle).getQuantidade() + " - Valor " + produto.get(controle).total());
        controle++;
    }

    controle  = 0;
    for (Cafe e : produto

    
        ) {
            
            total += produto.get(controle).total();
        quantidade += produto.get(controle).getQuantidade();
        controle++;
    }

    System.out.printf (

    "\nQde cafes vendidos: %d, valor cafes vendido: %.2f", quantidade, total);

    System.out.println (

    "");
    System.out.println (

    "    Como deseja pagar? ");
    System.out.println (

    "1 - Deseja pagar parcialmente");
    System.out.println (
    "2 - Deseja pagar tudo");
        int pgt_client = ler.nextInt();
    //Bloco para ver quanto que foi pago, quanto que está devendo, troco do cliente
    double tConta = total;

    switch (pgt_client) {

        case 1:
            System.out.println("Qual o valor que deseja pagar? ");
            double pgt_prc = ler.nextDouble();
            tConta = tConta - pgt_prc;

            if (tConta == 0) {

                System.out.println("Muito obrigado, volte sempre!");

            } else if (tConta < 0) {

                tConta = -(tConta);
                System.out.println("Seu troco e " + tConta + ". Volte sempre!");

            } else {
                while (tConta > 0) {

                    System.out.println("Esta devendo " + tConta + ". Pague!");
                    System.out.println("Qual o valor que ira pagar? ");
                    double novopgt = ler.nextDouble();
                    tConta = tConta - novopgt;

                    if (tConta == 0) {
                        System.out.println("Volte sempre!");
                        break;

                    } else if (tConta > 0) {
                        continue;

                    } else {
                        tConta = -(tConta);
                        System.out.println("Seu troco e " + tConta + ". Volte sempre!");
                        break;
                    }
                }
            }
        case 2: {
            System.out.println("Muito obrigado, volte sempre!");
            break;
        }
    }
    }
    
    
}
