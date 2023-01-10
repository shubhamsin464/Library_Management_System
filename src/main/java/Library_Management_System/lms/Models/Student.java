package Library_Management_System.lms.Models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String Name;
    @Column(name = "school_email",unique = true,nullable = false)
    private String email;

    private int age;
    @Column(columnDefinition = "varchar(255) default 'India'")
    private String country;

    public Student(String name, String email, int age, String country) {
        Name = name;
        this.email = email;
        this.age = age;
        this.country = country;
    }


    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Card card;

    @UpdateTimestamp
    private Date UpdatedOn;
}
