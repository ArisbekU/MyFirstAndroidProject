package com.example.myapplication.newPackage.PetStore

import ZooMarket.Animal
import ZooMarket.Cat
import ZooMarket.Dog
import ZooMarket.Husky

import ZooMarket.SiameseCat


class PetStore {

    fun identifyAnimal(animal: Animal): String {
        return when (animal) {
            is Dog -> "Это собака породы ${animal::class.simpleName}"
            is Cat -> "Это кошка породы ${animal::class.simpleName}"
            else -> "Неизвестное животное"
        }
    }
}

fun main() {
    val husky = Husky(1.0, 1, "straight")
    val siamese = SiameseCat(1.5, 2, "passive")

    val petStore = PetStore()
    println(petStore.identifyAnimal(husky))
    println(petStore.identifyAnimal(siamese))

}