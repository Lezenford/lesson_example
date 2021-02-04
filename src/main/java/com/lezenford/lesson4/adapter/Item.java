package com.lezenford.lesson4.adapter;

import lombok.Data;

@Data
public class Item  implements RestApiMember{
    private String info;
    @Override
    public String getData() {
        return info;
    }
}
