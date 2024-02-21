class OnlineCinema(var time: Double, empName:String, empPrice:Double):Cinoteatr(empName,empPrice) {
    private var sale: Double=0.10;
    public fun Getsale(): Double{
        return sale
    }

    public fun Setsale(sale: Double){
        if (sale<0){
            println("Скидка не актуальна")
        }
        else { this.sale =sale;
        price= price * sale }
    }

    override fun GetInfo(){
        println("На фильм *${name}* скидка ${price} р.")
    }
}