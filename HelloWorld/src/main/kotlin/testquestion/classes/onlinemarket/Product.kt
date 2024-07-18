import org.example.testquestion.classes.onlinemarket.Category

// 2. Product adlı sınıfı oluşturun
class Product(val name: String, val price: Double, val category: Category)

// Ürün listesi
val productList: MutableList<Product> = mutableListOf()

// 3. Ürün eklemek için bir fonksiyon yazın
fun addProduct(product: Product): String {
    productList.add(product)
    return "Ürün başarıyla eklendi: ${product.name}"
}

// 4. Belirli bir kategorideki ürünleri listeleyen bir fonksiyon yazın
fun listProductsByCategory(category: Category): List<Product> {
    return productList.filter { it.category == category }
}

// 5. Belirli bir fiyat aralığındaki ürünleri listeleyen bir fonksiyon yazın
fun listProductsByPriceRange(minPrice: Double, maxPrice: Double): List<Product> {
    return productList.filter { it.price in minPrice..maxPrice }
}

// 6. Kategorilere göre ürünleri gruplandıran bir fonksiyon yazın
fun groupProductsByCategory(): Map<Category, List<Product>> {
    return productList.groupBy { it.category }
}

