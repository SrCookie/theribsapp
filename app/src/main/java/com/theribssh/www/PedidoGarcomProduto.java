package com.theribssh.www;

/**
 * Created by 16165846 on 18/10/2017.
 */

public class PedidoGarcomProduto {

    private int idProduto;
    private String imagem;
    private String nome;
    private String obs;
    private float preco;

    public PedidoGarcomProduto(int idProduto, float preco, String nome, String imagem,String obs) {
        setIdProduto(idProduto);
        setPreco(preco);
        setNome(nome);
        setObs(obs);
        setImagem(imagem);
    }

    public int getIdProduto() {
        return this.idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getImagem() {
        return this.imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getObs() {
        return this.obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}