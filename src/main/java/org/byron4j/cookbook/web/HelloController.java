package org.byron4j.cookbook.web;

import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * http://localhost:8080/hello?name=oyy will return "{"oyy":"Hello"}" to the page
     * @param name
     * @return
     */
    @RequestMapping("/hello")
    public String sayHello(@RequestParam  String name){
        JSONObject obj = new JSONObject();
        obj.put(name, "Hello");
        return obj.toString();
    }
}
