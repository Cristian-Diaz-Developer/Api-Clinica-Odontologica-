package com.dh.apiDentalClinic.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Optional;


@ToString
@Setter
@Getter
@Entity
@Table(name = "patients")

@JsonIgnoreProperties(value={"hibernateLazyInitializer"})
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String DNI;
   // @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private String admissionsDate;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    @ToString.Exclude
    private Address address;
}
