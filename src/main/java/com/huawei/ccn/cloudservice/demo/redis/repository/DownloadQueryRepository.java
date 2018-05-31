package com.huawei.ccn.cloudservice.demo.redis.repository;

import com.huawei.ccn.cloudservice.demo.redis.model.Download;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DownloadQueryRepository extends CrudRepository<Download, Long> {

}
