import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso = new Curso();
    curso.setTitulo("curso java");
    curso.setDescricao("descricao do curso");
    curso.setCargaHoraria(10);

    Curso segCurso = new Curso();
    segCurso.setTitulo("segundo curso");
    segCurso.setDescricao("descrição do segundo curso");
    segCurso.setCargaHoraria(12);

    System.out.println(curso);
    System.out.println(segCurso);

    Mentoria novaMentoria = new Mentoria();
    novaMentoria.setTitulo("mentoria para Java");
    novaMentoria.setDescricao("descrição da mentoria");
    novaMentoria.setData(LocalDate.now());

    System.out.println(novaMentoria);

    Conteudo novoCurso = new Curso();
    novoCurso.setTitulo("curso sobre polimorfismo em Java");
    novoCurso.setDescricao("informações sobre o curso");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(segCurso);
        bootcamp.getConteudos().add(novoCurso);
        bootcamp.getConteudos().add(novaMentoria);

        Dev devHumberto = new Dev();
        devHumberto.setNome("Humberto");
        devHumberto.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de "+devHumberto.getNome() + devHumberto.getConteudosInscritos());
        devHumberto.progredir();
        devHumberto.progredir();
        devHumberto.progredir();
        devHumberto.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos de " +devHumberto.getNome() + devHumberto.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " +devHumberto.getNome() + devHumberto.getConteudosConcluidos());
        System.out.println("XP: " + devHumberto.calcularTotalXp());

        System.out.println("---------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de "+devJoao.getNome() + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos de "+ devJoao.getNome() + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + devJoao.getNome() + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
}