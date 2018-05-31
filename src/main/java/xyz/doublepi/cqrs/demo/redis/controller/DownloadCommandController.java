package xyz.doublepi.cqrs.demo.redis.controller;

import xyz.doublepi.cqrs.demo.redis.model.Download;
import xyz.doublepi.cqrs.demo.redis.service.DownloadCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class DownloadCommandController {

    @Autowired
    private DownloadCommandService downloadCommandService;

    @PostMapping("/downloads")
    public Download create(@RequestBody Download download) {
        return downloadCommandService.add(download);
    }
}
