package universal

// 导演类
class Director {

    private val builder = ConcreteBuilder()

    // 构建不同的产品
    fun getAProduct(): Product {
        builder.setPart()
        return builder.buildProduct()
    }
}