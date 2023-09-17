package ru.lebedev.DemoCrud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import ru.lebedev.DemoCrud.enums.Gender;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class PsyUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "user_name", unique = true, nullable = false)
    @Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long")
    private String userName;
    @Size(min = 6, max = 20, message = "Password must be between 6 and 20 characters long")
    private String userPassword;
    @NotBlank(message = "Name is mandatory")
    private String name;
    @NotBlank(message = "Surname is mandatory")
    private String surname;
    @Email(message = "Email is mandatory")
    private String email;
    @NotBlank(message = "PhoneNumber is mandatory")
    private String phoneNumber;
    @NotBlank(message = "Gender is mandatory")
    @Enumerated(EnumType.STRING)
    private Gender gender;
}
