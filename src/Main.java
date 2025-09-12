import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contato> agenda = new ArrayList<Contato>();

        agenda.add(new Contato("Pessoa1"));
        agenda.add(new Contato("Pessoa2"));
        agenda.add(new Contato("Pessoa3"));

        agenda.forEach(
                contato -> System.out.println("Nome: "+contato.getNome())
        );

        System.out.println("Fera");


       /* List<String> listinha = new ArrayList<String>();
        listinha.add("Nome novo");
        listinha.add("Teste");
        listinha.add("Fera");
        listinha.add("Feraa");
        listinha.add("Feraaaa");

        System.out.println(listinha);
        System.out.println(listinha.get(1));
        listinha.remove("Fera");
        System.out.println(listinha);
        System.out.println(listinha.size());

        for(String nome : listinha){
            System.out.println(nome);
        }*/

    }
}