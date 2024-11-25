package com.gmail.leejaewon264.fileupload;

import org.springframework.web.multipart.MultipartFile;

public interface AwsS3Service {
    public String uploadFile(String category, MultipartFile multipartFile);
}
