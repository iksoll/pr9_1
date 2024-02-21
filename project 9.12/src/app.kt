fun main() {
    var ChainsawMan = Seans ( 4, 6, 14, "Человек-Бензопила",120.0)
    ChainsawMan.Info()
    var ChainsawMan2 = OnlineCinema (8.00, "Человек-бензопила", 120.0)
    print("Введите скидку: ")
    var sale1 = readLine()!!.toDouble()
    ChainsawMan2.Setsale(sale1)
    ChainsawMan2.GetInfo()



}