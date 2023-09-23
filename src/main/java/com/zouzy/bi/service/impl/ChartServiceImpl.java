package com.zouzy.bi.service.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zouzy.bi.constant.CommonConstant;
import com.zouzy.bi.model.dto.chart.ChartQueryRequest;
import com.zouzy.bi.model.entity.Chart;
import com.zouzy.bi.model.entity.User;
import com.zouzy.bi.model.vo.ChartVO;
import com.zouzy.bi.service.ChartService;
import com.zouzy.bi.mapper.ChartMapper;
import com.zouzy.bi.utils.SqlUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 邹震宇
 * @description 针对表【chart(图表信息表)】的数据库操作Service实现
 * @createDate 2023-09-23 13:51:03
 */
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
        implements ChartService {

    @Override
    public ChartVO getchartVO(Chart chart, HttpServletRequest request) {
        return null;
    }

    @Override
    public Wrapper<Chart> getQueryWrapper(ChartQueryRequest chartQueryRequest) {
        LambdaQueryWrapper<Chart> queryWrapper = new LambdaQueryWrapper<>();
        if (chartQueryRequest == null) {
            return queryWrapper;
        }
        Long id = chartQueryRequest.getId();
        String goal = chartQueryRequest.getGoal();
        String chartType = chartQueryRequest.getChartType();
        Long userId = chartQueryRequest.getUserId();
        String sortField = chartQueryRequest.getSortField();
        String sortOrder = chartQueryRequest.getSortOrder();
        queryWrapper.eq(id > 0, Chart::getId, id)
                .eq(StrUtil.isNotBlank(goal), Chart::getGoal, goal)
                .eq(StrUtil.isNotBlank(chartType), Chart::getChartType, chartType)
                .eq(ObjectUtil.isNotEmpty(userId), Chart::getUserId, userId)
                .orderBy(SqlUtils.validSortField(sortField), sortOrder.equals(CommonConstant.SORT_ORDER_ASC), Chart::getId);
        return queryWrapper;
    }

    @Override
    public Page<ChartVO> getchartVOPage(Page<Chart> chartPage, HttpServletRequest request) {
        return null;
    }
}




