package com.elporfirio;

public class Conditional {

    public static void main() {
        System.out.println("locochon");
    }

    public void asignacionCondicional() {
        /* Asignación condicional
         *
         * resultado = <condicion> ? <true> : <false>;
         */

        // int v1 = 7; int v2 = 5;
        int v1 = 7, v2 = 5;
        int resultado = v1 > v2 ? v1 : v2;
    }

    public void doCondicionales() {
        /* Condicional normal **/
        float estudiantes = 30.0f;
        float salones = 4.0f;

        if(estudiantes > 0.0){
            if(salones > 0.0){
                System.out.println(estudiantes / salones);
                float resultado = estudiantes / salones;
            }
        }

        System.out.println(resultado);
    }

    public void doLogicOperators(){
        int estudiantes = 150;
        int salones = 0;

        // Con un simbolo condicional si la primera falla la segunda no se ejecuta
        if(salones > 0 & estudiantes/salones > 30)
            System.out.println("Si caben");

        if(salones > 0 && estudiantes/salones > 30)
            System.out.println("Si Caben 2");

    }
}
