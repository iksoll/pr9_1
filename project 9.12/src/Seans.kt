class Seans(var seance: Int, var zal: Int, var zriteli: Int, empName: String, empPrice: Double) : Cinoteatr(empName, empPrice) {
    fun Info(){
        println("Фильм: ${name} \n Стоимость: ${price} \nСеанс: ${seance} \nЗал: ${zal} \nКоличество зрителей: ${zriteli}")
    }



}