package xyz.doublepi.cqrs.demo.redis.controller;

import xyz.doublepi.cqrs.demo.redis.model.Download;
import xyz.doublepi.cqrs.demo.redis.service.DownloadQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class DownloadQueryController {

    @Autowired
    private DownloadQueryService downloadQueryService;

    @GetMapping("/downloads")
    public List<Download> findAll() {
        return downloadQueryService.findAll();
    }

    @GetMapping("/downloads/count/{app_id}")
    @ResponseBody
    public Long countByAppId(@PathVariable("app_id") Long appId) {
        return downloadQueryService.countByAppId(appId);
    }

}
