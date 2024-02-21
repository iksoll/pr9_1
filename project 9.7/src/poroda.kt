class Poroda (var names: String, var rost: Double ,var okras: String, var character: String, empName:String): Dog(empName) {
    private var weight: Double = readLine()!!.toDouble();
    public fun GetWeight(): Double{
        return weight
    }

    public fun Setweight(weight: Double){
        if (weight<=0){
            println ("Не существует отрицательного веса")
        }
        else{this.weight = weight;}
    }

    fun GetInfo() {
        println("Имя собаки - ${name} ,порода - ${names}, рост - ${rost}, вес - ${weight}, окрас - ${okras}")
        println("характер собаки - ${character}")
    }
}