package universal

// 抽象建造者
abstract class Builder {

    // 设置产品的不同部分，以获得不同的产品
    abstract fun setPart()

    // 建造产品
    abstract fun buildProduct(): Product
}