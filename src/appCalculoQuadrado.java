/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class appCalculoQuadrado {

    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado(10, 10);

        float area = quadrado1.calculaArea();
        float perimetro = quadrado1.calculaPerimetro();

        System.out.println("Area do quadrado :" + area);
        System.out.println("Area do perimetro :" + perimetro);
    }

}
