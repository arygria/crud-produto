package com.exemplo.crudproduto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Apenas pra testar se aplicação esta subindo (lembrar de excluir e não subir no Github!!)

/* http://localhost:8080/Hello
http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:produtosdb
Login: sa
 */

//Senha: vazio*\
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}


