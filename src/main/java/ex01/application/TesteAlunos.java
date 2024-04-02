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
package ex01.application;

import ex01.entities.Aluno;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @author Gabriel Braga <ninjagame9795286@gmail.com>
 * @date 01/04/2024
 * @brief Class TesteAlunos
 */
public class TesteAlunos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Aluno aluno = new Aluno();

        for (int i = 1; i <= 3; i++) {

            System.out.print("Informe a primeira nota do " + i + "ª aluno: ");
            double n1 = sc.nextDouble();
            aluno.setN1(n1);
            System.out.print("Informe a segunda nota do " + i + "ª aluno: ");
            double n2 = sc.nextDouble();
            aluno.setN2(n2);
            System.out.print("Informe a terceira nota do " + i + "ª aluno: ");
            double n3 = sc.nextDouble();
            aluno.setN3(n3);
            System.out.print("Informe a quarta nota do " + i + "ª aluno: ");
            double n4 = sc.nextDouble();
            aluno.setN4(n1);

            aluno.CalcularMedia();

            System.out.println("Média do " + i + "ª aluno: " + aluno.getMedia());

            System.out.println("Informe uma média para comparar");
            double mediaA = sc.nextDouble();

            aluno.CompararMedia(mediaA);

            aluno.contALunos();

            aluno.somarMedias();

        }

        System.out.println();

        System.out.println("Número de Alunos: " + aluno.getNumeroDeAlunos());
        System.out.println("Média total dos Alunos: " + aluno.getSomadeMedias());

    }

}
