/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huawei.ccn.cloudservice.demo.redis.service;

import com.huawei.ccn.cloudservice.demo.redis.model.Download;

/**
 *
 * @author pi314
 */
public interface DownloadCommandService {

    Download add(Download download);
}
