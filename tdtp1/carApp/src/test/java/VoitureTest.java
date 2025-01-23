import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class VoitureTest {

    private Voiture voiture;

    @BeforeEach
    public void setUp() {
        voiture = new Voiture("Sedan", "Bleu");
    }

    @Test
    public void test_accelerer_augmente_la_vitesse() {
        // WHEN
        voiture.accelerer();
        // THEN
        assertThat(voiture.getVitesse()).isEqualTo(10);
    }

    @Test
    public void test_ralentir_diminue_la_vitesse() {
        // GIVEN
        voiture.accelerer();
        voiture.ralentir();
        // THEN
        assertThat(voiture.getVitesse()).isEqualTo(0);
    }
}
