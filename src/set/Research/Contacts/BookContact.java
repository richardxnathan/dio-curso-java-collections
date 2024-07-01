package src.set.Research.Contacts;

import java.util.HashSet;
import java.util.Set;

public class BookContact {

    private Set<Contact> contacts = new HashSet<>();

    public void addContact(String name, int phoneNumber){
        contacts.add(new Contact(name, phoneNumber));
    }

    public void showContacts(){
        System.out.println(contacts);
    }

    public Set<Contact> researchByName(String name){
        Set<Contact> contactByName = new HashSet<>();

        for (Contact c : contacts) {
            if (c.getName().equals(name)){
                contactByName.add(c);
            }
        }

        return contactByName;
    }

    public void updatePhoneNumber(String name, int phoneNumber){
        for (Contact c : contacts) {
            if (c.getName().equals(name)){
                c.setPhoneNumber(phoneNumber);

                System.out.println("Contato atualizado com sucesso!");
            }
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        BookContact agendaContatos = new BookContact();

        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.showContacts();

        // Adicionando contatos à agenda
        agendaContatos.addContact("João", 123456789);
        agendaContatos.addContact("Maria", 987654321);
        agendaContatos.addContact("Maria Fernandes", 55555555);
        agendaContatos.addContact("Ana", 88889999);
        agendaContatos.addContact("Fernando", 77778888);
        agendaContatos.addContact("Carolina", 55555555);

        // Exibindo os contatos na agenda
        agendaContatos.showContacts();

        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.researchByName("Maria"));

        // Atualizando o número de um contato
        agendaContatos.updatePhoneNumber("Carolina", 44443333);

        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.showContacts();
    }

}
