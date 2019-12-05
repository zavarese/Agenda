package br.edu.ifsp.scl.agenda.data;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.scl.agenda.R;
import br.edu.ifsp.scl.agenda.model.Contato;


public class ContatoDAO {

    public List<Contato> listaContatos()
    {
        List<Contato> contatos = new ArrayList<>();

        Contato c1 = new Contato();
        c1.setId(1);
        c1.setNome("Maria");
        c1.setFoto(R.drawable.foto1);
        c1.setMail("maria@gmail.com");
        contatos.add(c1);

        Contato c2 = new Contato();
        c2.setId(2);
        c2.setNome("Fernanda");
        c2.setFoto(R.drawable.foto2);
        c2.setMail("fernanda@gmail.com");
        contatos.add(c2);

        Contato c3 = new Contato();
        c3.setId(3);
        c3.setNome("Joana");
        c3.setFoto(R.drawable.foto3);
        c3.setMail("joana@gmail.com");
        contatos.add(c3);

        Contato c4 = new Contato();
        c4.setId(4);
        c4.setNome("Roberta");
        c4.setFoto(R.drawable.foto4);
        c4.setMail("roberta@gmail.com");
        contatos.add(c4);

        Contato c5 = new Contato();
        c5.setId(5);
        c5.setNome("Carla");
        c5.setFoto(R.drawable.foto5);
        c5.setMail("carla@gmail.com");
        contatos.add(c5);

        Contato c6 = new Contato();
        c6.setId(6);
        c6.setNome("Francisco");
        c6.setFoto(R.drawable.foto6);
        c6.setMail("francisco@gmail.com");
        contatos.add(c6);

        Contato c7 = new Contato();
        c7.setId(7);
        c7.setNome("Fernando");
        c7.setFoto(R.drawable.foto7);
        c7.setMail("fernando@gmail.com");
        contatos.add(c7);

        Contato c8 = new Contato();
        c8.setId(8);
        c8.setNome("Carlos");
        c8.setFoto(R.drawable.foto8);
        c8.setMail("carlos@gmail.com");
        contatos.add(c8);

        Contato c9 = new Contato();
        c9.setId(9);
        c9.setNome("Jose");
        c9.setFoto(R.drawable.foto9);
        c9.setMail("jose@gmail.com");
        contatos.add(c9);

        Contato c10 = new Contato();
        c10.setId(10);
        c10.setNome("Joao");
        c10.setFoto(R.drawable.foto10);
        c10.setMail("joao@gmail.com");
        contatos.add(c10);

        return contatos;
    }

}
