import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class PerformActions {
    public static void main(String[] args) {

        Consumer<Product> expireProduct = (p) -> p.setBestBefore(LocalDate.now());
        Consumer<Product> discountProduct = (p) -> p.setDiscount(BigDecimal.valueOf(0.1));

        List<Product> list = Product.getProducts();

        list.stream()
                .map((Product p) -> p.getPrice().doubleValue())
                .filter((Double p) -> p > 2)
                .forEach((Double p) -> System.out.println(p * 0.9));

        System.out.println("可用 CPU 核心數：" +
                Runtime.getRuntime().availableProcessors());

        IntStream i = IntStream.rangeClosed(1, 96);
        i
                .parallel()
                .forEach(System.out::println);

        list.stream().peek(expireProduct)
                .filter(p -> p.getPrice().compareTo(BigDecimal.valueOf(2)) < 0)
                .forEach(discountProduct);
    }
}
