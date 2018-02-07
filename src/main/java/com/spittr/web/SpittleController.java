package com.spittr.web;

import com.spittr.dao.SpittleRepository;
import com.spittr.domain.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by liqiang28 on 2018/2/7.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    @Autowired
    private SpittleRepository spittleRepository;

    @RequestMapping(method= RequestMethod.GET)
    public List<Spittle> spittles(@RequestParam(value="max", defaultValue="" + Long.MAX_VALUE) long max,
                                  @RequestParam(value="count", defaultValue = "20") int count) {

        return spittleRepository.findSpittles(max, count);
    }

//    public String spittles(Model model) {
//
//        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
//
//        return "spittles";
//    }

}




















