package com.crossevol.demo.mybatiscodegenerator.mapper;

import com.crossevol.demo.mybatiscodegenerator.entity.OrderDetail;
import com.crossevol.demo.mybatiscodegenerator.entity.OrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailMapper {
    long countByExample(OrderDetailExample example);

    int deleteByExample(OrderDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderDetail row);

    int insertSelective(OrderDetail row);

    List<OrderDetail> selectByExample(OrderDetailExample example);

    OrderDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") OrderDetail row, @Param("example") OrderDetailExample example);

    int updateByExample(@Param("row") OrderDetail row, @Param("example") OrderDetailExample example);

    int updateByPrimaryKeySelective(OrderDetail row);

    int updateByPrimaryKey(OrderDetail row);
}