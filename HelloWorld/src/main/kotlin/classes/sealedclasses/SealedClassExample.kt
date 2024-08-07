//Created by canVarli on 8/7/2024.

package org.example.classes.sealedclasses

sealed class Animal {
    class Dog : Animal()
    class Cat : Animal()
    object Fish : Animal()
}

// When expression tür kontrolü yapmak için kullanıldı
fun handleAnimal(animal: Animal) = when (animal) {
    is Animal.Dog -> println("Dog")
    is Animal.Cat -> println("Cat")
    Animal.Fish -> println("Fish")
}

fun main() {
    val dog = Animal.Dog()
    val cat = Animal.Cat()
    val fish = Animal.Fish

    handleAnimal(dog)
    handleAnimal(cat)
    handleAnimal(fish)
}