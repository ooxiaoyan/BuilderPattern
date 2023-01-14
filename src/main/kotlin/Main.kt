import actor.ActorController
import actor.AngelBuilder

// 客户端测试类
fun main(args: Array<String>) {
    val actorController = ActorController()
    val angel = actorController.getActor(AngelBuilder())
    println("${angel.type}的外观：\n$angel")
}