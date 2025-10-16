package repository;

import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepositoryMemoria {
    private List<Produto> lista = new ArrayList<>();
    private int proximoId = 1;

    public Produto adicionar(Produto p) {
        p.setId(proximoId++);
        lista.add(p);
        return p;
    }

    public List<Produto> listar() {
        return lista;
    }

    public Produto buscarPorId(int id) {
        for (Produto p : lista) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public boolean atualizar(int id, String nome, double preco, int qtd) {
        Produto p = buscarPorId(id);
        if (p != null) {
            p.setNome(nome);
            p.setPreco(preco);
            p.setQuantidadeEmEstoque(qtd);
            return true;
        }
        return false;
    }

    public boolean removerPorId(int id) {
        Produto p = buscarPorId(id);
        if (p != null) {
            lista.remove(p);
            return true;
        }
        return false;
    }
}
