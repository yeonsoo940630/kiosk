package com.example.menu

import BeefChunkflattailMenu
import BeefOutsideskirtMenu
import BeefRibMenu
import BeefSirloinMenu
import DrinkSpriteMenu
import DrinksCokeMenu
import MealDoenjanMenu
import MealNoodleMenu
import MealRiceMenu


open class Menu {
    open fun all() {

        var pork = PorkMenu()
        var beef = BeefMenu()
        var meal = MealMenu()
        var drinks = DrinksMenu()

        while (true) {
            println("아래 메뉴판을 보시고 메뉴를 골라 숫자를 입력해주세요")
            println("1. 돼지고기")
            println("2. 소고기")
            println("3. 식사")
            println("4. 주류 및 음료")
            println("0. 종료")

            try {
                var order = readLine()!!.toInt()
                when (order) {
                    1 -> {
                        pork.porkMenu(order)
                    }

                    2 -> {
                        beef.beefMenu(order)
                    }

                    3 -> {
                        meal.mealMenu(order)
                    }

                    4 -> {
                        drinks.drinksMenu(order)
                    }

                    0 -> {
                        break
                    }
                    else -> {
                        println("메뉴에 있는 숫자를 입력하세요")
                    }
                }
            }catch(e:java.lang.NumberFormatException) {
                println("숫자를 입력하세요")

            }
        }
    }
}




class PorkMenu: Menu() {
    fun porkMenu(order: Int){
        var pbm = PorkBellyMenu("삼겹살")
        var pcm = PorkShoulderButtMenu("목살")
        var psm = PorkJowlsMenu("항정살")
        var pdm = PorkDiaphpagmMenu("갈매기살")


        while (true) {
            println("돼지고기 종류를 골라 숫자를 입력해주세요")
            println("1. 삼겹살")
            println("2. 목살")
            println("3. 항정살")
            println("4. 갈매기살")
            println("0. 뒤로가기")
            var order1 = readLine()!!.toInt()
            when (order1) {
                1 -> {
                    pbm.detailPorkMenu(order1)
                }

                2 -> {
                    pcm.detailPorkMenu(order1)
                }

                3 -> {
                    psm.detailPorkMenu(order1)
                }

                4 -> {
                    pdm.detailPorkMenu(order1)
                }

                0 -> {
                    break
                }
            }
        }
    }
}

class BeefMenu: Menu() {
    fun beefMenu(order: Int){

        while (true) {
            var bom = BeefOutsideskirtMenu("안창살")
            var bcm = BeefChunkflattailMenu("살치살")
            var brm = BeefRibMenu("갈비살")
            var bsm = BeefSirloinMenu("등심")

            println("소고기 종류를 골라 숫자를 입력해주세요")
            println("1. 안창살")
            println("2. 살치살")
            println("3. 갈비살")
            println("4. 등심")
            println("0. 뒤로가기")
            var order2 = readLine()!!.toInt()
            when (order2) {
                1 -> {
                    bom.detailBeefMenu(order2)
                }

                2 -> {
                    bcm.detailBeefMenu(order2)
                }

                3 -> {
                    brm.detailBeefMenu(order2)
                }

                4 -> {
                    bsm.detailBeefMenu(order2)
                }

                0 -> {
                    break
                }
            }
        }
    }
}

class MealMenu: Menu() {
    fun mealMenu(order: Int){
        var mdm = MealDoenjanMenu("된장찌개")
        var mnm = MealNoodleMenu("냉면")
        var mrm = MealRiceMenu("공깃밥")

        while (true) {
            println("식사 종류를 골라 숫자를 입력해주세요")
            println("1. 된장찌개")
            println("2. 냉면")
            println("3. 공깃밥")
            println("0. 뒤로가기")
            var order3 = readLine()!!.toInt()
            when (order3) {
                1 -> {
                    mdm.mealDetailMenu(order3)
                }

                2 -> {
                    mnm.mealDetailMenu(order3)
                }

                3 -> {
                    mrm.mealDetailMenu(order3)
                }
                0 -> {
                    break
                }
            }
        }
    }
}

class DrinksMenu: Menu() {
    fun drinksMenu(order: Int){
        var dcm = DrinksCokeMenu("콜라")
        var dsm = DrinkSpriteMenu("사이다")


        while (true) {
            println("음료 및 주류 종류를 골라 숫자를 입력해주세요")
            println("1. 콜라")
            println("2. 사이다")
            println("0. 뒤로가기")
            var order4 = readLine()!!.toInt()
            when (order4) {
                1 -> {
                    dcm.drinksDetailMenu(order4)
                }

                2 -> {
                    dsm.drinksDetailMenu(order4)
                }

                0 -> {
                    break
                }
            }
        }
    }
}