package cn.murphy.entity;

import lombok.Data;

import java.util.Date;

/**
 * 支付数据信息
 */
@Data
public class PayInfo {

    private String payNo;

    private String orderNo;

    private String userName;

    private Date payTime;
}
