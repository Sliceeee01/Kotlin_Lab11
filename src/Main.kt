//fun main() {
//    println("Программа запущена")
//    println("Проверяем состояние, но не трогаем GameSession")
//    println("Теперь запускаем игру")
//    GameSession.start()
//    println("Проверяем состояние ещё раз")
//    println("Активна ли сессия: ${GameSession.isActive}")}


//fun main() {
//    Logger.log("Первое сообщение")
//    Logger.log("Второе сообщение")
//    val logger1 = Logger
//    val logger2 = Logger
//    println(logger1 === logger2)}

//fun main() {
//    println(Colors.RED)
//    println(Colors.GREEN)
//    println(Colors.BLUE)
//}
//

//fun main() {
//    val handler = object {
//        val name = "Обработчик"
//        fun handle() {
//            println("Обрабатываю...")
//        }
//    }
//    println(handler.name)
//    handler.handle()
//}

//fun main() {
//    MyCar(model = "Toyota")
//    MyCar(model = "BMW")
//    TrafficController.carPassed()}

//fun main() {
//    val success = NetworkResult.Success("Данные получены")
//    val error = NetworkResult.Error("Сервер не отвечает", 500)
//    val loading = NetworkResult.Loading
//
//    handleResult(success)
//    handleResult(error)
//    handleResult(loading)
//}

fun main() {
    handleOrder (status = OrderStatus.Created)
    handleOrder (status = OrderStatus.Paid)
    handleOrder (status = OrderStatus. Shipped)
    handleOrder(status = OrderStatus.Cancelled (reason = "Нет товара на складе"))
}