package repository;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryMemoria {
    private List<Cliente> lista = new ArrayList<>();
    private int proximoId = 1;

    public Cliente adicionar(Cliente c) {
        c.setId(proximoId++);
        lista.add(c);
        return c;
    }

    public List<Cliente> listar() {
        return lista;
    }

    public Cliente buscarPorId(int id) {
        for (Cliente c : lista) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public boolean atualizar(int id, String nome, String telefone, String email) {
        Cliente c = buscarPorId(id);
        if (c != null) {
            c.setNome(nome);
            c.setTelefone(telefone);
            c.setEmail(email);
            return true;
        }
        return false;
    }

    public boolean removerPorId(int id) {
        Cliente c = buscarPorId(id);
        if (c != null) {
            lista.remove(c);
            return true;
        }
        return false;
    }
}
