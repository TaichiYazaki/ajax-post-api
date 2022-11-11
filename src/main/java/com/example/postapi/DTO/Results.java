package com.example.postapi.DTO;

import lombok.Data;

@Data
public class Results {

    

    /*都道府県 */
    private String address1;

    /*市区町村 */
    private String address2;

    /*字 */
    private String address3;

    /*都道府県カナ */
    private String kana1;

    /*市町村カナ */
    private String kana2;

    /*字 */
    private String Kana3;

    /*都道府県コード */
    private String prefcode;

    /*郵便番号 */
    private String zipcode;

}
