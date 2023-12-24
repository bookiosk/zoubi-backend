package com.zouzy.bi.mapper;

import com.zouzy.bi.model.entity.Chart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @author zouzhenyu
* @description 针对表【chart(图表信息表)】的数据库操作Mapper
* @createDate 2023-12-17 10:36:55
* @Entity com.zouzy.bi.model.entity.Chart
*/
public interface ChartMapper extends BaseMapper<Chart> {


    List<Map<String, Object>> queryChartData(@Param("querySql") String querySql);
}




