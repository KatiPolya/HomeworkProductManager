import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

public class ProductRepositoryTest {
    Product product1 = new Product (14,"носки", 120);
    Product product2 = new Product (15,"сумка", 500);
    Product product3 = new Product (16,"очки", 120);
    Product product4 = new Book(17, "Война и мир", 300,"Толстой");
    Product product5 = new Smartphone(45, "Nokia", 4000);



    @Test
    public void testSave() {
        ProductRepository repo = new ProductRepository();
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        repo.save(product4);
        repo.save(product5);

        Product[] expected = {product1, product2, product3, product4, product5};
        Product[] actual = repo.getProducts();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveByID() {
        ProductRepository repo = new ProductRepository();
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        repo.save(product4);
        repo.save(product5);
        repo.removeById(product3.getId());

        Product[] expected = {product1, product2, product4, product5};
        Product[] actual = repo.getProducts();

        Assertions.assertArrayEquals(expected, actual);
    }
}
