package com.example.menu



open class PorkBellyMenu(name:String) {
    var name: String = ""

    init {
        this.name = name

    }

    fun detailPorkMenu(order1: Int){

        println("${name}은(는) 1인분에 10,000원 입니다")
        println("뒤로가기를 원하시면 0번을 입력해주세요")
        while(true) {
            var order1_1 = readLine()!!.toInt()
            if(order1_1 == 0) {
                break
            } else {
                println("뒤로가기는 0을 입력해주셔야합니다")
            }
            println("다시 입력해주세요")
        }
    }
}

class PorkShoulderButtMenu(name: String) : PorkBellyMenu(name){
}

class PorkJowlsMenu(name: String) : PorkBellyMenu(name){
}

class PorkDiaphpagmMenu(name: String) : PorkBellyMenu(name){
}