//Created by canVarli on 7/23/2024.

package org.example.testquestion.generics.box

/**
 * Soru:
 * Bir Box sınıfı yazmanızı istiyoruz.
 * Bu sınıf, içinde herhangi bir türde öğe tutabilmelidir.
 * Ayrıca, bu sınıf iki metod içermelidir:
 *
 * getItem: Kutunun içindeki öğeyi döndürmelidir.
 * setItem: Kutunun içine yeni bir öğe koymalıdır.
 * Ek olarak, Box sınıfının bir alt sınıfı olan ColorBox sınıfını yazın.
 * ColorBox sınıfı, bir rengin (String) kutusunu tutmak için kullanılacaktır
 * ve getColor isimli ek bir metod içermelidir. Bu metod, kutunun rengini döndürmelidir.
 */

open class Box<T> {
    private var item: T? = null

    fun getItem(): T? {
        return item
    }

    fun setItem(item: T) {
        this.item = item
    }
}

class ColorBox : Box<String>() {
    fun getColor(): String {
        return "Color of the box is ${getItem()}"
    }
}

fun main() {
    val box = Box<Int>()
    box.setItem(123)
    println(box.getItem())  // Çıktı: 123

    val colorBox = ColorBox()
    colorBox.setItem("Red")
    println(colorBox.getItem())  // Çıktı: Red
    println(colorBox.getColor()) // Çıktı: Color of the box is Red
}