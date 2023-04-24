import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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
    }
}