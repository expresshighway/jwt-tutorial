package me.expresshighway.jwttutorial.dto;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TokenDto {
    private String token;

    public void setToken(String token) {
        this.token = token;
    }
}