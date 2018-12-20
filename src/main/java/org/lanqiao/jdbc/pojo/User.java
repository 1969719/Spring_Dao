package org.lanqiao.jdbc.pojo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode
public class User {
    private int id;
    private String username;
    private int age;
    private String gender;
    private String email;
}
