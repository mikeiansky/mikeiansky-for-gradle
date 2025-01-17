package io.github.mikeiansky.gradle;

import com.alibaba.fastjson2.JSON;
import lombok.Data;

/**
 * @author mike ian
 * @date 2025/1/17
 * @desc
 **/
public class FirstGradleDemo {

    @Data
    public static class One {
        private String tag;
    }

    public static void main(String[] args) {
        System.out.println("hello gradle ... ");
        One one = new One();
        one.tag = "first";
        System.out.println(JSON.toJSONString(one));
        System.out.println(one.getTag());
    }

}
