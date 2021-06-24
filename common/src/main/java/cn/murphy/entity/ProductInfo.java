package cn.murphy.entity;

import lombok.Data;

/**
 * 商品数据信息
 */
@Data
public class ProductInfo {

    private String productNo;

    private String productName;

    private String productStore;

    private double productPrice;
}
