package universal

// 具体建造者
class ConcreteBuilder : Builder() {

    private val product = Product()

    // 设置产品零件
    override fun setPart() {
        println("产品类内的逻辑处理")
    }

    // 组建一个产品
    override fun buildProduct(): Product {
        return product
    }
}