package com.tenco.blog_v1.board;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name="board_tb")
@Getter
@Setter
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;

    // created_at 컬럼과 매핑하며 이 필드는 데이터 저장시 자동으로 설정
    @Column(name="created_at", insertable = false, updatable = false)
    private Timestamp createdAt;
}
