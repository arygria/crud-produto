package com.exemplo.crudproduto.controller;

import com.exemplo.crudproduto.model.Produto;
import com.exemplo.crudproduto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //Aqui será o controlador da API
@RequestMapping ("/produtos")//URL base será /produtos
public class ProdutoController {

    @Autowired //injeta o serviço
    private ProdutoService service;

    //GET /produtos : lista todos os produtos
    @GetMapping
    public List<Produto> listarTodos() {
        return service.listarTodos();
    }

    //GET /produtos/{id} : busca produto por ID
    @GetMapping("/{id}")
    public Optional<Produto> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // POST /produtos : cria um novo produto
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return service.salvar(produto);
    }

    //DELETE /produtos/{id} : deleta um produto
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
