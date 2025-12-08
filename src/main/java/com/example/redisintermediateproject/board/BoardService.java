package com.example.redisintermediateproject.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public void increaseViewCountDB(Long id) {
        // DB를 직접 때리는 로직
        Board board = boardRepository.findById(id).orElseThrow();
        board.updateViewCount(board.getViewCount() + 1);
    }
}