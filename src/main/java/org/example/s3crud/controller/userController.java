package org.example.s3crud.controller;


import org.example.s3crud.service.S3Util;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class userController {


    @PostMapping("/fileupload")
    public ResponseEntity<Map<String,String>> upload(@RequestParam("file") MultipartFile multipart,@RequestParam Map<String,Object> userMap){
        String fileName = multipart.getOriginalFilename();
        String message = "";
        try {
            message = S3Util.uploadFile(fileName,multipart.getInputStream());
        } catch (Exception ex){
            message = "Error uploading file" + ex.getMessage();
        }

        String firstName = (String) userMap.get("firstName");
        Map<String, String> map = new HashMap<>();
        map.put("firstName", firstName);
        map.put("message", message);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

}
