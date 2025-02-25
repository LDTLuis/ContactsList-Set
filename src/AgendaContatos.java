import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Paulo", 12345678);
        agendaContatos.adicionarContato("Pedro", 12345679);
        agendaContatos.adicionarContato("Pedro Vincius", 11111111);
        agendaContatos.adicionarContato("Roberto", 22222222);
        agendaContatos.adicionarContato("Luis", 24680123);
        agendaContatos.adicionarContato("Carla", 23456789);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Pedro"));

        /*agendaContatos.atualizarNumeroContato("Pedro", 12345677);

        agendaContatos.exibirContato(); */

    }


}
