package com.tz.leo.springmvc.vo;

import java.util.List;
import java.util.Map;

/**
 * Author: tz_wl
 * Date: 2020/7/5 21:07
 * Content:
 */
public class CollectionVO {
    private List<String> lists;

    private Map<String,String> maps;


    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }
}
