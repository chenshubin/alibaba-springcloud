package cn.murphy.entity;

import lombok.Data;

import java.util.Date;

/**
 * 订单数据信息
 */
@Data
public class OrderInfo {

    private String orderNo;

    private String userName;

    private Date createDt;

    private String productNo;

    private Integer productCount;

}
