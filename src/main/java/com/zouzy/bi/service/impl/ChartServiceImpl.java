package com.zouzy.bi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zouzy.bi.model.entity.Chart;
import com.zouzy.bi.service.ChartService;
import com.zouzy.bi.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author zouzhenyu
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-12-17 10:36:55
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




