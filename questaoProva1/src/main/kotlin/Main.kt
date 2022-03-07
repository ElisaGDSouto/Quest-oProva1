    fun main(args: Array<String>) {
        val numeros = listOf(1,2,3,4,5,6)
        filtrarNumeros(numeros)
    }

    fun numerosImpares(numeros:List<Int>) = numeros.filter { num -> num % 2 == 0 }

    fun numerosPares(numeros: List<Int>) = numeros.filter {num -> num % 2 != 0  }

    fun filtrarNumeros(numeros: List<Int>){
        val numerosPares = numerosPares(numeros)
        val numerosImpares = numerosImpares(numeros)

        println(numerosPares)
        println(numerosImpares)
    }

