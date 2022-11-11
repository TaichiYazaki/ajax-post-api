package com.example.postapi.DTO;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ZipCodeDTO {
    /* エラーメッセージ */
    private String message;

    /* 郵便情報 */
    private List<Results> results;

    /* ステータスコード */
    private Integer status = 200;
}
