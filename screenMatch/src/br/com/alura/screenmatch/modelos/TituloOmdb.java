package br.com.alura.screenmatch.modelos;

public record TituloOmdb(String title, String year, String runtime) {
    //não precisa codar nada pois ela já tem os contrutores e objetos padrões
    //O Record  representa uma classe imutável(capacidade de um objeto não poder ser alterado depois de criado)
}
