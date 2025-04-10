package com.exemplo.crudproduto.service;

import com.exemplo.crudproduto.model.Produto;
import com.exemplo.crudproduto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service  //Indica que essa classe é um 'serviço' usado pra regra de negócio
public class ProdutoService {

    @Autowired //Pede pro Spring injetar o repositório aqui
    private ProdutoRepository repository;

    //Lista todos os produtos cadastrados
    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    //Salva um produto novo (ou atualiza um existente)
    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    //Busca um produto pelo ID
    public Optional<Produto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    //Remove um produto pelo ID
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
