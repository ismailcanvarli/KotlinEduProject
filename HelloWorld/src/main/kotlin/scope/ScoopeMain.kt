//Created by canVarli on 7/25/2024.

package org.example.scope

// bunlar bir Higher order function'dır.
fun main() {
    val name: String = "asd"

    // T= Önüne gelen değer, R= Son satır
    //Buradaki it parametrenin kendisidir.
    // Bu bloktaki son yazılan kod geri dönüş tipi olur.
    val retrunValueLet = name?.let { it ->
        println("let $name")
    }
    println(retrunValueLet)

    val retrunValueRun = name?.run {
        println("run $this")
    }
    println(retrunValueRun)

    val returnValueRun2 = run {
        println("run ")
    }
    println(returnValueRun2)

    // 2 paramtre var. Birisi name birisi hof body'si.
    // buna örnek repeat(10){println("asd")}
    val returnValueWith = with(name) {
        println("with $this")
    }
    println(returnValueWith)

    val returnValueApply = name?.apply {
        println("apply $this")
    }
    println(returnValueApply)

    val returnValueAlso = name?.also {
        println("also")
    }
    println(returnValueAlso)
    
}