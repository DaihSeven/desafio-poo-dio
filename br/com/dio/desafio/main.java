package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       //* System.out.println(curso1);
       // System.out.println(curso2);
      //  System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaiane = new Dev();
        devDaiane.setNome("Daiane");
        devDaiane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Daiane:" + devDaiane.getConteudosInscritos());
        devDaiane.progredir();
        devDaiane.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Daiane:" + devDaiane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Daiaene:" + devDaiane.getConteudosConcluidos());
        System.out.println("XP:" + devDaiane.calcularTotalXp());

        System.out.println("-------");

        Dev devCleber = new Dev();
        devCleber.setNome("Cleber");
        devCleber.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Cleber:" + devCleber.getConteudosInscritos());
        devCleber.progredir();
        devCleber.progredir();
        devCleber.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Cleber:" + devCleber.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Cleber:" + devCleber.getConteudosConcluidos());
        System.out.println("XP:" + devCleber.calcularTotalXp());

    }
}
 