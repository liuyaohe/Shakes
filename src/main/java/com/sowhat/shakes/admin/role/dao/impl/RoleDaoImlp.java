package com.sowhat.shakes.admin.role.dao.impl;


import com.sowhat.shakes.admin.role.dao.RoleDao;
import com.sowhat.shakes.base.dao.AbstractBaseRedisDao;
import com.sowhat.shakes.base.mode.RoleInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by liu on 2016/9/18.
 */
@Repository("roleDao")
public class RoleDaoImlp extends AbstractBaseRedisDao<String,RoleInfo> implements RoleDao {
    private static Log log = LogFactory.getLog(RoleDaoImlp.class);

    public boolean saveRoleInfo(final RoleInfo roleInfo) {
        boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {

            public Boolean doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer keySerializer = getKeyRedisSerializer();
                RedisSerializer valueSerializer = getValueRedisSerializer();
                byte[] key = keySerializer.serialize("roleInfo:"+roleInfo.getSeq());
                byte[] value = valueSerializer.serialize(roleInfo);
                redisConnection.setNX(key,value);
                return true;
            }
        });
        return result;
    }

    public boolean updateRoleInfo(final RoleInfo roleInfo) {
        Boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {

            public Boolean doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer keySerializer = getKeyRedisSerializer();
                RedisSerializer valueSerializer = getValueRedisSerializer();
                byte[] key = keySerializer.serialize("roleInfo:"+roleInfo.getSeq());
                byte[] value = valueSerializer.serialize(roleInfo);
                redisConnection.set(key,value);
                return true;
            }
        });
        return result;
    }


    public List<RoleInfo> getRoleInfos(RoleInfo roleInfo) {
        return null;
    }


    public RoleInfo getRoleInfo( final String key) {
        RoleInfo roleInfo = redisTemplate.execute(new RedisCallback<RoleInfo>() {

            public RoleInfo doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer keySerializer = getKeyRedisSerializer();
                RedisSerializer valueSerializer = getValueRedisSerializer();
                byte[] _key = keySerializer.serialize("roleInfo:"+key);
                byte[] value = redisConnection.get(_key);
                if(value == null){
                    return null;
                }

                return (RoleInfo)valueSerializer.deserialize(value);
            }
        });
        return roleInfo;
    }


    public void delRoleInfo(RoleInfo roleInfo) {

    }


    public void delRoleInfos(List<RoleInfo> roleInfos) {

    }
}
