package com.example.tarefa_modulo3

fun main() {

    //variavel mutavel seu valor pode ser alterado depois de inicializada
    var num: Int = 6
    num = 5
    println(num)

    //variavel imutavel seu valor não pode ser alterado depois que é inicializada
    val num2: Int = 6
    //num2 = 7 // ao tentar alterar o valor gera um erro
    println(num2)

    //condicional PAR

    var numero1 = 10

    if (numero1 %2== 0 ) {
        println("Numero é Par")
    } else {
        println("numero é Impar")
    }

    //Condicional Impar

    var numero2 = 15

    if (numero2 %2!== 0 ) {
        println("Número é Impar")
    } else {
        println("Número é Par")
    }

    //When

    when {
        numero1 %2==0 -> println("Número é PAR")
        numero2 %2!==0 -> println("Número é IMPAR")

    }

    println()
    var array: IntArray = IntArray(40)

    for (i in 1..array.size) {
        println(i)
    }

    println()
    var lista: IntArray = IntArray(99)
    for (i in 1..lista.size) {
        println(i)
    }

    println()

    var soma: Int = 0
    for (j in 1..lista.size ) {
        soma = soma + j
        println( "Posição[$j] resultado = $soma ")
    }



}