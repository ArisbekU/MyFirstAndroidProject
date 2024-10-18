package ZooMarket

class Husky(
    override val weight: Double,
    override val age: Int,
    override val biteType: String
) : Dog{
    fun voice(){
        println("Гав!")
    }
}


