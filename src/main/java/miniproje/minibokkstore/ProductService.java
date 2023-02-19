package miniproje.minibokkstore;
//2-product islemleri icin standart
public interface ProductService {
    void processMenu();
    void listProduct();
    void addProduct();
    void deleteProduct();
    void filterProduct(String filter);
}
