package cn.itbat.whh.datasync.model;

import java.io.Serializable;
import java.util.Date;

public class AmAppkey implements Serializable {
    /**
     * appid
     */
    private Long appUkid;

    /**
     * APP名称
     */
    private String appName;

    /**
     * 对应平台
     */
    private Long platformId;

    /**
     * 所有者id
     */
    private Long ownerBuId;

    /**
     * APP类型
     */
    private String appType;

    /**
     * 是否有效：0=失效，1=生效，9=冻结
     */
    private Integer status;

    /**
     * 授权方式:OAUTH2,MUAL
     */
    private String authType;

    /**
     * 对方接口API URL
     */
    private String apiUrl;

    /**
     * APP KEY
     */
    private String appKey;

    /**
     * 密钥
     */
    private String appSecret;

    /**
     * 数据传输的数据格式:XML/JSON
     */
    private String dataFormat;

    /**
     * 数据传输的编码格式:UTF-8/GBK
     */
    private String charset;

    /**
     * 签名加密类型:RSA,MD5,HMAC
     */
    private String signMethod;

    /**
     * 报文是否加密：0=否，1=是
     */
    private Long dataEncrypt;

    /**
     * 报文加密类型:MD5,HMAC
     */
    private String dataEncryptType;

    /**
     * 证书文件路径
     */
    private String authFilePath;

    /**
     * 系统参数格式
     */
    private String sysParamFormat;

    /**
     * 外部账号
     */
    private String platformAccountId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Long createUserId;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private Long updateUserId;

    private static final long serialVersionUID = 1L;

    /**
     * appid
     * @return app_ukid appid
     */
    public Long getAppUkid() {
        return appUkid;
    }

    /**
     * appid
     * @param appUkid appid
     */
    public void setAppUkid(Long appUkid) {
        this.appUkid = appUkid;
    }

    /**
     * APP名称
     * @return app_name APP名称
     */
    public String getAppName() {
        return appName;
    }

    /**
     * APP名称
     * @param appName APP名称
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * 对应平台
     * @return platform_id 对应平台
     */
    public Long getPlatformId() {
        return platformId;
    }

    /**
     * 对应平台
     * @param platformId 对应平台
     */
    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    /**
     * 所有者id
     * @return owner_bu_id 所有者id
     */
    public Long getOwnerBuId() {
        return ownerBuId;
    }

    /**
     * 所有者id
     * @param ownerBuId 所有者id
     */
    public void setOwnerBuId(Long ownerBuId) {
        this.ownerBuId = ownerBuId;
    }

    /**
     * APP类型
     * @return app_type APP类型
     */
    public String getAppType() {
        return appType;
    }

    /**
     * APP类型
     * @param appType APP类型
     */
    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * 是否有效：0=失效，1=生效，9=冻结
     * @return status 是否有效：0=失效，1=生效，9=冻结
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 是否有效：0=失效，1=生效，9=冻结
     * @param status 是否有效：0=失效，1=生效，9=冻结
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 授权方式:OAUTH2,MUAL
     * @return auth_type 授权方式:OAUTH2,MUAL
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * 授权方式:OAUTH2,MUAL
     * @param authType 授权方式:OAUTH2,MUAL
     */
    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * 对方接口API URL
     * @return api_url 对方接口API URL
     */
    public String getApiUrl() {
        return apiUrl;
    }

    /**
     * 对方接口API URL
     * @param apiUrl 对方接口API URL
     */
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    /**
     * APP KEY
     * @return app_key APP KEY
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * APP KEY
     * @param appKey APP KEY
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    /**
     * 密钥
     * @return app_secret 密钥
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * 密钥
     * @param appSecret 密钥
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    /**
     * 数据传输的数据格式:XML/JSON
     * @return data_format 数据传输的数据格式:XML/JSON
     */
    public String getDataFormat() {
        return dataFormat;
    }

    /**
     * 数据传输的数据格式:XML/JSON
     * @param dataFormat 数据传输的数据格式:XML/JSON
     */
    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * 数据传输的编码格式:UTF-8/GBK
     * @return charset 数据传输的编码格式:UTF-8/GBK
     */
    public String getCharset() {
        return charset;
    }

    /**
     * 数据传输的编码格式:UTF-8/GBK
     * @param charset 数据传输的编码格式:UTF-8/GBK
     */
    public void setCharset(String charset) {
        this.charset = charset;
    }

    /**
     * 签名加密类型:RSA,MD5,HMAC
     * @return sign_method 签名加密类型:RSA,MD5,HMAC
     */
    public String getSignMethod() {
        return signMethod;
    }

    /**
     * 签名加密类型:RSA,MD5,HMAC
     * @param signMethod 签名加密类型:RSA,MD5,HMAC
     */
    public void setSignMethod(String signMethod) {
        this.signMethod = signMethod;
    }

    /**
     * 报文是否加密：0=否，1=是
     * @return data_encrypt 报文是否加密：0=否，1=是
     */
    public Long getDataEncrypt() {
        return dataEncrypt;
    }

    /**
     * 报文是否加密：0=否，1=是
     * @param dataEncrypt 报文是否加密：0=否，1=是
     */
    public void setDataEncrypt(Long dataEncrypt) {
        this.dataEncrypt = dataEncrypt;
    }

    /**
     * 报文加密类型:MD5,HMAC
     * @return data_encrypt_type 报文加密类型:MD5,HMAC
     */
    public String getDataEncryptType() {
        return dataEncryptType;
    }

    /**
     * 报文加密类型:MD5,HMAC
     * @param dataEncryptType 报文加密类型:MD5,HMAC
     */
    public void setDataEncryptType(String dataEncryptType) {
        this.dataEncryptType = dataEncryptType;
    }

    /**
     * 证书文件路径
     * @return auth_file_path 证书文件路径
     */
    public String getAuthFilePath() {
        return authFilePath;
    }

    /**
     * 证书文件路径
     * @param authFilePath 证书文件路径
     */
    public void setAuthFilePath(String authFilePath) {
        this.authFilePath = authFilePath;
    }

    /**
     * 系统参数格式
     * @return sys_param_format 系统参数格式
     */
    public String getSysParamFormat() {
        return sysParamFormat;
    }

    /**
     * 系统参数格式
     * @param sysParamFormat 系统参数格式
     */
    public void setSysParamFormat(String sysParamFormat) {
        this.sysParamFormat = sysParamFormat;
    }

    /**
     * 外部账号
     * @return platform_account_id 外部账号
     */
    public String getPlatformAccountId() {
        return platformAccountId;
    }

    /**
     * 外部账号
     * @param platformAccountId 外部账号
     */
    public void setPlatformAccountId(String platformAccountId) {
        this.platformAccountId = platformAccountId;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人
     * @return create_user_id 创建人
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建人
     * @param createUserId 创建人
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新人
     * @return update_user_id 更新人
     */
    public Long getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 更新人
     * @param updateUserId 更新人
     */
    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", appUkid=").append(appUkid);
        sb.append(", appName=").append(appName);
        sb.append(", platformId=").append(platformId);
        sb.append(", ownerBuId=").append(ownerBuId);
        sb.append(", appType=").append(appType);
        sb.append(", status=").append(status);
        sb.append(", authType=").append(authType);
        sb.append(", apiUrl=").append(apiUrl);
        sb.append(", appKey=").append(appKey);
        sb.append(", appSecret=").append(appSecret);
        sb.append(", dataFormat=").append(dataFormat);
        sb.append(", charset=").append(charset);
        sb.append(", signMethod=").append(signMethod);
        sb.append(", dataEncrypt=").append(dataEncrypt);
        sb.append(", dataEncryptType=").append(dataEncryptType);
        sb.append(", authFilePath=").append(authFilePath);
        sb.append(", sysParamFormat=").append(sysParamFormat);
        sb.append(", platformAccountId=").append(platformAccountId);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AmAppkey other = (AmAppkey) that;
        return (this.getAppUkid() == null ? other.getAppUkid() == null : this.getAppUkid().equals(other.getAppUkid()))
            && (this.getAppName() == null ? other.getAppName() == null : this.getAppName().equals(other.getAppName()))
            && (this.getPlatformId() == null ? other.getPlatformId() == null : this.getPlatformId().equals(other.getPlatformId()))
            && (this.getOwnerBuId() == null ? other.getOwnerBuId() == null : this.getOwnerBuId().equals(other.getOwnerBuId()))
            && (this.getAppType() == null ? other.getAppType() == null : this.getAppType().equals(other.getAppType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAuthType() == null ? other.getAuthType() == null : this.getAuthType().equals(other.getAuthType()))
            && (this.getApiUrl() == null ? other.getApiUrl() == null : this.getApiUrl().equals(other.getApiUrl()))
            && (this.getAppKey() == null ? other.getAppKey() == null : this.getAppKey().equals(other.getAppKey()))
            && (this.getAppSecret() == null ? other.getAppSecret() == null : this.getAppSecret().equals(other.getAppSecret()))
            && (this.getDataFormat() == null ? other.getDataFormat() == null : this.getDataFormat().equals(other.getDataFormat()))
            && (this.getCharset() == null ? other.getCharset() == null : this.getCharset().equals(other.getCharset()))
            && (this.getSignMethod() == null ? other.getSignMethod() == null : this.getSignMethod().equals(other.getSignMethod()))
            && (this.getDataEncrypt() == null ? other.getDataEncrypt() == null : this.getDataEncrypt().equals(other.getDataEncrypt()))
            && (this.getDataEncryptType() == null ? other.getDataEncryptType() == null : this.getDataEncryptType().equals(other.getDataEncryptType()))
            && (this.getAuthFilePath() == null ? other.getAuthFilePath() == null : this.getAuthFilePath().equals(other.getAuthFilePath()))
            && (this.getSysParamFormat() == null ? other.getSysParamFormat() == null : this.getSysParamFormat().equals(other.getSysParamFormat()))
            && (this.getPlatformAccountId() == null ? other.getPlatformAccountId() == null : this.getPlatformAccountId().equals(other.getPlatformAccountId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAppUkid() == null) ? 0 : getAppUkid().hashCode());
        result = prime * result + ((getAppName() == null) ? 0 : getAppName().hashCode());
        result = prime * result + ((getPlatformId() == null) ? 0 : getPlatformId().hashCode());
        result = prime * result + ((getOwnerBuId() == null) ? 0 : getOwnerBuId().hashCode());
        result = prime * result + ((getAppType() == null) ? 0 : getAppType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        result = prime * result + ((getApiUrl() == null) ? 0 : getApiUrl().hashCode());
        result = prime * result + ((getAppKey() == null) ? 0 : getAppKey().hashCode());
        result = prime * result + ((getAppSecret() == null) ? 0 : getAppSecret().hashCode());
        result = prime * result + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        result = prime * result + ((getCharset() == null) ? 0 : getCharset().hashCode());
        result = prime * result + ((getSignMethod() == null) ? 0 : getSignMethod().hashCode());
        result = prime * result + ((getDataEncrypt() == null) ? 0 : getDataEncrypt().hashCode());
        result = prime * result + ((getDataEncryptType() == null) ? 0 : getDataEncryptType().hashCode());
        result = prime * result + ((getAuthFilePath() == null) ? 0 : getAuthFilePath().hashCode());
        result = prime * result + ((getSysParamFormat() == null) ? 0 : getSysParamFormat().hashCode());
        result = prime * result + ((getPlatformAccountId() == null) ? 0 : getPlatformAccountId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        return result;
    }
}