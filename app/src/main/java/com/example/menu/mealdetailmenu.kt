

open class MealDoenjanMenu(name:String) {
    var name: String = ""

    init {
        this.name = name

    }

    open fun mealDetailMenu(order3: Int){

        println("${name}은(는) 1인분에 5,000원 입니다")
        println("뒤로가기를 원하시면 0번을 눌러주세요")
        while(true) {
            var order3_1 = readLine()!!.toInt()
            if(order3_1 == 0) {
                break
            } else {
                println("뒤로가기는 0을 입력해주셔야합니다")
            }
            println("다시 입력해주세요")
        }
    }
}

class MealNoodleMenu(name: String) : MealDoenjanMenu(name) {

}

class MealRiceMenu(name: String) : MealDoenjanMenu(name) {
    override fun mealDetailMenu(order3: Int) {
        println("${name}은(는) 1인분에 1,000원 입니다")
        println("뒤로가기를 원하시면 0번을 눌러주세요")
        while(true) {
            var order3_1 = readLine()!!.toInt()
            if(order3_1 == 0) {
                break
            } else {
                println("뒤로가기는 0을 입력해주셔야합니다")
            }
            println("다시 입력해주세요")
        }
    }

}

