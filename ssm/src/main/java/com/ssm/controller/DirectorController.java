package com.ssm.controller;

import com.ssm.entry.Director;
import com.ssm.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/director")
public class DirectorController {
    @Autowired
    private DirectorService directorService;

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//
//    }


    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public List<Director> listDirector(){
        return directorService.listDirector();
    }

    @RequestMapping(value = "/selectbyid",method = RequestMethod.POST)
    @ResponseBody
    public Director selecDirectortById(int id){
        return directorService.selectDirectorById(id);
    }

    @RequestMapping(value = "/insertDirector",method = RequestMethod.POST)
    @ResponseBody
    public void insertDirector(Director director){
        directorService.insertDirector(director);
    }


    @RequestMapping(value = "/deleteDirector",method = RequestMethod.POST)
    @ResponseBody
    public void deleteDirectorById(int id){
        directorService.deleteDirector(id);
    }

    @RequestMapping(value = "/updateDirector",method = RequestMethod.POST)
    @ResponseBody
    public void updateDirectorById(Director director){
        directorService.updateDirector(director);
    }

    @RequestMapping(value = "/list1",method = RequestMethod.POST)
    @ResponseBody
    public Map listDirectorAndMovie(){
        Map<String,Object> map = new HashMap<>();
        List<Director> list = new ArrayList<>();
        try {
            list = directorService.listDirectorAndMovie();
            map.put("code",200);
            map.put("msg","success");
            map.put("datalist",list);
            return map;
        }catch (Exception e){
            e.printStackTrace();
            map.put("code",500);
            map.put("msg","fail");
            return map;
        }
    }


    @RequestMapping(value = "/selectbyid2",method = RequestMethod.POST)
    @ResponseBody
    public Director selecDirectortAndMovieById(int id){
        return directorService.selectDirectorAndMovie(id);
    }

    @RequestMapping(value = "/insertDirector1",method = RequestMethod.POST)
    @ResponseBody
    public void insertDirector1(Director director){
        directorService.insertDirectorDate(director);
    }

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    @ResponseBody
    public Map test(HttpServletRequest request) throws UnsupportedEncodingException {
        Map<String,Object> map = new HashMap();
        map.put("url",request.getRequestURI());
        map.put("method",request.getMethod());
        map.put("cookie",request.getCookies());
        return map;
    }

    @RequestMapping(value = "/list2",method = RequestMethod.POST)
    @ResponseBody
    public Map listDate(){
        Map<String,Object> map = new HashMap<>();
        List<Director> list = new ArrayList<>();
        try {
            list = directorService.listDate();
            map.put("code",200);
            map.put("msg","success");
            map.put("datalist",list);
            return map;
        }catch (Exception E){
            map.put("code",500);
            map.put("msg","fail");
            return map;
        }
    }


}
