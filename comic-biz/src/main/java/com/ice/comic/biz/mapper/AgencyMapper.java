package com.ice.comic.biz.mapper;


import com.ice.comic.common.model.Agency;
import com.ice.comic.common.model.User;
import com.ice.comic.common.page.PageParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AgencyMapper {
  
    List<Agency> select(Agency agency);

    int insert(Agency agency);

    List<User>	selectAgent(@Param("user") User user, @Param("pageParams") PageParams pageParams);

	Long selectAgentCount(@Param("user") User user);

}
