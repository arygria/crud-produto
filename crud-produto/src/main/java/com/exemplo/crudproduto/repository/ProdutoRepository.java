package com.exemplo.crudproduto.repository;

import com.exemplo.crudproduto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface que permite acesso ao banco de dados com métodos prontos (salvar, listar, deletar, etc)
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
