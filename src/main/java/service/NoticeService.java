package com.example.notice_board.service;

import com.example.notice_board.model.Notice;
import com.example.notice_board.repository.NoticeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {

    private final NoticeRepository repo;

    public NoticeService(NoticeRepository repo) {
        this.repo = repo;
    }

    public Notice addNotice(Notice notice) {
        return repo.save(notice);
    }

    public List<Notice> getAllNotices() {
        return repo.findAll();
    }

    public Notice updateNotice(Long id, Notice notice) {
        notice.setId(id);
        return repo.save(notice);
    }

    public void deleteNotice(Long id) {
        repo.deleteById(id);
    }
}
