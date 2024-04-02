/*
 * Copyright (C) 2024 Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ex01.entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @author Gabriel Braga <ninjagame9795286@gmail.com>
 * @date 01/04/2024
 * @brief Class Aluno
 */
public class Aluno {

         
    private Double n1;
    private Double n2;
    private Double n3;
    private Double n4;
    private Integer numeroDeAlunos = 0;
    private Double media;
    private Double somadeMedias;

    public Aluno() {
    }

    public Aluno(Double n1, Double n2, Double n3, Double n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;

    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public Double getN3() {
        return n3;
    }

    public void setN3(Double n3) {
        this.n3 = n3;
    }

    public Double getN4() {
        return n4;
    }

    public void setN4(Double n4) {
        this.n4 = n4;
    }

    public Integer getNumeroDeAlunos() {
        return numeroDeAlunos;
    }

    public void setNumeroDeAlunos(Integer numeroDeAlunos) {
        this.numeroDeAlunos = numeroDeAlunos;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getSomadeMedias() {
        return somadeMedias;
    }

    public void setSomadeMedias(Double somadeMedias) {
        this.somadeMedias = somadeMedias;
    }

    public void CalcularMedia() {

        media = (n1 + (n2 * 2) + (n3 * 3) + (n4 * 4)) / 10;

    }

    public void CompararMedia(double mediaA) {

        double result = 0;

        if (mediaA > media) {
            result = -1;

            System.out.println(result);

        } else if (mediaA < media) {
            result = 1;

            System.out.println(result);

        } else if (mediaA == media) {
            result = 0;

            System.out.println(result);

        }

    }

    public void contALunos() {

        numeroDeAlunos++;

    }

    public void somarMedias() {

        somadeMedias = +media;

    }

}
