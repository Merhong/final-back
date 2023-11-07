package com.example.kakao.admin;

/* Admin은 User테이블에서 TypeEnum으로 구분하므로 테이블이 필요없음 */


// import com.example.kakao._entity.enums.UserTypeEnum;
// import lombok.*;
// import org.hibernate.annotations.CreationTimestamp;
// import org.hibernate.annotations.UpdateTimestamp;
//
// import javax.persistence.*;
// import java.sql.Timestamp;
//
// @Getter
// @Setter
// @NoArgsConstructor(access = AccessLevel.PROTECTED)
// @Entity
// @Table(name = "admin_tb")
// public class Admin {
//
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;
//
//     @Column(length = 100, nullable = false, unique = true)
//     private String email; // 인증시 필요한 필드
//
//     @Column(length = 256, nullable = false)
//     private String password;
//
//     @Column(length = 45, nullable = false, unique = true)
//     private String username; // 별명
//
//     @Enumerated(EnumType.STRING)
//     private UserTypeEnum userTypeEnum;
//
//     @CreationTimestamp
//     private Timestamp createdAt;
//
//     @UpdateTimestamp
//     private Timestamp updatedAt;
//
//     @Builder
//     public Admin(int id, String email, String password, String username, UserTypeEnum userTypeEnum, Timestamp createdAt, Timestamp updatedAt) {
//         this.id = id;
//         this.email = email;
//         this.password = password;
//         this.username = username;
//         this.userTypeEnum = userTypeEnum;
//         this.createdAt = createdAt;
//         this.updatedAt = updatedAt;
//     }
// }
