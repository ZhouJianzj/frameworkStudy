package cn.itcast.order.web;

import cn.itcast.order.pojo.Order;
import cn.itcast.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
/*方法一：热加载nacos配置中心中的配置的*/
@RefreshScope
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     *
     * RequestHeader获取请求头中的参数
     * @param orderId
     * @param truth
     * @return
     */
    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId,
                                    @RequestHeader(value = "Truth",required = false) String truth) {

        System.out.println("Truth:" + truth);

        // 根据id查询订单并返回
        return orderService.queryOrderById(orderId);
    }


}
