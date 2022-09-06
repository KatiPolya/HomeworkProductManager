import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;

public class ProductManagerTest {
    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product product1 = new Product (14,"носки женские", 120);
    Product product2 = new Product (15,"сумка", 500);
    Product product3 = new Product (16,"очки", 120);
    Product product4 = new Book(17, "Война и мир", 300,"Толстой");
    Product product5 = new Smartphone(45, "Nokia", 4000);
    Product product6 = new Product (14,"носки мужские", 120);


    @BeforeEach
    public void setUp() {
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);
        manager.add(product5);
        manager.add(product6);
    }

    @Test
   public void shouldSearchByName1 () {

        Product[] expected = { product4 };
        Product[] actual = manager.searchBy("мир");
        ;

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldSearchByName2 () {

        Product[] expected = { product1, product6 };
        Product[] actual = manager.searchBy("носки");
        ;

        Assertions.assertArrayEquals(expected, actual);

    }


}
