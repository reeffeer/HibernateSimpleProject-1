package model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "auto")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    @Column(name = "model")
    private String model;
    private String color;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private User user;

    public Auto(String model, String color) {
        this.model = model;
        this.color = color;
    }
}
