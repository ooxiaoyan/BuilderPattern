// 角色建造器：抽象建造者
abstract class ActorBuilder {

    protected val actor: Actor = Actor()

    abstract fun setType()
    abstract fun setSex()
    abstract fun setFace()
    abstract fun setCostume()
    abstract fun setHairStyle()

    fun build(): Actor {
        return actor
    }
}