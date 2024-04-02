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
package ex02.entities;

import java.util.Random;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @author Gabriel Braga <ninjagame9795286@gmail.com>
 * @date 01/04/2024
 * @brief Class NumeroSecreto
 */
public class NumeroSecreto {

    private Integer numeroaleatorio = -1;

    public NumeroSecreto() {

    }

    public NumeroSecreto(Integer numeroaleatorio) {
        this.numeroaleatorio = numeroaleatorio;
    }

    public Integer getNumeroaleatorio() {
        return numeroaleatorio;
    }

    public void setNumeroaleatorio(Integer numeroaleatorio) {
        this.numeroaleatorio = numeroaleatorio;
    }

    public void SORTEAR() {
        Random rand = new Random();
        Integer rand_Integer1 = rand.nextInt(101);
        numeroaleatorio = rand_Integer1;

    }

    public void ADIVINHAR(Integer numero) {
        if (numero < 0 || numero > 100) {
            numero = 1;
            System.out.println("ESSE NÚMERO NÃO FOI SORTEADO");
        } else if (numero < numeroaleatorio) {
            numero = -1;
            System.out.println("MENOR QUE O NÚMERO ALEATÓRIO");
        } else if (numero == numeroaleatorio) {
            numero = 0;
            System.out.println("É IGUAL O NÚMERO ALEATÓRIO");
        } else if (numero > numeroaleatorio) {
            numero = 1;
            System.out.println("MAIOR QUE O NÚMERO ALEATÓRIO");
        }

    
}
}