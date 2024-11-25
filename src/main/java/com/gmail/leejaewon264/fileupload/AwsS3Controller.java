package com.gmail.leejaewon264.fileupload;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
public class AwsS3Controller {
    //클래스 이름을 적어도 되지만 인터페이스 이름을 기재합니다.
    //인터페이스를 구현하거나 다른 클래스로 상속을 받은 경우
    //상위 타입의 변수에 하위 타입의 인스턴스를 대입할 수 있습니다.
    private final AwsS3Service awsS3Service;

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("category") String category,
                             @RequestPart(value="file")MultipartFile multipartFile){
        return awsS3Service.uploadFile(category, multipartFile);
    }
}

