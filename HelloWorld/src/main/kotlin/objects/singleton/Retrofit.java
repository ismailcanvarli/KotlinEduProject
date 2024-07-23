//Created by canVarli on 7/22/2024.

package objects.singleton;

/**
 * Kullandığımız tüm constructor'ları private yaparak dışarıdan erişimi engelledik.
 * Sadece getInstance() metodu ile nesne oluşturulabilir.
 * Bu sayede sadece 1 tane nesne oluşturulabilir.
 */
class Retrofit {

    private static Retrofit newInstance;
    // Volatile anahtar kelimesi ile değişkenin değeri her zaman bellekte güncel kalır.
    // Bu sayede farklı thread'lerin bu değeri aynı anda bilmesini sağlarız.
    // private volatile static Retrofit newInstance;

    private final String baseUrl = "https://www.google.com";

    // Constructor'u private yaparak dışarıdan erişimi engelledik.
    private Retrofit() {
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Eğer newInstance null ise yeni bir Retrofit nesnesi oluşturup döndürür.
     * Eğer newInstance null değilse zaten oluşturulmuş olan nesneyi döndürür.
     * Synchronized anahtar kelimesi ile aynı anda sadece
     * 1 thread'in bu metodu çalıştırmasını sağladık.
     */
    public synchronized static Retrofit getNewInstance() {
        if (newInstance == null) {
            newInstance = new Retrofit();
        }
        return newInstance;
    }

}
