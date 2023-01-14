// 天使角色建造器：具体建造者
class AngelBuilder: ActorBuilder() {

    override fun setType() {
        actor.type = "天使"
    }

    override fun setSex() {
        actor.sex = "女"
    }

    override fun setFace() {
        actor.face = "美丽"
    }

    override fun setCostume() {
        actor.costume = "白裙"
    }

    override fun setHairStyle() {
        actor.hairStyle = "披肩长发"
    }
}