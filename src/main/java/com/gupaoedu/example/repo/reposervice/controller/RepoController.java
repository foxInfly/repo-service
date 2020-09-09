package com.gupaoedu.example.repo.reposervice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lipu
 * @since : 2020-09-09 20:15
 */
@RestController
public class RepoController {


    /**
     * update repository by id
     * @param pid repo Id
     */
    @PutMapping("/repo/{pid}")
    public void repo(@PathVariable("pid") String pid){
        System.out.println("扣减商品库存："+pid);
    }
}
