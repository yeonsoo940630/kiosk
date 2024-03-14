import com.example.menu.DrinksMenu


open class DrinksCokeMenu(name:String) {
    var name: String = ""

    init {
        this.name = name

    }

    open fun drinksDetailMenu(order4: Int){

        println("${name}은(는) 1병에 2,000원 입니다")
        println("뒤로가기를 원하시면 0번을 입력해주세요")
        while(true) {
            var order4_1 = readLine()!!.toInt()
            if(order4_1 == 0) {
                break
            } else {
                println("뒤로가기는 0을 입력해주셔야합니다")
            }
            println("다시 입력해주세요")
        }
    }
}

class DrinkSpriteMenu(name: String) : DrinksCokeMenu(name) {

}