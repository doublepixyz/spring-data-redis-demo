/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz.doublepi.cqrs.demo.redis.service;

import xyz.doublepi.cqrs.demo.redis.model.Download;
import java.util.List;

/**
 *
 * @author pi314
 */
public interface DownloadQueryService {

    List<Download> findAll();

    Long countByAppId(Long appId);
}
