package com.example.kakao._core.utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.example.kakao._core.errors.exception.Exception400;


public class ImageUtils {

    public static String updateImage(MultipartFile photo, String imageFolder) {

        // 사진 파일이 업로드되지 않아도 MultipartFile 객체 자체는 생성된다. null로는 체크 못함
        if (photo == null || photo.getSize() == 0) { 
            System.out.println("!!!테스트 사진파일없음");
            // return null;
            throw new Exception400("!!!사진이없는데");
        }

        UUID uuid = UUID.randomUUID(); // 랜덤한 해시값을 만들어줌
        String fileName = uuid + "_" + photo.getOriginalFilename();
        System.out.println("테스트fileName "+fileName);

        Path filePath = Paths.get("./images/" + imageFolder + fileName);

        try {
            Files.write(filePath, photo.getBytes());
        } catch (Exception e) {
            throw new Exception400("사진등록중오류");
        }
        System.out.println("테스트 사진등록성공");

        return fileName;
    }



}
