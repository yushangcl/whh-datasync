package cn.itbat.whh.datasync.manager.impl;

import com.whh.common.mybatis.base.BaseManagerImpl;
import cn.itbat.whh.datasync.dao.mapper.BaDefinedCodeDOMapper;
import cn.itbat.whh.datasync.model.BaDefinedCode;
import cn.itbat.whh.datasync.dao.model.BaDefinedCodeDO;
import cn.itbat.whh.datasync.dao.model.BaDefinedCodeDOExample;
import cn.itbat.whh.datasync.manager.BaDefinedCodeManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* BaDefinedCodeManagerImpl
*  on 2018/4/15.
*/
@Service
@Transactional
public class BaDefinedCodeManagerImpl extends BaseManagerImpl<BaDefinedCodeDOMapper, BaDefinedCode, BaDefinedCodeDO, BaDefinedCodeDOExample> implements BaDefinedCodeManager {

    private static Logger _log = LoggerFactory.getLogger(BaDefinedCodeManagerImpl.class);

    @Autowired
    BaDefinedCodeDOMapper baDefinedCodeDOMapper;

    @Override
    public BaDefinedCodeDOMapper getMapper() {
        return baDefinedCodeDOMapper;
    }
}