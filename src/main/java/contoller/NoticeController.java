package com.example.notice_board.controller;

import com.example.notice_board.model.Notice;
import com.example.notice_board.service.NoticeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notices")
public class NoticeController {

    private final NoticeService service;

    public NoticeController(NoticeService service) {
        this.service = service;
    }

    @PostMapping
    public Notice createNotice(@RequestBody Notice notice) {
        return service.addNotice(notice);
    }

    @GetMapping
    public List<Notice> getNotices() {
        return service.getAllNotices();
    }

    @PutMapping("/{id}")
    public Notice updateNotice(@PathVariable Long id,
                               @RequestBody Notice notice) {
        return service.updateNotice(id, notice);
    }

    @DeleteMapping("/{id}")
    public String deleteNotice(@PathVariable Long id) {
        service.deleteNotice(id);
        return "Notice Deleted Successfully";
    }
}
