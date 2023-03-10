package kr.co.kmarket2.controller;

import java.net.URLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
 * 날짜: 2023/02/15
 * 이름: 김지홍
 * 내용: 외부폴더에서 이미지를 불러오는 Controller 
 * 		 path 는 상품등록일에 따라 생성되도록 할 예정
 * 		 MvcConfig 파일 생성으로 삭제 예정
 */

@RestController
public class ImageController {
    
//    @Autowired
//    private ResourceLoader resourceLoader;
//    
//    @GetMapping("/images/{path}/{filename:.+}")
//    public ResponseEntity<Resource> getImage(@PathVariable("filename") String filename, @PathVariable("path") String path) {
//        Resource image = resourceLoader.getResource("file:file/" + path + "/" + filename);
//        
//        if (image.exists() && image.isReadable()) {
//            String contentType = URLConnection.guessContentTypeFromName(filename);
//            if (contentType == null) {
//                contentType = "application/octet-stream";
//            }
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.parseMediaType(contentType));
//            return new ResponseEntity<>(image, headers, HttpStatus.OK);
//        } else {
//            throw new RuntimeException("Image not found");
//        }
//    }
}
