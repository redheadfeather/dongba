package com.zl.dongba.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ZhuLing
 * @date 2021/11/4 - 21:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class PageStat implements Serializable {

    private static final long serialVersionUID = 5237296826675290812L;
    private Integer pageCurrent;
    private Integer pageSize;
    private Integer rowCount;
    private Integer pageCount;
}
