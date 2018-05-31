package xyz.doublepi.cqrs.demo.redis.repository;

import xyz.doublepi.cqrs.demo.redis.model.Download;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DownloadCommandRepository extends CrudRepository<Download, Long> {
}
