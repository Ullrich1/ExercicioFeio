import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        String a1 = "Marquioli";
        String a2 = "Samuel";
        String a3 = "Christian";
        String a4 = "Andrey";
        String a5 = "Josefino";

        ArrayList<String> alunos =new ArrayList<String>();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);

        alunos.remove(4);
        System.out.println("--------------------");
        System.out.println(alunos);
        System.out.println("--------------------");
        Collections.sort(alunos);
        System.out.println("Todos em ordem");
        System.out.println(alunos);
        System.out.println("--------------------");
        alunos.add("Andoval");
        System.out.println(alunos.get(4));

    }
}