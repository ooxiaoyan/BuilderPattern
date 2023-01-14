// 角色类
class Actor {
    var type: String? = null
    var sex: String? = null
    var face: String? = null
    var costume: String? = null
    var hairStyle: String? = null

    override fun toString(): String {
        return "sex: $sex" +
                "\nface: $face" +
                "\ncostume: $costume" +
                "\nhairStyle: $hairStyle"
    }
}