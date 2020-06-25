/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class Quadrado {

    private int altura;
    private int largura;

    public Quadrado(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;

    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public float calculaArea() {
        return altura * largura;
    }

    public float calculaPerimetro() {
        return 4 * largura;
    }
}
