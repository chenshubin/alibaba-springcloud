package cn.murphy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 *
 * </p>
 *
 * @author Administrator
 * @version V1.0
 * @date 2021/6/24 11:46
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify By: {修改人} 2021/6/24
 * @modify reason: {方法名}:{原因}
 * ...
 */
@SpringBootApplication
@EnableDiscoveryClient
public class D1NacosProduct {
    public static void main(String[] args) {
        SpringApplication.run(D1NacosProduct.class,args);
    }

}
