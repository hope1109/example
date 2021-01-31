package com.hope.days;

import com.hope.days.pojo.Address;
import com.hope.days.pojo.City;
import com.hope.days.pojo.Customer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * java的Optional,做非空处理，省去if的处理，只要目的是避免java中的空指针异常
 */
public class Test210101 {
    //平时做的非空校验
    public  void getTa(Map<String,String> params){
        Map<String,String> map = params;
        if(map == null){
            map = new HashMap<>();
        }
    }
    //Optional 做非处理
    public void getTaNo(Map<String,String> params){
        Map<String,String> map = Optional.ofNullable(params).orElse(new HashMap<>());
    }

    //复杂点的例子，假如我们需要的数据层次比较深
    Customer customer = new Customer();
    String cityCode = customer.getAddress().getCity().getCityCode().substring(0,3);
    //以上获取是不合理的，因为其中的某一环，可能是空 ，会抛出空指针，所以，我们需要一层层的进行判断
    public void getCityCode(Customer customer){
        String cityCode = "000";
        if(customer != null){
            Address address = customer.getAddress();
            if(address != null){
                City city = address.getCity();
                if(city != null){
                    String code  = city.getCityCode();
                    if(code != null && code.length() >= 3){
                        cityCode = code.substring(0,3);
                    }
                }
            }
        }
        System.out.println(cityCode);
    }


    //使用Optional的lambda语法，可以把代码改成下面这样

    public void getCityCode1(Customer customer){
        String cityCode = Optional.ofNullable(customer)
                .map(c -> c.getAddress())
                .map(a ->a.getCity())
                .map(b ->b.getCityCode())
                .filter(s -> s.length() >= 3)
                .map(t -> t.substring(0,3))
                .orElse("000");
    }
}
