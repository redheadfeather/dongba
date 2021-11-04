package com.zl.dongba.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZhuLing
 * @date 2021/11/4 - 18:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class PagedResult<T> implements Serializable {

    private static final long serialVersionUID = -9110526893822191075L;
    private Integer state;
    private String message;
    private List<T> data;
    private PageStat pageStat;
}
