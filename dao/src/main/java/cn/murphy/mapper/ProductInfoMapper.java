package cn.murphy.mapper;


import cn.murphy.entity.ProductInfo;

/**
 * Created by smlz on 2019/11/17.
 */
public interface ProductInfoMapper {

    ProductInfo selectProductInfoById(String productNo);
}
