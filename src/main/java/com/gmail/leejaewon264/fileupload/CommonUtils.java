package com.gmail.leejaewon264.fileupload;

public class CommonUtils {
    private static final String FILE_EXTENSION_SEPARATOR = ".";
    private static final String CATEGORY_PREFIX= "/";
    private static final String TIME_SEPARATOR = "_";

    public static String buildFileName(String category, String originalFileName){
        //원본 파일 경로에서 .의 마지막 위치를 찾아냅니다.
        int FileExtensionIndex = originalFileName.lastIndexOf(FILE_EXTENSION_SEPARATOR);
        //파일의 확장자 추출
        String fileExtension = originalFileName.substring(FileExtensionIndex);
        //파일 이름 추출
        String fileName = originalFileName.substring(0, FileExtensionIndex);
        //현재 시간 추출
        String now = String.valueOf(System.currentTimeMillis());
        //동일한 파일이름을 만들지 않기 위해서 중간에 현재 시간을 추가
        //파일이름이 키가 돼서 저장되기 때문에 중복된 파일 이름이 있으면 뒤의 파일이 업데이트 됨
        return category + CATEGORY_PREFIX + fileName + TIME_SEPARATOR + now  + fileExtension;
    }

}
