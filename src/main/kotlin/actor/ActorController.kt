package actor

// 角色创建控制器：导演类
class ActorController {

    fun getActor(actorBuilder: ActorBuilder): Actor {
        actorBuilder.apply {
            setType()
            setSex()
            setFace()
            setCostume()
            setHairStyle()
        }
        return actorBuilder.build()
    }
}