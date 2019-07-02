package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/gjy")
public class UserController {
    @Autowired
    UserMapper userMapper;
    //显示登录页面
    @RequestMapping("/login")
    public String showLogin(){
        return "home/login";
    }
    //显示注册页面
    @RequestMapping("/register")
    public String showRegister(){
        return "home/register";
    }

    //显示主页
    @RequestMapping("/home")
    public String showHome(){
        return "home/home";
    }

    //显示搜索页
    @RequestMapping("/search")
    public String showSearch(){
        return "home/search";
    }

    //显示详情介绍页
    @RequestMapping("/introduction")
    public String showIntroduction(){
        return "home/introduction";
    }

    //显示购物车页
    @RequestMapping("/shopcart")
    public String showShopcart(){
        return "home/shopcart";
    }

    //显示个人中心
    @RequestMapping("/index")
    public String showIndex(){
        return "person/index";
    }

    //显示个人信息页
    @RequestMapping("/information")
    public String showInformation(){
        return "person/information";
    }

    //显示安全设置页
    @RequestMapping("/safety")
    public String showSafety(){
        return "person/safety";
    }

    //显示收货地址页
    @RequestMapping("/address")
    public String showAddress(){
        return "person/address";
    }

    //显示订单管理
    @RequestMapping("/order")
    public String showOrder(){
        return "person/order";
    }

    //显示退换货管理
    @RequestMapping("/change")
    public String showChange(){
        return "person/change";
    }

    //显示优惠券
    @RequestMapping("/coupon")
    public String showCoupon(){
        return "person/coupon";
    }

    //显示红包
    @RequestMapping("/bonus")
    public String showBonus(){
        return "person/bonus";
    }

    //显示账单明细
    @RequestMapping("/bill")
    public String showBill(){
        return "person/bill";
    }

    //显示收藏页
    @RequestMapping("/collection")
    public String showCollection(){
        return "person/collection";
    }

    //显示足迹
    @RequestMapping("/foot")
    public String showFoot(){
        return "person/foot";
    }

    //显示评论
    @RequestMapping("/comment")
    public String showComment(){
        return "person/comment";
    }

    //显示消息
    @RequestMapping("/news")
    public String showNews(){
        return "person/news";
    }

    //结算页面
    @RequestMapping("/pay")
    public String showPay(){
        return "home/pay";
    }

    //付款成功页面
    @RequestMapping("/success")
    public String showSuccess(){
        return "home/success";
    }

    //管理员-商品列表页面
    @RequestMapping("/manager")
    public String showManager(){
        return "manage/manager";
    }

    //管理员-订单列表页面
    @RequestMapping("/orderlist")
    public String showOrderlist(){
        return "manage/orderlist";
    }

    //管理员-添加新商品页面
    @RequestMapping("/addware")
    public String showAddware(){
        return "manage/addware";
    }
}
