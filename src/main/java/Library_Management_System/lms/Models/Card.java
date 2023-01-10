package Library_Management_System.lms.Models;

import Library_Management_System.lms.Enums.CardStatus;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    @OneToOne
    @JoinColumn
    private Student student;
}
