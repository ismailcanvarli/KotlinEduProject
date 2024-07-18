//Created by canVarli on 7/18/2024.

package org.example.testquestion.classes.onlinemarket

import Product
import addProduct
import groupProductsByCategory
import listProductsByCategory
import listProductsByPriceRange

/**
 * Bir çevrimiçi mağaza için ürün kategorilerini yönetiyorsunuz
 * ve ürünleri temsil etmek için bir Product adlı sınıf ve
 * ürün kategorilerini temsil etmek için bir enum class oluşturmanız
 * gerekiyor. Bu sınıf ve enum aşağıdaki özelliklere sahip olmalıdır:
 *
 * Category adlı bir enum class oluşturun.
 * Kategoriler: ELECTRONICS, CLOTHING, FOOD, BOOKS
 * Product adlı bir sınıf oluşturun ve aşağıdaki özelliklere sahip olmasını sağlayın:
 * name: Ürünün adı (String)
 * price: Ürünün fiyatı (Double)
 * category: Ürünün kategorisi (Category enum'undan)
 *
 * Ürün eklemek için bir fonksiyon yazın.
 * Belirli bir kategorideki ürünleri listeleyen bir fonksiyon yazın.
 * Belirli bir fiyat aralığındaki ürünleri listeleyen bir fonksiyon yazın.
 * Kategorilere göre ürünleri gruplandıran bir fonksiyon yazın.
 */


fun main() {
    // Ürünleri ekleyin
    println(addProduct(Product("Laptop", 1200.0, Category.ELECTRONICS)))
    println(addProduct(Product("T-shirt", 25.0, Category.CLOTHING)))
    println(addProduct(Product("Apple", 2.0, Category.FOOD)))
    println(addProduct(Product("Book on Kotlin", 35.0, Category.BOOKS)))
    println(addProduct(Product("Smartphone", 800.0, Category.ELECTRONICS)))

    // Belirli bir kategorideki ürünleri listeleyin
    val electronics = listProductsByCategory(Category.ELECTRONICS)
    println("Elektronik kategorisindeki ürünler: $electronics")

    // Belirli bir fiyat aralığındaki ürünleri listeleyin
    val affordableProducts = listProductsByPriceRange(20.0, 100.0)
    println("Fiyat aralığı 20 ile 100 arasındaki ürünler: $affordableProducts")

    // Ürünleri kategorilere göre gruplayın
    val groupedByCategory = groupProductsByCategory()
    println("Kategorilere göre gruplandırılmış ürünler: $groupedByCategory")
}
