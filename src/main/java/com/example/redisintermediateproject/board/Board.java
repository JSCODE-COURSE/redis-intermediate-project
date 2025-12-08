package com.example.redisintermediateproject.board;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private long viewCount = 0L;

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void updateViewCount(long viewCount) {
        this.viewCount = viewCount;
    }
}