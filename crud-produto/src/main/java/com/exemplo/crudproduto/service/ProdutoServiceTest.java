package com.exemplo.crudproduto.service;

/* import com.exemplo.crudproduto.model.Produto;
import com.exemplo.crudproduto.repository.ProdutoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;


//Anotação com foco em teste no banco de dados (jpa)
@DataJpaTest
public class ProdutoServiceTest {

    @Autowired //Injetando o verdadeiro repositorio que salva no banco de dados
    private ProdutoRepository produtoRepository;

    @Test
    public void deveSalvarProdutoComSucesso() {

        //Criando um novo produto de teste
        Produto produto = new Produto();
        produto.setNome("Café");
        produto.setDescricao("Café em pó");
        produto.setPreco(10.0);

        //Salvar no banco
        Produto produtoSalvo = produtoRepository.save(produto);

        //Buscar pelo ID
        Optional<Produto> resultado = produtoRepository.findById(produtoSalvo.getId());

        //Verificando se foi salvo corretamente
        assertTrue(resultado.isPresent());
        assertEquals("Café", resultado.get().getNome());
        assertEquals("Café em pó", resultado.get().getDescricao());
        assertEquals(10.0, resultado.get().getPreco());

    }
} */
