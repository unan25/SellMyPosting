package com.smp.sellmyposting.user.domain;

import com.smp.sellmyposting.user.domain.enum_.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
//@Document(collation = "user_")
@Table(name = "user_")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    private String uuid;

    @Column(columnDefinition = "int default 1", nullable = false)
    private int active;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;
}
