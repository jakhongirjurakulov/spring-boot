package com.cleancode.SpringBoot.repository;

import com.cleancode.SpringBoot.domain.FileStorage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage, Long> {
  FileStorage findByHashId(String hashId);
  List<FileStorage> findAllByFileStorageStatus(FileStorageStatus status);
}
