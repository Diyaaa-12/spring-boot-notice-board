package com.example.notice_board.repository;

import com.example.notice_board.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
