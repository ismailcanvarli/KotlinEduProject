//Created by canVarli on 7/19/2024.

package org.example.classes.nestedandınnerclass

// Nested kullanım
class RecyclerView {
    val outerName: String = "RecyclerView"

    // Bu sınıf static bir sınıf gibi tutuluyor
    // Üst sınıfın bir member'ı gibi direk erişebiliyoruz.
    class ViewHolder {
        val nestedName: String = "ViewHolder"

        fun getOuterName(): String {
            // return outerName şeklinde olmuyor
            return ""
        }
    }
}

// Inner kullanım: Bu dış class
class RecyclerView2 {
    val outerName: String = "RecyclerView2"

    // Bu final class ve static değil. Bu iç sınıf
    inner class ViewHolder {
        val nestedName: String = "ViewHolder2"

        fun getOuterName(): String {
            return outerName
            // return RecyclerView2().outerName gibi bir işlem yapmış oluyoruz.
        }
    }
}

fun main() {
    val recyclerView = RecyclerView()
    // Viewholder sınıfına direk erişebildik çünkü onun nesnesi static oluşturuluyor.
    val viewHolder = RecyclerView.ViewHolder()

    val recyclerView2 = RecyclerView2()
    //Burada parantez koyarak o sınıfa eriştik.
    val viewHolder2 = RecyclerView2().ViewHolder()
}