package cn.itbat.whh.datasync.manager.mock;

import com.whh.common.mybatis.base.BaseManagerMock;
import cn.itbat.whh.datasync.manager.RuOperationLogManager;
import cn.itbat.whh.datasync.model.RuOperationLog;
import cn.itbat.whh.datasync.dao.model.RuOperationLogDOExample;

/**
* RuOperationLogManager
*  on 2018/4/19.
*/
public class RuOperationLogManagerMock extends BaseManagerMock<RuOperationLog, RuOperationLogDOExample> implements RuOperationLogManager {

    @Override
    public Long insertOperationLog(RuOperationLog ruOperationLog) {
        return null;
    }

    @Override
    public Long insertOperationLog(Long relatedUkid, String relatedType, String operationName, Long userId, String remark) {
        return null;
    }

    @Override
    public Long insertOperationLog(Long relatedUkid, String relatedType, String operationName, Long userId, String remark, String logDyn1, String logDyn2) {
        return null;
    }
}
