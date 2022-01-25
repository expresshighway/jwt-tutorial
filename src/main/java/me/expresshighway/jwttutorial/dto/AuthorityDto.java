package me.expresshighway.jwttutorial.dto;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorityDto {
    private String authorityName;

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }
}