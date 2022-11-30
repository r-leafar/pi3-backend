package br.com.pi3.API.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class LoginSessaoDto {


    private Long idpessoa;
    private String email;
}
