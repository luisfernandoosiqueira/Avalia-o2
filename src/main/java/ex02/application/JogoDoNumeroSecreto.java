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
package ex02.application;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @author Gabriel Braga <ninjagame9795286@gmail.com>
 * @date 01/04/2024
 * @brief Class JogoDoNumeroSecreto
 */
public class JogoDoNumeroSecreto {

    public static void main(String[] args) {

        JogoDoNumeroSecreto NUMEROSECRET = new JogoDoNumeroSecreto();
        Scanner sc = new Scanner(System.in);
        NUMEROSECRET.SORTEAR();

        Integer opcao = 1;
        do {
            Integer numero = sc.nextInt();
            NUMEROSECRET.ADIVINHAR(numero);

            if (NUMEROSECRET.getNumeroaleatorio() == numero) {
                opcao = 0;
            }
        } while (opcao != 0);
    }

    private void SORTEAR() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void ADIVINHAR(Integer numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Integer getNumeroaleatorio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
