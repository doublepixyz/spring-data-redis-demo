/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huawei.ccn.cloudservice.demo.redis.service;

import com.huawei.ccn.cloudservice.demo.redis.model.Download;
import com.huawei.ccn.cloudservice.demo.redis.repository.DownloadCommandRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pi314
 */
@Service
public class DownloadCommandServiceImpl implements DownloadCommandService {

    @Autowired
    private DownloadCommandRepository downloadCommandRepository;

    @Override
    public Download add(Download download) {

        long total;
        Optional<Download> od = downloadCommandRepository.findById(download.getAppId());
        if (od.isPresent()) {
            // existing one
            long count = od.get().getDownloadCount();
            
            // the new count
            total = count + download.getDownloadCount();
        } else {
            // new 
            total = download.getDownloadCount();
        }

        download.setDownloadCount(total);

        // update
        return downloadCommandRepository.save(download);
    }

}
