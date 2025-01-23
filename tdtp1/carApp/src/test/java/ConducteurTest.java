import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConducteurTest {

    private Conducteur driver;

    @BeforeEach
    public void setUp() {
        driver = new Conducteur("John", 20);
    }

    @Test
    public void test_isAdult_send_true() {
        assertThat(driver.isAdult()).isTrue();
    }

    @Test
    public void test_startCar() {
        // GIVEN
        Voiture voiture = new Voiture("Sedan", "Bleu");
        // WHEN
        voiture.startCar(driver);
        // THEN

        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void test_stopCar() {
        // GIVEN
        Voiture voiture = new Voiture("Sedan", "Bleu");
        // WHEN
        voiture.stopCar(driver);
        // THEN
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void test_changeSpeed() {
        //GIVEN
        Voiture voiture = new Voiture("Sedan", "Bleu");
        // WHEN
        voiture.changeSpeed(80, driver);
        // THEN
        assertThat(voiture.getVitesse()).isEqualTo(80);
    }
}
