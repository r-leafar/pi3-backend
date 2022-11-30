package br.com.pi3.API.dto;

import br.com.pi3.API.entity.PessoaEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginAuthDto {

    private String email;
    private String senha;


}
