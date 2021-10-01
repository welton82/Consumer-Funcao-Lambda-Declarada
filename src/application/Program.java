package application;

import entities.Produto;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
   public static void main(String[] args) {

       List<Produto> lista = new ArrayList<>();

       lista.add(new Produto("Notebook",1500.60));
       lista.add(new Produto("fone de ouvido",50.00));
       lista.add(new Produto("Tv 29 Lg",3650.54));
       lista.add(new Produto("Armario Itatiaia",2506.30));

       //FUNÇÃO LAMBDA DECLARADA
       //  . CRIANDO UMA FUNÇAO QUE RECEBE UM PRODUTO
       Consumer<Produto> consumer = p -> {
           p.setPreco(p.getPreco() * 1.1);
       };

       lista.forEach(System.out::print);
       System.out.println();
       lista.forEach(consumer);
       lista.forEach(System.out::print);


    }
}