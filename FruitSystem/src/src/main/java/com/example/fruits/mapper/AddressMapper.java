package com.example.fruits.mapper;

import com.example.fruits.domain.Address;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface AddressMapper extends Mapper<Address> {
    @Select("select count(*)>0  from t_order join order_item using(o_id) where add_id = #{addId}")
    boolean exists(@Param("addId") Integer addId);
}
