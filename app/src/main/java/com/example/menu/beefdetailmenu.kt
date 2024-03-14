
open class BeefChunkflattailMenu(name:String) {
    var name: String = ""

    init {
        this.name = name

    }

    open fun detailBeefMenu(order2:Int){

        println("${name}은(는) 1인분에 15,000원 입니다")
        println("뒤로가기를 원하시면 0번을 입력해주세요")
        while(true) {
            var order2_1 = readLine()!!.toInt()
            if(order2_1 == 0) {
                break
            } else {
                println("뒤로가기는 0을 입력해주셔야합니다")
            }
            println("다시 입력해주세요")
        }
    }
}

class BeefOutsideskirtMenu(name: String) : BeefChunkflattailMenu(name) {
    override fun detailBeefMenu(order2: Int) {
        println("${name}은(는) 1인분에 18,000원 입니다")
        println("뒤로가기를 원하시면 0번을 입력해주세요")
        while(true) {
            var order2_1 = readLine()!!.toInt()
            if(order2_1 == 0) {
                break
            } else {
                println("뒤로가기는 0을 입력해주셔야합니다")
            }
            println("다시 입력해주세요")
        }
    }
}

class BeefRibMenu(name: String) : BeefChunkflattailMenu(name) {

}

class BeefSirloinMenu(name: String) : BeefChunkflattailMenu(name) {

}