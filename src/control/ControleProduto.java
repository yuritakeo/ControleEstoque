/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Produto;
import model.ProdutoDao;


/**
 *
 * @author Thiago
 */
public class ControleProduto {
        public void Cadastrar(Produto produto) {
        ProdutoDao produtoDao = new ProdutoDao();
        
        produtoDao.Cadastrar(produto);
        
    }
}
