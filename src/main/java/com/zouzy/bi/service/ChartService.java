package com.zouzy.bi.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zouzy.bi.model.dto.chart.ChartQueryRequest;
import com.zouzy.bi.model.entity.Chart;
import com.zouzy.bi.model.vo.ChartVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author 邹震宇
* @description 针对表【chart(图表信息表)】的数据库操作Service
* @createDate 2023-09-23 13:51:03
*/
public interface ChartService extends IService<Chart> {

    ChartVO getchartVO(Chart chart, HttpServletRequest request);

    Wrapper<Chart> getQueryWrapper(ChartQueryRequest chartQueryRequest);

    Page<ChartVO> getchartVOPage(Page<Chart> chartPage, HttpServletRequest request);
}
