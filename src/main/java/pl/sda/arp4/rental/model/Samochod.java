package pl.sda.arp4.rental.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Samochod {
    // dla identyfikacji pojazdu
    private String numerRejestracyjny;

    // dla filtrowania obiektów
    private SkrzyniaBiegow skrzynia;
    private TypNadwozia typ;

    // dla sprawdzenia dostępności
    @EqualsAndHashCode.Exclude
    private StatusSamochodu status;
}
