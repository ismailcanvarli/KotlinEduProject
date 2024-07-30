//Created by canVarli on 7/22/2024.

package objects;

/**
 * Singleton Object
 * Bu sınıftan sadece 1 tane nesne oluşturulabilir.
 */

public class SingletonObject {

    public static void main(String[] args) {

        // SingletonObject sınıfından sadece 1 tane nesne oluşturulabilir.
        Retrofit retrofit1 = Retrofit.getNewInstance();
        Retrofit retrofit2 = Retrofit.getNewInstance();

        // İki nesnenin de aynı referansa sahip olup olmadığını kontrol ediyoruz.
        System.out.println(retrofit1 == retrofit2); // true

    }
}
