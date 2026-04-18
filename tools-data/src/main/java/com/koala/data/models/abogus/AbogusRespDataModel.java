package com.koala.data.models.abogus;

import lombok.Data;

import java.io.Serializable;

/**
 * @author koala
 * @version 1.0
 * @date 2023/4/9 11:05
 * @description
 */
@Data
public class AbogusRespDataModel implements Serializable {
    private Integer code;
    private String msg;
    private AbogusDataModel data;
}

