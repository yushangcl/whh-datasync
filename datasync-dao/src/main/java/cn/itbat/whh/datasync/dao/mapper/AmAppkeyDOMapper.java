package cn.itbat.whh.datasync.dao.mapper;

import cn.itbat.whh.datasync.dao.model.AmAppkeyDO;
import cn.itbat.whh.datasync.dao.model.AmAppkeyDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmAppkeyDOMapper {
    long countByExample(AmAppkeyDOExample example);

    int deleteByExample(AmAppkeyDOExample example);

    int deleteByPrimaryKey(Long appUkid);

    int insert(AmAppkeyDO record);

    int insertSelective(AmAppkeyDO record);

    List<AmAppkeyDO> selectByExample(AmAppkeyDOExample example);

    AmAppkeyDO selectByPrimaryKey(Long appUkid);

    int updateByExampleSelective(@Param("record") AmAppkeyDO record, @Param("example") AmAppkeyDOExample example);

    int updateByExample(@Param("record") AmAppkeyDO record, @Param("example") AmAppkeyDOExample example);

    int updateByPrimaryKeySelective(AmAppkeyDO record);

    int updateByPrimaryKey(AmAppkeyDO record);
}