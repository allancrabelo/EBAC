import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilterWomenTest {

    @Test
    void testFinalListContainsOnlyWomen() {
        List<Person> people = Arrays.asList(
            new Person("Joao", "M"),
            new Person("Maria", "F"),
            new Person("Ana", "F"),
            new Person("Pedro", "M")
        );

        // Usa o método do programa para filtrar mulheres
        List<Person> women = FilterWomen.filterWomen(people);

        // Verifica se todos os elementos da lista final são mulheres
        assertTrue(women.stream().allMatch(p -> p.getGender().equals("F")),
                   "The final list contains only women");
    }
}
