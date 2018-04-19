package cn.itbat.whh.datasync.manager.impl;

import com.whh.common.mybatis.base.BaseManagerImpl;
import cn.itbat.whh.datasync.dao.mapper.AmAppkeyDOMapper;
import cn.itbat.whh.datasync.model.AmAppkey;
import cn.itbat.whh.datasync.dao.model.AmAppkeyDO;
import cn.itbat.whh.datasync.dao.model.AmAppkeyDOExample;
import cn.itbat.whh.datasync.manager.AmAppkeyManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AmAppkeyManagerImpl
*  on 2018/4/19.
*/
@Service
@Transactional
public class AmAppkeyManagerImpl extends BaseManagerImpl<AmAppkeyDOMapper, AmAppkey, AmAppkeyDO, AmAppkeyDOExample> implements AmAppkeyManager {

    private static Logger _log = LoggerFactory.getLogger(AmAppkeyManagerImpl.class);

    @Autowired
    AmAppkeyDOMapper amAppkeyDOMapper;

    @Override
    public AmAppkeyDOMapper getMapper() {
        return amAppkeyDOMapper;
    }
}