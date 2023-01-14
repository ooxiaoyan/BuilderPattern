package actor

// 英雄角色建造器：具体建造者
class HeroBuilder : ActorBuilder() {

    override fun setType() {
        actor.type = "英雄"
    }

    override fun setSex() {
        actor.sex = "男"
    }

    override fun setFace() {
        actor.face = "帅气"
    }

    override fun setCostume() {
        actor.costume = "盔甲"
    }

    override fun setHairStyle() {
        actor.hairStyle = "短发"
    }
}