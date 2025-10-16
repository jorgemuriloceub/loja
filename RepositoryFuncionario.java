package repository;

import model.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepositoryMemoria {
    private List<Funcionario> lista = new ArrayList<>();
    private int proximoId = 1;

    public Funcionario adicionar(Funcionario f) {
        f.setId(proximoId++);
        lista.add(f);
        return f;
    }

    public List<Funcionario> listar() {
        return lista;
    }

    public Funcionario buscarPorId(int id) {
        for (Funcionario f : lista) {
            if (f.getId() == id) return f;
        }
        return null;
    }

    public boolean atualizar(int id, String nome, double salario, String matricula) {
        Funcionario f = buscarPorId(id);
        if (f != null) {
            f.setNome(nome);
            f.setSalario(salario);
            f.setMatricula(matricula);
            return true;
        }
        return false;
    }

    public boolean removerPorId(int id) {
        Funcionario f = buscarPorId(id);
        if (f != null) {
            lista.remove(f);
            return true;
        }
        return false;
    }
}
