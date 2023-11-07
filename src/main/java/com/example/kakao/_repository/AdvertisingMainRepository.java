package com.example.kakao._repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakao._entity.AdvertisingMain;

import org.springframework.data.domain.Sort;

import java.util.List;

public interface AdvertisingMainRepository extends JpaRepository<AdvertisingMain, Integer> {

}
