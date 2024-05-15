package com.coro.corobackboard1.user.entity;

import com.coro.corobackboard1.user.service.UserDomain;
import com.coro.corobackboard1.user.service.UserInfo;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;

    private String email;

    public UserDomain toDomain() {
        return new UserDomain(
                id,
                new UserInfo(
                        email,
                        password,
                        name
                )
        );
    }



}
