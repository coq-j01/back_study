package com.study.springboot.dto;

                 // @Controller @Service @Repository
//HTMl입력폼(react.js) <-> DTO <-> DTO <-> DAO(Repo) <-> DAO(Entity) <-> DB테이블
//  join form           JoinDto           IMemberRepo    MemberEntity   member
//  login form          LoginDto

import com.study.springboot.entity.MemberEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberJoinDto {
    //유효성 체크
    @NotNull
    private Long id = Long.valueOf(0L);

    @Size(min=4, max=20, message="아이디는 4자 이상 20자 이하입니다.")
    @NotBlank(message = "null, 빈문자열, 스페이스 문자열 넣을 수 없습니다.")
    private String userId;
    @Size(min=4, max=20, message="암호는 4자 이상 20자 이하입니다.")
    @NotBlank(message = "null, 빈문자열, 스페이스 문자열 넣을 수 없습니다.")
    private String userPw;

    private String userName;
    @NotBlank(message = "null, 빈문자열, 스페이스 문자열 넣을 수 없습니다.")
    @Pattern(regexp="^(ROLE_USER|ROLE_ADMIN)$",
    message="ROLE_USER 또는 ROLE_ADMIN만 입력 가능합니다.")
    private String userRole;
    private String userAddress; //입력폼에는 있고, Member테이블에는 없음
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate joinDate;

    //DTO -> Entity
    public MemberEntity toSaveEntity(){
        return MemberEntity.builder()
                .userId(userId)
                .userPw(userPw)
                .userName(userName)
                .userRole(userRole)
                .joinDate(joinDate)
                .build();
    }
    public MemberEntity toUpdateEntity(){
        return MemberEntity.builder()
                .id(id) //업데이트할 때는 id가 있어야 함
                .userId(userId)
                .userPw(userPw)
                .userName(userName)
                .userRole(userRole)
                .joinDate(joinDate)
                .build();
    }

}
