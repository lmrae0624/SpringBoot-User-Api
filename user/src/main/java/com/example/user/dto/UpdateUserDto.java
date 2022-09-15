package com.example.user.dto;

import com.example.user.domain.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserDto {

    @Size(min=8, message = "비밀번호를 8자 이상 입력해주세요")
    @ApiModelProperty(example = "password123")
    private String password; //비밀번호

    @Size(min=2, message = "이름을 2자 이상으로 입력해주세요")
    @ApiModelProperty(example = "홍길동")
    private String name;    //이름

    @ApiModelProperty(example = "20220728")
    private Date birth;   //생년월일


    public User toEntity() {
        return User.builder()
                .password(password)
                .name(name)
                .birth(birth)
                .build();
    }
}
