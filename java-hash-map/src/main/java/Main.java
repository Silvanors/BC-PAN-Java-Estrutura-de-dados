import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //criar Map chave e valor
        Map<String, String> aluno = new HashMap<>();

        //criar alunos
        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Média", "8.5");
        aluno.put("Turma", "3a");

        System.out.println(aluno);

        //retorna o grupo de chaves da lista com keySet()
        System.out.println(aluno.keySet());

        //retorna o grupo de chaves da lista com values()
        System.out.println(aluno.values());

        //criar a lista de alunos com tipo Map<String, String>
        List<Map<String, String>> listAlunos = new ArrayList<>();

        listAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        //criar alunos
        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Média", "8.9");
        aluno2.put("Turma", "3b");

        listAlunos.add(aluno2);

        System.out.println(listAlunos);

        //verifica se a estrutura Map contém determinada chave
        System.out.println(aluno.containsKey("Nome"));

    }

}
