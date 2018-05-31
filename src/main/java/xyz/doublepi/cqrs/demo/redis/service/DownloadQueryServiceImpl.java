/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz.doublepi.cqrs.demo.redis.service;

import xyz.doublepi.cqrs.demo.redis.model.Download;
import xyz.doublepi.cqrs.demo.redis.repository.DownloadQueryRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pi314
 */
@Service
public class DownloadQueryServiceImpl implements DownloadQueryService {

    @Autowired
    private DownloadQueryRepository downloadQueryRepository;

    @Override
    public List<Download> findAll() {
        List<Download> downloads = new ArrayList<>();
        downloadQueryRepository.findAll().forEach(downloads::add);
        return downloads;
    }

    @Override
    public Long countByAppId(Long appId) {
        Optional<Download> o = downloadQueryRepository.findById(appId);
        if (o.isPresent()) {
            return o.get().getDownloadCount();
        } else {
            return 0L;
        }
    }

}
