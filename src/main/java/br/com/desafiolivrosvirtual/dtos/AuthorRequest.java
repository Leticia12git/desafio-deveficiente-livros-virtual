package br.com.desafiolivrosvirtual.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotBlank
    private String name;
    @Email
    private String email;
    @NotBlank
    @Column( length = 400)
    private String description;
    private LocalDateTime dateRegister;
}
