package cn.edu.abtu.srs.search.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/test")
    public Map myTest(){
        Map<String,String> map = new LinkedHashMap<>();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");

        return map;
    }
}
