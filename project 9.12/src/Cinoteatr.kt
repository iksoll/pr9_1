open class Cinoteatr(var name: String, var price: Double) {

    open fun seance() {
        println("На $name нет сеансов")
    }

    open fun GetInfo(){
        println ("Информация о сеансе")
        println ("Фильм: ${name}, стоимость: ${price} ")
    }

}